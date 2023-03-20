package com.mysite.spingtest02;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	MemberServiceImpl memberServiceImpl;
	
	public MemberController (MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}
	
	@GetMapping("/getMembers")
	ArrayList<MemberVO> getMembers() {
		ArrayList<MemberVO> memberlist = memberServiceImpl.getMembers();
		
		return memberlist;
	}
	
	@PostMapping("/insertMember")
	public int insertMember(MemberVO member) {
		int res = memberServiceImpl.insertMember(member);
		
		return res;
	}
}
