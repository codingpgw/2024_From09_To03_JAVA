package com.pcwk.ehr.member;

import java.io.*;
import java.util.*;

import com.pcwk.ehr.cmn.DTO;
import com.pcwk.ehr.cmn.WorkDiv;

public class MemberDao implements WorkDiv<MemberVO> {

	// TODO : 파일 경로로 변경
	private final String fileName = "member.csv";
	public static List<MemberVO> members = new ArrayList<MemberVO>();

	public MemberDao() {
		super();
		int count = readFile(fileName);
	    removeDuplicates();
	}

	public void displayList(List<MemberVO> list) {
		if (list.size() > 0) {
			String message = "\r\n" + "  __  __           _               _    _    _   \r\n"
					+ " |  \\/  |___ _ __ | |__  ___ _ _  | |  (_)__| |_ \r\n"
					+ " | |\\/| / -_) '  \\| '_ \\/ -_) '_| | |__| (_-<  _|\r\n"
					+ " |_|  |_\\___|_|_|_|_.__/\\___|_|   |____|_/__/\\__|\r\n"
					+ "                                                 \r\n" + " ";
			System.out.println(message);
			for (MemberVO vo : list) {
				System.out.println(vo);
			}
		} else {
			System.out.println("회원정보가 없습니다.");
		}
	}

	/**
	 * 등록
	 * 
	 * @param vo
	 * @return 1(성공)/0(실패)/2(memberId 중복)
	 */

	// boolean isExistsMember
	private boolean isExistsMember(MemberVO member) {
		boolean flag = false;

		for (MemberVO v : members) {
			if (v.getMemberId().equals(member.getMemberId())) {
				flag = true;
				return flag;
			}
		}

		return flag;
	}

	@Override
	public int doSave(MemberVO vo) {
		// param 입력된 데이터를 members 추가.
		// 입력전에 memberId check 필요
		int flag = 0;

		if (isExistsMember(vo) == true) {
			flag = 2;
			return flag;
		}

		boolean check = this.members.add(vo);
		flag = check == true ? 1 : 0;

		return flag;
	}

	/**
	 * 수정
	 * 
	 * @param vo
	 * @return 1(성공)/0(실패)
	 */
	@Override
	public int doUpdate(MemberVO vo) {
		return 0;
	}

	/**
	 * 삭제
	 * 
	 * @param vo
	 * @return 1(성공)/0(실패)
	 */
	@Override
	public int doDelete(MemberVO vo) {
		// 회원목록에서 동일한 회원을 찾고 삭제
		int flag = 0;
		for (MemberVO member : members) {
			if (member.getMemberId().equals(vo.getMemberId())) {
//				flag=members.remove(vo)==true?1:0;
				members.remove(vo);

				flag = 1;
				break;
			}
		}
		return flag;
	}

	/**
	 * 회원단건 조회
	 * 
	 * @param vo
	 * @return MemberVO
	 */
	@Override
	public MemberVO doSelectOne(MemberVO vo) {
		// members에 회원 ID에 해당되는 회원 정보 전체를 return
		MemberVO outVO = null;
		for (MemberVO member : members) {
			if (member.getMemberId().equals(vo.getMemberId())) {
				outVO = member;
				break;
			}
		}
		return outVO;
	}

	/**
	 * 회원단건 조회
	 * 
	 * @param vo
	 * @return MemberVO
	 */
	@Override
	public List<MemberVO> doRetrieve(DTO vo) {
		return null;
	}

	@Override
	public int writeFile(String path) {
	    int flag = 0;
	    
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
	        for (MemberVO member : members) {
	            String memberData = member.toFileFormat(); 
	            bw.write(memberData);
	            bw.newLine();
	        }
	        flag = 1; 
	    } catch (IOException e) {
	        System.out.println("IOException while writing file: " + e.getMessage());
	    }
	    return flag;
	}

	public MemberVO StringtoMember(String data) {
		MemberVO out = null;

		String memberStr = data;
		
		String[] memberArr = memberStr.split(",");
		String teamIdStr = memberArr[4].trim(); // 불필요한 공백 제거
		String loginCountStr = memberArr[5].trim();	
		String memberId = memberArr[0];// 회원ID<PK>
		String memberName = memberArr[1];// 이름
		String password = memberArr[2];// 비번
		String email = memberArr[3];// 이메일
//		int teamId = Integer.parseInt(memberArr[4]);// 팀ID
		int teamId = Integer.parseInt(teamIdStr.replaceAll("[^0-9]", ""));
		int loginCount = Integer.parseInt(loginCountStr.replaceAll("[^0-9]", ""));// 로그인 수
		String regDt = memberArr[6];// 가입일
		String roleName = memberArr[7];// 권한명

		out = new MemberVO(memberId, memberName, password, email, teamId, loginCount, regDt, roleName);

		return out;
	}

	@Override
	public int readFile(String path) {

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String data = "";
			while ((data = br.readLine()) != null) {
				MemberVO outVO = StringtoMember(data);
				members.add(outVO);
			}

		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());
		}

		// 회원정보 전체 조회
		displayList(members);
		return members.size();
	}
	public void removeDuplicates() {
	    Set<String> uniqueMemberIds = new HashSet<>();
	    List<MemberVO> uniqueMembers = new ArrayList<>();

	    for (MemberVO member : members) {
	        if (uniqueMemberIds.add(member.getMemberId())) {
	            uniqueMembers.add(member);
	        }
	    }

	    members = uniqueMembers;
	}
}
