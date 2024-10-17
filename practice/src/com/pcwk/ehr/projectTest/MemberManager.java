package com.pcwk.ehr.projectTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManager {

	private List<Member> members;
	private Member loginedMember;

	public MemberManager() {
		members = new ArrayList<>();
		FileHandler.loadMembers(members);
		loginedMember = null;
	}

	public MemberManager(List<Member> members) {
		this.members = members;
	}

	public void login(Scanner sc) {
		if (isLogined()) {
			System.out.println("이미 로그인 되어 있습니다.");
			return;
		}
		System.out.printf("아이디 : ");
		String loginId = sc.nextLine().trim();
		System.out.printf("비밀번호 : ");
		String loginPass = sc.nextLine().trim();
		Member member = getMemberByLoginId(loginId); // 저장된 유저의 정보를 불러와 가입 여부 확인 및 비번 확인

		if (member == null) {
			System.out.printf("%s은(는) 존재하지 않는 아이디입니다.\n", loginId);
		}
		if (loginPass.equals(member.pass) == false) {
			System.out.println("비밀번호를 확인해주세요.");
		}
		this.loginedMember = member;
		FileHandler.loadReservations();
		System.out.printf("%s님 환영합니다.%n", member.name);

	}

	public void register(Scanner sc) {
		boolean managerId = false;
		int myWallet = 0;
		String loginId = null;
		if (isLogined()) {
			System.out.println("로그아웃 후 이용해주세요.");
			return;
		}
		System.out.printf("이름 : ");
		String name = sc.nextLine();
		System.out.print("연령 : ");
		int userAge = sc.nextInt();

		sc.nextLine(); // nextLine() 사용 후 nextInt() 사용시 그냥 넘어가는 상황 발생
		while (true) {
			System.out.print("로그인 아이디 : ");
			loginId = sc.nextLine().trim();

			if (isLoginIdDup(loginId) == false) { // 중복 여부 확인
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
		Member member = new Member(loginId, loginPass, name, managerId, myWallet, userAge);
		members.add(member);
		FileHandler.saveMember(member);
		System.out.printf("%s 회원님 환영합니다.%n", name);
	}

	public void accessSite(Scanner sc, MovieManager movieManager) {
		if (!isLogined()) {
			System.out.println("로그인 후 이용해 주세요.");
			return;
		}
		while (true) {
			UI.displaySiteMenu();
			System.out.print("메뉴 선택 > ");
			String internalMenu = sc.nextLine().trim();

			if (internalMenu.equals("1")) {
				displayMovies();
			} else if (internalMenu.equals("2")) {
				searchMovies(sc);
			} else if (internalMenu.equals("3")) {
				reserveMovie(sc);
			} else if (internalMenu.equals("4")) {
				managePersonalInfo(sc);
			} else if (internalMenu.equals("5")) {
				manageAccount(sc);
			} else if (internalMenu.equals("6")) {
				PersonalSection.logout();
				System.out.println("로그아웃 되었습니다.");
				break;
			} else {
				System.out.println("유효하지 않은 명령입니다.");
			}
		}
	}

	public boolean isLogined() {
		return this.loginedMember != null;
	}

	public boolean isLoginIdDup(String loginId) {
		for (Member member : members) {
			if (member.id.equals(loginId)) {
				return false; // ID already exists
			}
		}
		return true; // ID is unique
	}

	public void setLoginedMember(Member member) {
		this.loginedMember = member; // Set the currently logged-in member
	}

	public Member getLoginedMember() {
		return this.loginedMember; // Retrieve the logged-in member
	}

	public Member getMemberByLoginId(String id) { // 특정 아이디 정보 호출 메소드
		for (Member member : members) {

			if (member.id.equals(id)) {
				return member;
			}
		}
		return null;
	}
	private void displayMovies() {
        System.out.println("영화 제목  |       개봉일    |  감독  | 연령 제한  |  평점");
        for (MovieList movieInfo : movieManager.getMovies()) {
            // Print movie details
        }
    }

    private void searchMovies(Scanner sc) {
        // Implement movie search logic
    }

    private void reserveMovie(Scanner sc) {
        // Implement movie reservation logic
    }

    private void managePersonalInfo(Scanner sc) {
        // Implement personal information management logic
    }

    private void manageAccount(Scanner sc) {
        // Implement account management logic
    }
}
