package com.bitcamp.firstSpring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String memberReg() {
		return "member/regForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String reg(
			@RequestParam("memberid") String memberid,
			@RequestParam("password") String password,
			@RequestParam("membername") String membername,
			HttpServletRequest request,
			@ModelAttribute("memberRegReq") String regRequest,
			
			Model model
			) {
		model.addAttribute("memberid", memberid);
		model.addAttribute("password", password);
		model.addAttribute("membername", membername);
		return "member/reg";
	}
}
