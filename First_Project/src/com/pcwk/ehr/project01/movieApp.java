package com.pcwk.ehr.project01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class movieApp {
	private List<Member> members;
	private Member loginedMember;
	private List<MovieList> movieInfos;

	public movieApp() {
		members = new ArrayList<>();
		movieInfos = new ArrayList<>();
		loginedMember = null;
	}

	public void run() {
		System.out.println("========프로그램 시작========");
		Scanner sc = new Scanner(System.in);
		boolean managerId = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		makeManagerId();

		while (true) {
			int myWallet = 0;

			System.out.println("┌────────────────────────────────────────┐");
			System.out.println("│    1.로그인   2.회원가입  3.사이트로 이동  4.종료   │ ");
			System.out.println("└────────────────────────────────────────┘");
			System.out.print("메뉴 선택 > ");
			String menu = sc.nextLine().trim();
			try (BufferedReader reader = new BufferedReader(new FileReader("members.txt"))) {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] data = line.split(","); // 파일에서 쉼표로 구분된 데이터를 읽습니다.
					String loginId = data[0];
					String loginPass = data[1];
					String name = data[2];
					managerId = Boolean.parseBoolean(data[3]);
					myWallet = Integer.parseInt(data[4]);

					Member member = new Member(loginId, loginPass, name, managerId, myWallet);
					members.add(member); // 읽어온 데이터를 바탕으로 멤버 객체를 생성하고 리스트에 추가합니다.
				}
			} catch (IOException e) {
				System.out.println("파일에서 회원 정보를 불러오는 중 오류가 발생했습니다.");
			}

			if (menu.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu.equals("2")) {
				String loginId = null;
				if (isLogined()) {
					System.out.println("로그아웃 후 이용해주세요.");
					continue;
				}
				System.out.printf("이름 : ");
				String name = sc.nextLine();
				while (true) {
					System.out.print("로그인 아이디 : ");
					loginId = sc.nextLine().trim();

					if (isLoginIdDup(loginId) == false) {
						System.out.println("이미 사용중인 아이디입니다.");
						continue;
					}

					System.out.printf("%s은(는) 사용가능한 아이디입니다.%n", loginId);
					break;
				}
				String loginPass = null;
				while (true) {
					System.out.printf("로그인 비밀번호 : ");
					loginPass = sc.nextLine().trim();
					System.out.printf("로그인 비밀번호 확인 : ");
					String passCheck = sc.nextLine().trim();

					if (loginPass.equals(passCheck) == false) {
						System.out.println("비밀번호가 다릅니다.");
						continue;
					}
					break;
				}
				Member member = new Member(loginId, loginPass, name, managerId, myWallet);
				members.add(member);
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt", true))) {
					writer.write(loginId + "," + loginPass + "," + name + "," + managerId + "," + myWallet);
					writer.newLine();
				} catch (IOException e) {
					System.out.println("회원 정보를 파일에 저장하는 중 오류가 발생했습니다.");
				}

				System.out.printf("%s 회원님 환영합니다.%n", name);
				continue;
			} else if (menu.equals("1")) {
				if (isLogined()) {
					System.out.println("이미 로그인 되어 있습니다.");
					continue;
				}

				System.out.printf("아이디 : ");
				String loginId = sc.nextLine().trim();
				System.out.printf("비밀번호 : ");
				String loginPass = sc.nextLine().trim();

				Member member = getMemberByLoginId(loginId);

				if (member == null) {
					System.out.printf("%s은(는) 존재하지 않는 아이디입니다.\n", loginId);
					continue;
				}
				if (loginPass.equals(member.pass) == false) {
					System.out.println("비밀번호를 확인해주세요.");
					continue;
				}
				this.loginedMember = member;
				System.out.printf("%s님 환영합니다.%n", member.name);

			} else if (menu.equals("3")) {
				if (isLogined() == false) {
					System.out.println("로그인 후 이용해 주세요.");
					continue;
				}
				while (true) {
					System.out.println("┌───────────────────────────────────────────────────────────────────┐");
					System.out.println("│ 1.상영중인 영화 조회  2.영화 검색  3.영화 예매  4.개인 정보 확인  5.관리자 모드  6.로그아웃 │");
					System.out.println("└───────────────────────────────────────────────────────────────────┘");
					System.out.print("메뉴 선택 > ");
					String internalMenu = sc.nextLine().trim();

					if (internalMenu.equals("6")) {
						if (isLogined()) {
							System.out.println("로그아웃 되었습니다.");
							this.loginedMember = null;
							break;
						}
						System.out.println("로그인 상태가 아닙니다.");
					} else if (internalMenu.equals("1")) {
						for (MovieList movieInfo : movieInfos) {
							System.out.printf("%s \t %s \t %s \t %d \t %.2f%n", movieInfo.movieName,
									movieInfo.date.format(formatter), movieInfo.supervision, movieInfo.ageLimit,
									movieInfo.rating);
						}

					} else if (internalMenu.equals("2")) {

					} else if (internalMenu.equals("3")) {

					} else if (internalMenu.equals("4")) {
						System.out.println("┌───────────────────────────────────────────────────────┐");
						System.out.println("│ 1.개인 정보 수정  2.예매한 영화 확인  3.나의 지갑  4.회원 탈퇴  5.나가기   │");
						System.out.println("└───────────────────────────────────────────────────────┘");
						System.out.print("메뉴 선택 > ");
						String personalMenu = sc.nextLine();
						if (personalMenu.equals("5")) {
							System.out.println("개인 정보 확인 창을 종료하겠습니다.");
						} else if (personalMenu.equals("1")) {
							System.out.print("비밀번호 확인 : ");
							String passCheck = sc.nextLine().trim();

							Member changeMemberData = null;

							for (Member member : members) {
								if (loginedMember != null && passCheck.equals(loginedMember.pass)) {
									changeMemberData = loginedMember;
									break;
								}
							}

							if (changeMemberData != null) {
								System.out.println("변경하실 정보를 골라주세요.");
								System.out.println("┌────────────────┐");
								System.out.println("│ 1.이름  2.비밀번호 │");
								System.out.println("└────────────────┘");
								System.out.print("메뉴 선택 > ");
								String changeMenu = sc.nextLine();
								if (changeMenu.equals("1") || changeMenu.trim().equals("이름")) {
									System.out.print("새로운 이름 입력 : ");
									String newName = sc.nextLine().trim();

									changeMemberData.name = newName;
									System.out.println("변경이 완료되었습니다.");
								} else if (changeMenu.equals("2") || changeMenu.trim().equals("비밀번호")) {
									System.out.print("새로운 비밀번호 입력 : ");
									String newPassword = sc.nextLine().trim();

									changeMemberData.pass = newPassword;
									System.out.println("변경이 완료되었습니다.");
								} else {
									System.out.println("유효하지 않은 명령입니다.");
								}
							} else {
								System.out.println("비밀번호가 일치하지 않습니다.");
							}

						} else if (personalMenu.equals("2")) {

						} else if (personalMenu.equals("3")) {
							System.out.printf("%s 고객님은 현재 %d원을 보유 중입니다.\n", loginedMember.name, loginedMember.wallet);
							System.out.println("┌────────────────┐");
							System.out.println("│ 1.충전  2.나가기  │");
							System.out.println("└────────────────┘");

							System.out.print("메뉴 선택 > ");
							String walletMenu = sc.nextLine();

							if (walletMenu.equals("1") || walletMenu.equals("충전")) {
								System.out.println("충전하실 금액을 입력해주세요.");
								System.out.print("금액 > ");
								String moneyLoad = sc.nextLine();

								try {
									Integer.parseInt(moneyLoad);
									loginedMember.wallet += Integer.parseInt(moneyLoad);
									System.out.println("충전이 완료되었습니다.");
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
								break;
							} else if (WithdrawalChoice.equals("1")) {
								Member Withdrawal = callMemberData(loginedMember.id);
								deleteMemberFromFile(Withdrawal);
								loginedMember = null;
								System.out.println("회원 탈퇴가 완료되었습니다.");
								System.out.println("프로그램을 다시 실행해주세요.");
								System.exit(0);
							} else {
								System.out.println("유효하지 않은 명령입니다.");
							}
						} else {
							System.out.println("유효하지 않은 명령입니다.");
						}
					} else if (internalMenu.equals("5")) {
						if (loginedMember != null && loginedMember.manager) {
							System.out.println("┌───────────────────────────────────────────────────┐");
							System.out.println("│ 1.영화 목록 등록  2.영화 목록 삭제  3.유저 계정 관리  4.나가기  │");
							System.out.println("└───────────────────────────────────────────────────┘");
							System.out.print("메뉴 선택 > ");
							int managerMenu = sc.nextInt();
							sc.nextLine();
							switch (managerMenu) {
							case 1:
								System.out.print("영화 제목 : ");
								String title = sc.nextLine();
								System.out.print("출시일(예: 2024-10-11) : ");
								String date = sc.nextLine();
								System.out.print("영화 감독 : ");
								String supervision = sc.nextLine();
								System.out.print("연령 제한 : ");
								String ageLimit = sc.nextLine();
								System.out.print("평점 : ");
								String rating = sc.nextLine();

								LocalDate releaseDate = LocalDate.parse(date,
										DateTimeFormatter.ofPattern("yyyy-MM-dd"));

								MovieList movieInfo = new MovieList(title, releaseDate, supervision,
										Integer.parseInt(ageLimit), Double.parseDouble(rating));
								movieInfos.add(movieInfo);

								System.out.println("영화가 등록되었습니다.");
								continue;
							case 2:
								System.out.print("삭제하실 영화의 제목을 입력해주세요 > ");
								String deleteInfo = sc.nextLine().trim();

								MovieList foundMovie = callMovieData(deleteInfo);

								if (foundMovie == null) {
									System.out.printf("%s의 제목인 영화는 존재하지 않습니다\n", deleteInfo);
									continue;
								}

								movieInfos.remove(foundMovie);
								System.out.printf("%s 영화가 목록에서 삭제되었습니다\n", deleteInfo);
								continue;

							case 3:
								System.out.println("------유저 목록------");
								System.out.println("이름 \t ID \t 소지금");
								for (Member member : members) {
									System.out.printf("%s \t %s \t %d\n", member.id, member.name, member.wallet);
								}
								continue;
							case 4:
								System.out.println("관리자 창을 종료하겠습니다.");
								break;
							default:
								System.out.println("유효하지 않은 명령입니다.");
								break;
							}
						} else {
							System.out.println("관리자 계정이 아닙니다.");
						}
					}
				}

			} else {
				System.out.println("유효하지 않은 명령입니다.");
			}

		}

	}

	private MovieList callMovieData(String movieName) {
		for (int i = 0; i < movieInfos.size(); i++) {
			MovieList movieInfo = movieInfos.get(i);

			if (movieInfo.movieName.equals(movieName)) {
				return movieInfo;
			}
		}
		return null;
	}

	private Member callMemberData(String id) {
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);

			if (member.id.equals(id)) {
				return member;
			}
		}
		return null;
	}

	private void makeManagerId() {
		members.add(new Member("manager", "1234", "manager", true, 0));
		movieInfos.add(new MovieList("범죄도시", LocalDate.parse("2017-10-03"), "강윤성", 19, 9.27));
	}

	private boolean isLogined() {
		return this.loginedMember != null;
	}

	private boolean isLoginIdDup(String loginId) {
		for (Member member : members) {

			if (member.id.equals(loginId)) {
				return false;
			}
		}
		return true;
	}

	private Member getMemberByLoginId(String id) {
		for (Member member : members) {

			if (member.id.equals(id)) {
				return member;
			}
		}
		return null;
	}

	public void deleteMemberFromFile(Member memberIdToDelete) {
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

             // 삭제할 멤버 ID와 일치하지 않는 경우에만 리스트에 추가
             if (!loginId.equals(memberIdToDelete.id)) {
                 members.add(new Member(loginId, loginPass, name, manager, wallet));
             }
        }
    } catch (IOException e) {
        System.out.println("파일을 읽는 중 오류가 발생했습니다.");
    }

    // 2. 파일을 새로 작성하여 업데이트된 멤버 리스트를 저장
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt"))) {
        for (Member member : members) {
            writer.write(member.id + "," + member.pass + "," + member.name + "," + member.manager + "," + member.wallet);
            writer.newLine();
		}
	} catch (IOException e) {
		System.out.println("파일을 저장하는 중 오류가 발생했습니다.");
	}
	}
}
