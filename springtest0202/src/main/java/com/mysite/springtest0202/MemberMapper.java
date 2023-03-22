package com.mysite.springtest0202;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

//@Mapper  // interface를 매퍼로 등록하기 위해 사용(sql문을 호출하기 위해 사용)
public interface MemberMapper {
	
	ArrayList<MemberVO> getMembers();
	int insertMember(MemberVO member);
	public MemberVO selectMember(@Param("id") String id);
	public HashMap<String, String> selectMember2(@Param("id") String id);
	public HashMap<String, String> selectMember3(@Param("id") String id);
	public LoginVO selectMember4(@Param("id") String id);
	public int updateMember(MemberVO member);
	public int deleteMember(@Param("id") String id); //@Param("id") : 파라메터가 하나일때는 생략 가능
	public int countMember();

}
