package com.mysite.springmember01;

import java.util.ArrayList;

public interface MemberService {

	public int insertMember(MemberVO memberVO);
	
	public int userCheck(String id, String password);
	
	public ArrayList<MemberVO> getMemberlist();
	
	public MemberVO selectMember(MemberVO memberVO);
	
	public int deleteMember(MemberVO memberVO);
	
	public int updateMember(MemberVO memberVO);
}
