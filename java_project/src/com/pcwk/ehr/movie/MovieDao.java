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
    private static final String MOVIE_FILE_PATH = "movie.csv";
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    @Override
    public int doSave(MovieVO vo) {
        movieList.add(vo);
        return writeFile(MOVIE_FILE_PATH);
    }

    @Override
    public int doUpdate(MovieVO vo) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getMovieName().equalsIgnoreCase(vo.getMovieName())) {
                movieList.set(i, vo);
                return writeFile(MOVIE_FILE_PATH);
            }
        }
        return 0; // 업데이트 실패 시 0 반환
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
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (MovieVO movie : movieList) {
                String movieData = String.format("%s,%s,%s,%d,%.2f",
                        movie.getMovieName(),
                        movie.getDate().format(dateFormatter),
                        movie.getSupervision(),
                        movie.getAgeLimit(),
                        movie.getRating());
                bw.write(movieData);
                bw.newLine();
            }
            return 1; // 파일 저장 성공 시 1 반환
        } catch (IOException e) {
            System.out.println("파일을 저장하는 도중 오류가 발생했습니다: " + e.getMessage());
            return 0; // 파일 저장 실패 시 0 반환
        }
    }

    @Override
    public int readFile(String path) {
        movieList.clear(); // 기존 데이터를 초기화
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] movieData = line.split(",");
                String movieName = movieData[0];
                LocalDate date = LocalDate.parse(movieData[1], dateFormatter);
                String supervision = movieData[2];
                int ageLimit = Integer.parseInt(movieData[3]);
                double rating = Double.parseDouble(movieData[4]);
                MovieVO movie = new MovieVO(movieName, date, supervision, ageLimit, rating);
                movieList.add(movie);
            }
            return 1; // 파일 로드 성공 시 1 반환
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
            return 0; // 파일 로드 실패 시 0 반환
        }
    }

}
