package com.mysite.springtest0202;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	MemberMapper mapper;
	
	public MemberServiceImpl (MemberMapper mapper) {  // 생성자
		this.mapper = mapper;
	}
	
//	@Autowired(required=false) // 필드 required=true가 기본값
//	MemberMapper mapper;
	
//	@Autowired  // setter를 이용한 방식
//	public void setMapper(MemberMapper mapper) {
//		this.mapper = mapper;
//	}

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
	
	@Override
	public HashMap<String, String> selectMember2(String id) {
		HashMap<String, String> vo = mapper.selectMember2(id);
		return vo;
	}
	
	@Override
	public HashMap<String, String> selectMember3(String id) {
		HashMap<String, String> vo = mapper.selectMember3(id);
		return vo;
	}
	
	@Override
	public LoginVO selectMember4(String id) {
		LoginVO vo = mapper.selectMember4(id);
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
