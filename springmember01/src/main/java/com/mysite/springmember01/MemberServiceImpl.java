package com.mysite.springmember01;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service("memberService")	// memberServiceImpl의 객체가 생성되고 이름은 memberService이다.
public class MemberServiceImpl implements MemberService {

	private MemberMapper mapper;
	
	public MemberServiceImpl (MemberMapper mapper) {	// 생성자 형식(권장)
		this.mapper = mapper;
	}
	
	@Override
	public int insertMember(MemberVO memberVO) {
		int res = mapper.insertMember(memberVO);
		return res;
	}

	@Override
	public int userCheck(String id, String password) {
		int res = mapper.userCheck(id, password);
		return res;
	}

	@Override
	public ArrayList<MemberVO> getMemberlist() {
		ArrayList<MemberVO> member_list = new ArrayList<MemberVO>();
		member_list = mapper.getMemberlist();
		return member_list;
	}

	@Override
	public MemberVO selectMember(MemberVO memberVO) {
		MemberVO vo = mapper.selectMember(memberVO);
		return vo;
	}

	@Override
	public int deleteMember(MemberVO memberVO) {
		int res = mapper.deleteMember(memberVO);
		return res;
	}

	@Override
	public int updateMember(MemberVO memberVO) {
		int res = mapper.updateMember(memberVO);
		return res;
	}

}
