package com.iu.spring_2.member;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		memberDAO = new MemberDAO();
	}
	
	public int memberUpdate(MemberVO memberDTO)throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	
	public int memberDelete(MemberVO memberDTO) throws Exception{
		return memberDAO.memberDelete(memberDTO);
	}
	
	public MemberVO memberLogin(MemberVO memberDTO)throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
	
	public int memberJoin(MemberVO memberDTO)throws Exception{
		return memberDAO.memberJoin(memberDTO);
	}

}
