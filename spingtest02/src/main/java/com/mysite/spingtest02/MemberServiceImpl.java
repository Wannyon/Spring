package com.mysite.spingtest02;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	MemberMapper mapper;
	public MemberServiceImpl (MemberMapper mapper) {	// 생성자 형식(권장)
		this.mapper = mapper;
	}
	
//	@Autowired	// setter를 이용한 방식
//	public void setMapper(MemberMapper mapper) {
//		this.mapper = mapper;
//	}
	
//	@Autowired(required=false)	// 필드 형식
//	MemberMapper mapper;

	@Override
	public ArrayList<MemberVO> getMembers() {
		ArrayList<MemberVO> memberlist = mapper.getMembers();
		return memberlist;
	}

	@Override
	public int insertMember(MemberVO member) {
		int res = mapper.insertMember(member);
		return res;
	}

}
