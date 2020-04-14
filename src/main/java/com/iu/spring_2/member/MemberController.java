package com.iu.spring_2.member;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {
	private MemberService memberService;
	
	public MemberController() {
		memberService = new MemberService();
	}
	
	
	@RequestMapping(value= "memberJoin")
	public void memberJoin(Model model) {
		String id= "test";
		//model.addAttribute("id", id);
		model.addAttribute(id);
		
	}
	
	@RequestMapping(value= "memberJoin", method = RequestMethod.POST)
	public void memberJoin2(MemberVO memberVO) {
		//MemberVO의 멤버변수의 값으로 파라미터 값 넣기
		//출력
	}
	
	@RequestMapping(value= "memberLogin")
	public void memberLogin() {
		
	}
	
	@RequestMapping(value= "memberLogin", method = RequestMethod.POST)
	public String memberLogin2(HttpSession session) throws Exception {
		session = memberService.memberJoin(memberVO);
		//로그인 성공이면 index로 이동
		//실패하면 로그인 실패를 alert으로 띄우고 다시 loginform으로 이동
		if (condition) {
			session.setAttribute(name, value);
		}else {
			
		}
				 
				 
		return "redirect:../";
	}
	
	@RequestMapping(value= "memberPage")
	public void memberPage() {
		
	}

	
	@RequestMapping(value= "memberUpdate")
	public void memberUpdate() {
		
	}
	
	@RequestMapping(value= "memberUpdate", method = RequestMethod.POST)
	public void memberUpdate2() {
		System.out.println("Member Update Post");
	}
	
	@RequestMapping(value= "memberDelete")
	public void memberDelete() {
		System.out.println("Member Delete");
	}
	
}
