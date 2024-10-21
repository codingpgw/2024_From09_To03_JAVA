package com.pcwk.ehr.movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pcwk.ehr.cmn.UI;
import com.pcwk.ehr.member.MemberDao;
import com.pcwk.ehr.member.MemberVO;

public class MovieDaoMain {
	private MemberDao memberDao;
	private MovieDao movieDao;
	private DateTimeFormatter formatter;
	private Scanner sc;

	public MovieDaoMain() {
		memberDao = new MemberDao();
		movieDao = new MovieDao();
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		sc = new Scanner(System.in);
	}

	public void displayMovies() {
		movieDao.readFile("movie.csv");
		System.out.println("영화 제목  |       개봉일    |  감독  | 연령 제한  |  평점");
		for (MovieVO movieInfo : movieDao.movieList) {
			System.out.printf("%s |   %s   |  %s  |  %2d   |  %.2f\n", movieInfo.getMovieName(),
					movieInfo.getDate().format(formatter), movieInfo.getSupervision(), movieInfo.getAgeLimit(),
					movieInfo.getRating());
		}
	}

	public void searchMovie() {
		movieDao.readFile("movie.csv");
		System.out.print("검색하실 영화를 입력해주세요. > ");
		String searchMovie = sc.nextLine().trim();

		for (MovieVO movieInfo : movieDao.movieList) {
			if (searchMovie.equals(movieInfo.getMovieName()) || searchMovie.equals(movieInfo.getSupervision())) {

				System.out.println("영화 제목  |       개봉일    |  감독  | 연령 제한  |  평점");
				System.out.printf("%s |   %s   |  %s  |  %2d   |  %.2f\n", movieInfo.getMovieName(),
						movieInfo.getDate().format(formatter), movieInfo.getSupervision(), movieInfo.getAgeLimit(),
						movieInfo.getRating());
			}
		}
	}

	public void bookMovie(MemberVO loginedMember) {
		movieDao.readFile("movie.csv");
		displayMovies();
		MovieVO selectedMovie = null;
		try {
			System.out.print("관람하실 영화의 제목을 입력해주세요. > ");
			String choiceMovie = sc.nextLine().trim();
			for (MovieVO movieInfo : movieDao.movieList) {
				if (movieInfo.getMovieName().equals(choiceMovie)) {
					selectedMovie = movieInfo;
					break;
				}
			}
			if (selectedMovie == null) {
				System.out.println("영화를 찾을 수 없습니다.");
				return;
			}
			if (loginedMember.getAge() < selectedMovie.getAgeLimit()) {
				System.out.println("적정 연령이 아닙니다.");
				return;
			}
			System.out.println("좌석을 선택해 주세요.");
			selectedMovie.displaySeats();
			System.out.print("원하시는 좌석 번호를 선택해주세요 (예: 2 2) ");
			int row = sc.nextInt();
			int col = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

			int ticketPrice = loginedMember.getAge() < 18 ? 8000 : 12000;
			if (loginedMember.getWallet() >= ticketPrice) {
				selectedMovie.bookSeat(row - 1, col - 1);
				loginedMember.setWallet(loginedMember.getWallet() - ticketPrice);
				System.out.printf("%s 영화를 예매하셨습니다. 현재 잔액은 %d원입니다.\n", selectedMovie.getMovieName(),
						loginedMember.getWallet());
				loginedMember.addReservation(selectedMovie);
				saveReservation(loginedMember, selectedMovie, row, col);
				selectedMovie.displaySeats();
				movieDao.doUpdate(selectedMovie);
				memberDao.doUpdate(loginedMember);
			} else {
				System.out.println("잔액이 부족하여 예매할 수 없습니다.");
			}
		} catch (NullPointerException e) {
			System.out.println("영화 제목을 정확히 입력해주세요.");
		}
	}

	public void verifyInfo(MemberVO loginedMember) {
		loadReservations();
		System.out.print("메뉴 선택 > ");
		String personalMenu = sc.nextLine();
		if (personalMenu.equals("5")) {
			System.out.println("개인 정보 확인 창을 종료하겠습니다.");
		} else if (personalMenu.equals("1")) {
			System.out.print("비밀번호 확인 : ");
			String passCheck = sc.nextLine().trim();

			MemberVO changeMemberData = null;

			for (MemberVO member : memberDao.members) { // passCheck이 저장된 번호가 같은 시 정보 호출
				if (loginedMember != null && passCheck.equals(loginedMember.getPass())) {
					changeMemberData = loginedMember;
					break;
				}
			}

			if (changeMemberData != null) {
				System.out.println("변경하실 정보를 골라주세요.");
				UI.displayChangeMenu();
				System.out.print("메뉴 선택 > ");
				String changeMenu = sc.nextLine();
				if (changeMenu.equals("1") || changeMenu.trim().equals("이름")) {
					System.out.print("새로운 이름 입력 : ");
					String newName = sc.nextLine().trim();
					// 새로 입력받은 정보를 가져온 changeMemberData에 입력
					changeMemberData.setName(newName);
					System.out.println("변경이 완료되었습니다.");
					memberDao.doUpdate(changeMemberData);
				} else if (changeMenu.equals("2") || changeMenu.trim().equals("비밀번호")) {
					System.out.print("새로운 비밀번호 입력 : ");
					String newPassword = sc.nextLine().trim();

					changeMemberData.setPass(newPassword);
					memberDao.doUpdate(changeMemberData);
					System.out.println("변경이 완료되었습니다.");
				} else {
					System.out.println("유효하지 않은 명령입니다.");
				}
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}

		} else if (personalMenu.equals("2")) {
			// 계정마다 저장된 예약정보 호출
			List<MovieVO> reservations = loginedMember.getReservations();
			if (reservations.isEmpty()) { // isEmpty 함수를 통해 예약 정보 null 여부 확인
				System.out.println("예매한 영화가 없습니다.");
			} else {
				System.out.println("예매한 영화 목록:");
				for (MovieVO reservation : reservations) {
					System.out.printf("영화: %s | 개봉일: %s | 감독: %s\n", reservation.getMovieName(),
							reservation.getDate().format(formatter), reservation.getSupervision());
				}
				System.out.print("예매 취소할 영화의 제목을 입력해주세요. (취소하지 않으려면 엔터): ");
				String cancelMovie = sc.nextLine().trim();
				if (!cancelMovie.isEmpty()) {
					MovieVO movieToCancel = null;
					for (MovieVO reservation : reservations) {
						if (reservation.getMovieName().equals(cancelMovie)) {
							movieToCancel = reservation;
							break;
						} // 취소를 입력한 제목의 영화가 있는지 확인
					}
					if (movieToCancel != null) {
						loginedMember.cancelReservation(movieToCancel);
						if (loginedMember.getAge() < 18) {
							loginedMember.setWallet(loginedMember.getWallet() + 8000);
						} else {
							loginedMember.setWallet(loginedMember.getWallet() + 12000);
						} // 환불
						System.out.printf("%s 영화의 예매가 취소되었습니다. 현재 잔액은 %d원입니다.\n", movieToCancel.getMovieName(),
								loginedMember.getWallet());

						memberDao.doUpdate(loginedMember);
						deleteReservations(cancelMovie);

					} else {
						System.out.println("입력한 영화가 예매 목록에 없습니다.");
					}
				}
			}
		} else if (personalMenu.equals("3")) {
			System.out.printf("%s 고객님은 현재 %d원을 보유 중입니다.\n", loginedMember.getName(), loginedMember.getWallet());
			UI.displayChargeMenu();

			System.out.print("메뉴 선택 > ");
			String walletMenu = sc.nextLine();

			if (walletMenu.equals("1") || walletMenu.equals("충전")) {
				System.out.println("충전하실 금액을 입력해주세요.");
				System.out.print("금액 > ");
				String moneyLoad = sc.nextLine();

				try {
					int amount = Integer.parseInt(moneyLoad);
					loginedMember.setWallet(loginedMember.getWallet() + amount);
					System.out.println("충전이 완료되었습니다.");
					memberDao.doUpdate(loginedMember);
				} catch (NumberFormatException e) {
					System.out.println("충전 금액이 정수가 아닙니다.");
				}

			} else if (walletMenu.equals("2") || walletMenu.equals("나가기")) {
				System.out.println("개인 정보 메뉴로 돌아갑니다.");
			} else {
				System.out.println("유효하지 않은 명령입니다.");
			}

		} else if (personalMenu.equals("4")) {
			System.out.println("회원 탈퇴를 하시겠습니까?");
			System.out.println("1.네 \t 2.아니오");
			System.out.print("메뉴 선택 > ");
			String WithdrawalChoice = sc.nextLine();
			if (WithdrawalChoice.equals("2")) {
				System.out.println("기존 메뉴창으로 돌아갑니다.");
			} else if (WithdrawalChoice.equals("1")) {
				MemberVO withdrawal = memberDao.doSelectOne(loginedMember);
				// 멤버 정보를 현재 로그인된 ID 정보로 불러낸 후 삭제 후 파일 덮어쓰기 메소드
				memberDao.doDelete(withdrawal);
				loginedMember = null;
				System.out.println("회원 탈퇴가 완료되었습니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				System.exit(0);
			} else {
				System.out.println("유효하지 않은 명령입니다.");
			}
		}
	}

	public void managerMod() {
//    		if (loginedMember != null && loginedMember.isManager()) { // 해당 유저의 정보가 true일 경우 이용가능
		UI.displayManagerMenu();
		System.out.print("메뉴 선택 > ");
		int managerMenu = sc.nextInt();
		sc.nextLine();
		switch (managerMenu) {
		case 1:
			System.out.print("영화 제목 : ");
			String title = sc.nextLine().trim();
			System.out.print("출시일(예: 2024-10-11) : ");
			String date = sc.nextLine().trim();
			System.out.print("영화 감독 : ");
			String supervision = sc.nextLine().trim();
			System.out.print("연령 제한 : ");
			String ageLimit = sc.nextLine().trim();
			System.out.print("평점 : ");
			String rating = sc.nextLine().trim();

			LocalDate releaseDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			// 입력받은 영화의 정보를 movieInfo 리스트에 저장
			MovieVO movieInfo = new MovieVO(title, releaseDate, supervision, Integer.parseInt(ageLimit),
					Double.parseDouble(rating));
			movieDao.doSave(movieInfo);
			movieDao.writeFile("movie.csv");
			System.out.println("영화가 등록되었습니다.");
		case 2:
			System.out.print("삭제하실 영화의 제목을 입력해주세요 > ");
			String deleteInfo = sc.nextLine().trim();

			MovieVO foundMovie = callMovieData(deleteInfo);

			if (foundMovie == null) {
				System.out.printf("%s의 제목인 영화는 존재하지 않습니다\n", deleteInfo);
				break;
			}
			// 제목이 일치하는 영화의 정보 삭제후 갱신
			movieDao.doDelete(foundMovie);
			System.out.printf("%s 영화가 목록에서 삭제되었습니다\n", deleteInfo);

		case 3:
			System.out.println("------유저 목록------");
			System.out.println("이름 \t ID \t 소지금");

			for (MemberVO member : memberDao.members) {
				if (member.isManager() == false) {
					System.out.printf("%s \t %s \t %d \t %d\n", member.getId(), member.getName(), member.getWallet(),
							member.getAge());
				}
			}
		case 4:
			System.out.println("관리자 창을 종료하겠습니다.");
			break;
		default:
			System.out.println("유효하지 않은 명령입니다.");
			break;
		}

	}

	public void saveReservation(MemberVO member, MovieVO movie, int row, int col) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("reservations.csv", true))) {
			writer.write(member.getId() + "," + movie.getMovieName() + "," + row + "," + col);
			writer.newLine();
		} catch (IOException e) {
			System.out.println("예매 정보를 파일에 저장하는 중 오류가 발생했습니다.");
		}
	}

	public void loadReservations() {
		try (BufferedReader reader = new BufferedReader(new FileReader("reservations.csv"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				String movieName = data[1];
				int row = Integer.parseInt(data[2]);
				int col = Integer.parseInt(data[3]);

				MovieVO movie = callMovieData(movieName);
				if (movie != null) {
					movie.getSeats()[row - 1][col - 1] = '■';
				}
			}
		} catch (IOException e) {
			System.out.println("예매 정보를 파일에서 불러오는 중 오류가 발생했습니다.");
		}
	}

	public void deleteReservations(String memberIdToDelete) {
		List<String> remainingReservations = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader("reservations.csv"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				String memberId = data[0];
				String movieName = data[1];
				int row = Integer.parseInt(data[2]);
				int col = Integer.parseInt(data[3]);

				if (memberId.equals(memberIdToDelete)) {
					MovieVO movie = callMovieData(movieName);
					if (movie != null) {
						movie.getSeats()[row - 1][col - 1] = '□';
					}
				} else {
					remainingReservations.add(line);
				}
			}
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("reservations.csv"))) {
			for (String reservation : remainingReservations) {
				writer.write(reservation);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("파일을 쓰는 중 오류가 발생했습니다.");
		}
	}

	private MovieVO callMovieData(String movieName) {
		for (MovieVO movie : movieDao.movieList) {
			if (movie.getMovieName().equals(movieName)) {
				return movie;
			}
		}
		return null;
	}
}