package com.bitcamp.firstSpring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.firstSpring.domain.LoginRequest;

@Controller
@RequestMapping("/member/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getLoginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(
			@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			
			HttpServletRequest request,
			
			@ModelAttribute("loginReq") LoginRequest loginRequest,
			Model model
			) {
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		System.out.println(id+":"+ pw);
		
		String uid = request.getParameter("id");
		String upw= request.getParameter("pw");
		
		model.addAttribute("uid",uid);
		model.addAttribute("upw",upw);
		
		System.out.println(uid +":"+upw);
		
		System.out.println(loginRequest);
		
		return "member/login";
	}
}
