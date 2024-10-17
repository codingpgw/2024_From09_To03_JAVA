package com.pcwk.ehr.projectTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

	private static List<MovieList> movieInfos;
	public FileHandler() {
		movieInfos = new ArrayList<>();
	}
	
	public static void loadMembers(List<Member> members) {
		boolean managerId;
		try (BufferedReader reader = new BufferedReader(new FileReader("members.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(","); // 파일에서 쉼표로 구분된 데이터를 읽기
				String loginId = data[0];
				String loginPass = data[1];
				String name = data[2];
				managerId = Boolean.parseBoolean(data[3]);
				int myWallet = Integer.parseInt(data[4]);
				int userAge = Integer.parseInt(data[5]);
				Member member = new Member(loginId, loginPass, name, managerId, myWallet,userAge);
				members.add(member); // 읽어온 데이터를 바탕으로 멤버 객체를 생성하고 리스트에 추가
			}
		} catch (IOException e) {
			System.out.println("파일에서 회원 정보를 불러오는 중 오류가 발생했습니다.");
		}
		
	}

	public static void saveMember(Member member) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt", true))) {
			writer.write(member.id + "," + member.pass + "," + member.name + "," + member.manager + "," + member.wallet + "," + member.age);
			writer.newLine(); //회원가입된 유저의 정보를 형식에 따라 파일에 저장
		} catch (IOException e) {
			System.out.println("회원 정보를 파일에 저장하는 중 오류가 발생했습니다.");
		}
	}
	public static void deleteMemberFromFile(Member memberIdToDelete) { //회원 탈퇴 시 파일에 해당 유저의 정보 삭제 후 덮어쓰기
		List<Member> members = new ArrayList<>();

		// 1. 파일에서 모든 데이터를 읽어오기
		try (BufferedReader reader = new BufferedReader(new FileReader("members.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				// 삭제할 멤버 ID가 아닌 경우에만 리스트에 추가
				String[] data = line.split(",");
				String loginId = data[0];
				String loginPass = data[1];
				String name = data[2];
				boolean manager = Boolean.parseBoolean(data[3]);
				int wallet = Integer.parseInt(data[4]);
				int age = Integer.parseInt(data[5]);

				// 삭제할 멤버 ID와 일치하지 않는 경우에만 리스트에 추가
				if (!loginId.equals(memberIdToDelete.id)) {
					members.add(new Member(loginId, loginPass, name, manager, wallet, age));
				}
			}
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
		}

		// 2. 파일을 새로 작성하여 업데이트된 멤버 리스트를 저장
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt"))) {
			for (Member member : members) {
				writer.write(member.id + "," + member.pass + "," + member.name + "," + member.manager + ","
						+ member.wallet + "," + member.age); //해당 형태로 저장
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("파일을 저장하는 중 오류가 발생했습니다.");
		}
	}
	public static void loadMovies(List<MovieList> movies) {
		DateTimeFormatter movieFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try (BufferedReader reader = new BufferedReader(new FileReader("movies.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(","); // 파일에서 쉼표로 구분된 데이터를 읽기
				String movieName = data[0];
				String dateString = data[1];
				String supervision = data[2];
				int ageLimit = Integer.parseInt(data[3]);
				double rating = Double.parseDouble(data[4]);
				
				LocalDate date = LocalDate.parse(dateString, movieFormatter);
				//날짜 정보를 불러오기 위한 형변환
				MovieList movieInfo = new MovieList(movieName, date, supervision, ageLimit, rating);
				movieInfos.add(movieInfo); // 읽어온 데이터를 바탕으로 멤버 객체를 생성하고 리스트에 추가
			}
		} catch (IOException e) {
			System.out.println("파일에서 영화 정보를 불러오는 중 오류가 발생했습니다.");
		}
	}

	public static void saveMovies() { // Changed to save all movies
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("movies.txt"))) {
	        for (MovieList movie : movieInfos) {
	            writer.write(movie.movieName + "," + movie.date + "," + movie.supervision + "," +
	                    movie.ageLimit + "," + movie.rating + ",");
	                    
	            // Save seat states (row-wise)
	            for (char[] row : movie.seats) {
	                for (char seat : row) {
	                    writer.write(seat); // Write seat character
	                }
	                writer.write(";"); // Row delimiter
	            }
	            writer.newLine();
	        }
	    } catch (IOException e) {
	        System.out.println("영화 정보를 파일에 저장하는 중 오류가 발생했습니다.");
	    }
	}
	
	public static void loadReservations() { //각 영화의 좌석 정보를 저장
	    try (BufferedReader reader = new BufferedReader(new FileReader("reservations.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] data = line.split(",");
	            String memberId = data[0];
	            String movieName = data[1];
	            int row = Integer.parseInt(data[2]);
	            int col = Integer.parseInt(data[3]);

	            // 해당 영화와 좌석 정보를 업데이트
	            MovieList movie = callMovieData(movieName);
	            if (movie != null) {
	                movie.seats[row-1][col-1] = '■'; //배열 0,0 시작을 1,1로 표시
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("예매 정보를 파일에서 불러오는 중 오류가 발생했습니다.");
	    }
	}
	public static void saveReservation(Member member, MovieList movie, int row, int col) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("reservations.txt", true))) {
	        writer.write(member.id + "," + movie.movieName + "," + row + "," + col);
	        writer.newLine(); //당사자 확인 및 좌석 저장 기능
	    } catch (IOException e) {
	        System.out.println("예매 정보를 파일에 저장하는 중 오류가 발생했습니다.");
	    }
	}
	public static MovieList callMovieData(String movieName) { //movieInfo의 정보를 읽어오는 메소드
		for (int i = 0; i < movieInfos.size(); i++) {
			MovieList movieInfo = movieInfos.get(i);

			if (movieInfo.movieName.equals(movieName)) {
				return movieInfo;
			}
		}
		return null;
	}
}
