package com.mysite.spingtest01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody	// 응답할 때 반환 값을 JSON 형태로 반환함
//@Controller	// memberController라는 빈객체가 자동으로 생성된다.
@RestController	// @ResponseBody와 @Controller를 대신 할 수 있는 기능.
public class MemberController {
	
//	@GetMapping("/getMember1")	// get 방식으로 /getMember url을 연결.
	@RequestMapping(value="/getMember1", method=RequestMethod.GET)
	public MemberVO getMember1(MemberVO member) { // member 객체는 의존성 주입으로 전달됨.
//		member.setNum(1);
//		member.setIrum("Lee");
//		member.setAge(27);
		
		return member;
	}
	
//	@PostMapping("/postMember1")
	@RequestMapping(value="/postMember1", method=RequestMethod.POST)
	public MemberVO postMember1(MemberVO member) { // member 객체는 의존성 주입으로 전달됨.
		
		System.out.println("member.getNum() : " + member.getNum());
		System.out.println("member.getIrum() : " + member.getIrum());
		System.out.println("member.getAge() : " + member.getAge());
		
		return member;
	}
}
