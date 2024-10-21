package com.pcwk.ehr.member;

public class MemberDaoMain {
	MemberVO member01 = null;
	MemberVO member02 = null;
	MemberVO member03 = null;
	MemberDao dao = null;
	public MemberDaoMain() {
		dao = new MemberDao();
//		member01 = new MemberVO("pcwk01","이상무01","4321","jamesol@paran.com",1,0,"2024/10/17,14:33:00","일반");
//		member02 = new MemberVO("pcwk11","이상무11","4321","jamesol11@paran.com",1,0,"2024/10/17,14:33:00","일반");
	}
	
	
	public void doSave() {
		System.out.println("회원 등록");
		int flag = dao.doSave(member01);
		if(2==flag) {
			System.out.println(member01.getMemberId()+"중복 되었습니다.");
		}else if(0 == flag) {
			System.out.println(member01.getMemberId()+"등록 실패");
		}else {
			System.out.println(member01.getMemberId()+"등록 성공");
		}
		
		dao.displayList(MemberDao.members);
	}
	
	public void doDelete() {
		System.out.println("회원 삭제");
		int flag = dao.doDelete(member01);
		
		if(1==flag) {
			System.out.println(member01.getMemberId()+"삭제 성공");			
		}else {
			System.out.println(member01.getMemberId()+"삭제 실패");
		}
		
		dao.displayList(MemberDao.members);
	}
	public void doSelectOne() {
		System.out.println("회원 조회");
		MemberVO search = dao.doSelectOne(member01);
		if(search == null) {
			System.out.println(member01.getMemberId()+"조회 실패");
		}else {
			System.out.println(member01.getMemberId()+"조회 성공");
		}
		System.out.println(search);
	}
	
	public static void main(String[] args) {
		MemberDaoMain main = new MemberDaoMain();
//		MemberDao dao = new MemberDao();
//		MemberVO member1 = new MemberVO("ID001", "John Doe", "password123", "john@example.com", 1, 5, "2024-10-18 14:33:00", "일반");
//		MemberVO member2 = new MemberVO("ID002", "Jane Smith", "password456", "jane@example.com", 2, 3, "2024-10-18 14:33:00", "일반");
//		dao.doSave(member1);
//		dao.doSave(member2);
//		dao.writeFile("member.csv");
//		main.doSave();
		
//		main.doDelete();
		
//		main.doSelectOne();
	}

}
