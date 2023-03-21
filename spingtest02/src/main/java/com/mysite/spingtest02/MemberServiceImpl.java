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

	@Override
	public MemberVO selectMember(String id) {
		MemberVO vo = mapper.selectMember(id);
		return vo;
	}
	
	
//	@Override
//	public int updateMember(String id, String pw, String email) {
//		int res = mapper.updateMember(id, pw, email);
//		return res;
//	}
	@Override
	public int updateMember(MemberVO member) {
		int res = mapper.updateMember(member);
		return res;
	}
	
	@Override
	public int deleteMember(String id) {
		int res = mapper.deleteMember(id);
		return res;
	}
	
	@Override
	public int countMember() {
		int res = mapper.countMember();
		return res;
	}
}
