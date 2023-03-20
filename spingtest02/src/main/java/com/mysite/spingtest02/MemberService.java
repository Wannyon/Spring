package com.mysite.spingtest02;

import java.util.ArrayList;

public interface MemberService {
	ArrayList<MemberVO> getMembers();
	int insertMember(MemberVO member);
}
