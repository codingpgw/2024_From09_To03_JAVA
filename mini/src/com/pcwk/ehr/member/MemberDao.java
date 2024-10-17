package com.pcwk.ehr.member;

import java.util.List;

import com.pcwk.ehr.cmn.DTO;

public class MemberDao implements WorkDiv<MemberVO> {
//Java를 통해 CRUD(Create, Read, Update, Delete)기능을 수행한다.
//도서등록(doSave)
	
//도서조회(doRetrieve)
//단건조회(doSelectOne)
	
//도서수정(doUpdate)
//도서삭제(doDelete)
	/**
	 * 등록
	 * @param vo
	 * @return 1/0
	 */
	@Override
	public int doSave(MemberVO vo) {
		return 0;
	}
	/**
	 * 수정
	 * @param vo
	 * @return 1(성공)/0(실패)
	 */
	@Override
	public int doUpdate(MemberVO vo) {
		return 0;
	}
	
	/**
	 * 삭제
	 * @param vo
	 * @return 1(성공)/0(실패)
	 */
	@Override
	public int doDelete(MemberVO vo) {
		return 0;
	}
	
	/**
	 * 회원단건 조회
	 * @param vo
	 * @return MemberVO
	 */
	@Override
	public MemberVO doSelectOne(MemberVO vo) {
		return null;
	}
	/**
	 * 회원단건 조회
	 * @param vo
	 * @return MemberVO
	 */
	@Override
	public List<MemberVO> doRetrieve(DTO vo) {
		return null;
	}
}
