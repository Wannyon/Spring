package com.mysite.springtest0202;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

public interface MemberService {
	ArrayList<MemberVO> getMembers();
	int insertMember(MemberVO member);
	public MemberVO selectMember(String id);
	public HashMap<String, String> selectMember2(@Param("id") String id);
	public HashMap<String, String> selectMember3(@Param("id") String id);
	public LoginVO selectMember4(String id);
//	public int updateMember(String id, String pw, String email);
	public int updateMember(MemberVO member);
	public int deleteMember(String id);
	public int countMember();
}
