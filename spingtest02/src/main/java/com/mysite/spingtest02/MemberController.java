package com.mysite.spingtest02;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	MemberServiceImpl memberServiceImpl;
	
	public MemberController (MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}
	
	@GetMapping("/getMembers")
//	@RequestMapping(value="/getMembers", method=RequestMethod.GET)
	ArrayList<MemberVO> getMembers() {
		ArrayList<MemberVO> memberlist = memberServiceImpl.getMembers();
		
		return memberlist;
	}
	
	@PostMapping("/insertMember")
	public int insertMember(MemberVO member) {
		int res = memberServiceImpl.insertMember(member);
		
		return res;
	}
	
	
//	@GetMapping("/selectMember")
//	public MemberVO selectMember(String id) {
//		MemberVO vo = memberServiceImpl.selectMember(id);
//		return vo;
//	}
//	@GetMapping("/selectMember")
//	public MemberVO selectMember(@RequestParam(value="id") String id) {	// value 파라미터 이름 명시
//		MemberVO vo = memberServiceImpl.selectMember(id);
//		return vo;
//	}
	@GetMapping("/selectMember")
	public MemberVO selectMember(@RequestParam String id) {	// value의 파라미터와 변수 이름이 동일할 때 value 생략 가능.
		MemberVO vo = memberServiceImpl.selectMember(id);
		return vo;
	}
	
	
//	@PostMapping("/updateMember")
//	public int updateMember(@RequestParam String id, @RequestParam String pw, @RequestParam String email) {
//		int res = memberServiceImpl.updateMember(id, pw, email);
//		return res;
//	}
	@PostMapping("/updateMember")
	public int updateMember(MemberVO member) {
		int res = memberServiceImpl.updateMember(member);
		return res;
	}
	
	@PostMapping("/deleteMember")
	public int deleteMember(String id) {
		int res = memberServiceImpl.deleteMember(id);
		return res;
	}
	
	@GetMapping("/countMember")
	public int countMember() {
		int res = memberServiceImpl.countMember();
		return res;
	}
}
