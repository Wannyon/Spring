package com.mysite.springtest0202;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	MemberServiceImpl memberServiceImpl;
	
	public MemberController (MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}
	
//	@GetMapping("/getMembers")
	@RequestMapping(value="/getMembers", method=RequestMethod.GET)
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
//	public MemberVO selectMember(@RequestParam(value="id") String id) {
//		MemberVO vo = memberServiceImpl.selectMember(id);
//		return vo;
//	}
	@GetMapping("/selectMember")
	public MemberVO selectMember(@RequestParam String id) {
		MemberVO vo = memberServiceImpl.selectMember(id);
		return vo;
	}
	
	@GetMapping("/selectMember2")
	public HashMap<String, String> selectMember2(String id) {
		HashMap<String, String> vo = memberServiceImpl.selectMember2(id);
		return vo;
	}
	
	@GetMapping("/selectMember3")
	public HashMap<String, String> selectMember3(String id) {
		HashMap<String, String> vo = memberServiceImpl.selectMember3(id);
		return vo;
	}
	
	@GetMapping("/selectMember4")
	public LoginVO selectMember4(String id) {
		LoginVO vo = memberServiceImpl.selectMember4(id);
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
