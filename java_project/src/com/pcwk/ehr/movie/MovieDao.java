package com.pcwk.ehr.movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.ehr.cmn.DTO;
import com.pcwk.ehr.cmn.WorkDiv;

public class MovieDao implements WorkDiv<MovieVO> {
	public static List<MovieVO> movieList = new ArrayList<MovieVO>();
	private static MovieVO m = new MovieVO();
    private static final String MOVIE_FILE_PATH = "movie.csv";
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    @Override
    public int doSave(MovieVO vo) {
        movieList.add(vo);
        return writeFile(MOVIE_FILE_PATH);
    }

    @Override
    public int doUpdate(MovieVO movie) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getMovieName().equalsIgnoreCase(movie.getMovieName())) {
                movieList.set(i, movie);
                return writeFile(MOVIE_FILE_PATH);
            }
        }
        return 0; // 업데이트 실패 시 0 반환
    	
//    	 try (BufferedWriter writer = new BufferedWriter(new FileWriter("movie.csv"))) {
//    	        for (MovieVO movieInfo : movieList) {
//    	            String movieData = String.format("%s,%s,%s,%d,%.2f,%s\n"+m.getSeats(),
//    	                    movieInfo.getMovieName(),
//    	                    movieInfo.getDate().toString(),
//    	                    movieInfo.getSupervision(),
//    	                    movieInfo.getAgeLimit(),
//    	                    movieInfo.getRating(),
//    	                    movieInfo.seatsToString()); // 좌석 정보를 문자열로 추가합니다.
//    	            writer.write(movieData);
//    	        }
//    	        return writeFile(MOVIE_FILE_PATH);
//    	    } catch (IOException e) {
//    	        System.out.println("영화 정보를 파일에 저장하는 중 오류가 발생했습니다.");
//    	        return 0;
//    	    }
//    	 
    	 
    }

    @Override
    public int doDelete(MovieVO vo) {
        MovieVO movieToDelete = doSelectOne(vo);
        if (movieToDelete != null) {
            movieList.remove(movieToDelete);
            return writeFile(MOVIE_FILE_PATH);
        }
        return 0; // 삭제 실패 시 0 반환
    }

    @Override
    public MovieVO doSelectOne(MovieVO vo) {
        for (MovieVO movie : movieList) {
            if (movie.getMovieName().equalsIgnoreCase(vo.getMovieName())) {
                return movie;
            }
        }
        return null; // 검색 실패 시 null 반환
    }

    @Override
    public List<MovieVO> doRetrieve(DTO dto) {
        return movieList; // 모든 영화 목록을 반환
    }

    @Override
    public int writeFile(String path) {
    	int flag = 0;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (MovieVO movie : movieList) {
                String movieData = movie.toFileFormat();
                movieData = movieData.trim(); // 데이터의 공백 제거
            	// 빈 줄이면 넘어가기
            	if (movieData.isEmpty()) {
            		continue; // 빈 줄을 무시
            	}    	
                
                bw.write(movieData);
                bw.newLine();
            }
            flag=1;
        } catch (IOException e) {
            System.out.println("파일을 저장하는 도중 오류가 발생했습니다: " + e.getMessage());
        }
        return flag;
    }
    
    public MovieVO stringToMovie(String data) {
    	MovieVO out = null;
    	data = data.trim(); // 데이터의 공백 제거
    	// 빈 줄이면 넘어가기
    	if (data.isEmpty()) {
    		return null; // 빈 줄을 무시
    	}    	
    	String movieStr = data;
    	String[] movieArr = movieStr.split(",");
    	if (data.length() < 5) {
    	    // 데이터가 부족할 때 처리 (예: 에러 메시지 출력)
    		System.out.println("잘못된 형식");
    	    return null;
    	}
    	String movieName = movieArr[0];
    	LocalDate date;
    	String supervision = movieArr[2];
    	int ageLimit;
    	double rating;
    	
    	try {
    		date = LocalDate.parse(movieArr[1]);
    		ageLimit = Integer.parseInt(movieArr[3]);
    		rating = Double.parseDouble(movieArr[4]);
    	}catch(java.lang.ArrayIndexOutOfBoundsException e) {
    		System.out.println(e.getMessage());
    		return null;
    	}
    	
    	out = new MovieVO(movieName,date,supervision,ageLimit,rating);
    	return out;
    }
    
    @Override
    public int readFile(String path) {
        movieList.clear(); // 기존 데이터를 초기화
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
            	 path = path.trim(); // 데이터의 공백 제거
                 // 빈 줄이면 넘어가기
                 if (path.isEmpty()) {
                     continue; // 빈 줄을 무시
                 }
                MovieVO movie = stringToMovie(line);
                 // 좌석 데이터를 복원합니다.
               
                movieList.add(movie);
            }
            return 1; // 파일 로드 성공 시 1 반환
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
            return 0; // 파일 로드 실패 시 0 반환
        }
       
    }
    

}
