package com.pcwk.ehr.project01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class movieApp {
	private List<Member> members;
	private Member loginedMember;
	private List<MovieList> lists;

	public movieApp() {
		members = new ArrayList<>();
		lists = new ArrayList<>();
		loginedMember = null;
	}

	public void run() {
		System.out.println("========프로그램 시작========");
		Scanner sc = new Scanner(System.in);
		boolean managerId = false;

		while (true) {
			System.out.println("┌───────────────────────────────────────────┐");
			System.out.println("│    1.로그인   2.회원가입  3.사이트로 이동  4.종료   │ ");
			System.out.println("└───────────────────────────────────────────┘");
			System.out.print("메뉴 선택 > ");
			String menu = sc.nextLine().trim();

			makeManagerId();
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
				Member member = new Member(loginId, loginPass, name, managerId);
				members.add(member);
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
					System.out.println("┌─────────────────────────────────────────────────────────────────────────┐");
					System.out.println("│ 1.상영중인 영화 조회  2.영화 검색  3.영화 예매  4.개인 정보 확인  5.관리자 모드  6.로그아웃 │");
					System.out.println("└─────────────────────────────────────────────────────────────────────────┘");
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

					} else if (internalMenu.equals("2")) {

					} else if (internalMenu.equals("3")) {

					} else if (internalMenu.equals("4")) {
						System.out.println("┌────────────────────────────────────────────────┐");
						System.out.println("│ 1.개인 정보 수정  2.예매한 영화 확인  3.나의 지갑  4.나가기 │");
						System.out.println("└────────────────────────────────────────────────┘");
						System.out.println("메뉴 선택 > ");
						int personalMenu = sc.nextInt();
						if (personalMenu == 4) {
							System.out.println("개인 정보 확인 창을 종료하겠습니다.");
						} else if (personalMenu == 1) {
							System.out.print("비밀번호 확인 : ");
							sc.nextLine();
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

						} else if (personalMenu == 2) {

						} else if (personalMenu == 3) {

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

							switch (managerMenu) {
							case 1:
							case 2:
							case 3:
							case 4:
								System.out.println("관리자 창을 종료하겠습니다.");
							default:
								System.out.println("유효하지 않은 명령입니다.");
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
		members.add(new Member("manager", "1234", "manager", true));
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
}
