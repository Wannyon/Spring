package com.mysite.springmember01;

import java.io.PrintWriter;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller	// 기본적으로 뷰(view)를 반환한다.
public class MemberController {
	private MemberService memberService;	// private MemberServiceImpl memberService
	
	public MemberController(MemberService memberService) {	//MemberServiceImpl memberService
		this.memberService = memberService;
	}
	
	@RequestMapping("/")	// @RequestMapping(value="/", method=RequestMethod.GET) Get방식일때 작동.
	public String startPage() {
		return "loginForm";
	}
	
	@RequestMapping("/loginform.me")
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping("/joinform.me")
	public String joinForm() {
		return "joinForm";
	}
	
	@RequestMapping("/joinprocess.me")
	public void insertMember(MemberVO memberVO, HttpServletResponse response) throws Exception {
		int res = memberService.insertMember(memberVO);
		System.out.println("JOIN :" + res);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		if (res == 1) {
			writer.write("<script>alert('회원 가입 성공!!'); location.href='./loginform.me';</script>");
//			return "redirect:/loginform.me";
		}
		else {
			writer.write("<script>alert('회원 가입 실패!!');location.href='./joinform.me';</script>");
//			return "redirect:/loginform.me";
		}
//		return null;
	}
	
	@RequestMapping("/login.me")
	public String userCheck(String id, String password, HttpSession session, HttpServletResponse response) throws Exception {
		int res = memberService.userCheck(id, password);
//		System.out.println("res :" + res);
		
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter writer = response.getWriter();
		
		if (res == 1) {
			session.setAttribute("id", id);
			System.out.println("session.getAttribute(id)" + session.getAttribute("id"));
//			writer.write("<script>alert('로그인 성공!!'); location.href='./main.me';</script>");
			return "redirect:/main.me";
		}
		else {
//			writer.write("<script>alert('로그인 실패!!');location.href='./loginform.me';</script>");
			return "redirect:/loginform.me";
		}
	}
	
	@RequestMapping("/main.me")
	public String mainPage() {
		return "main";
	}
	
	// Model : 뷰에게 전달할 데이터를 저장. 뷰에서는 request.getAttribute()로 데이터를 가져옴.
	// ModelAndView : 뷰와 데이터를 저장해서 전달.
//	@RequestMapping("/memeberlist.me")
//	public String getMemberlist(Model model) {
//		ArrayList<MemberVO> member_list = memberService.getMemberlist();
//		model.addAttribute("member_list", member_list);
//	
//		return "member_list";
//	}
	@RequestMapping("/memberlist.me")
	public ModelAndView getMemberlist(ModelAndView mv) {
		ArrayList<MemberVO> member_list = memberService.getMemberlist();
		mv.addObject("member_list", member_list);
		mv.setViewName("member_list");
		
		return mv;
	}
	
	@RequestMapping("/memberinfo.me")
	public String selectMember (MemberVO memberVO, Model model) {
		MemberVO vo = memberService.selectMember(memberVO);
		model.addAttribute("memberVO", vo);
		
		return "member_info";
	}
	
	@RequestMapping("/updateform.me")
	public String updateForm (MemberVO memberVO, Model model) {
		MemberVO vo = memberService.selectMember(memberVO);
		model.addAttribute("memberVO", vo);
		
		return "member_updateForm";
	}
	
	@RequestMapping("/update.me")
	public String updateMember(MemberVO memberVO) {
		memberService.updateMember(memberVO);
		return "redirect:/memberlist.me";
	}
	
	@RequestMapping("/memberdelete.me")
	public String deleteMember(MemberVO memberVO) {
		memberService.deleteMember(memberVO);
		
		return "redirect:/memberlist.me";
	}
	
}
