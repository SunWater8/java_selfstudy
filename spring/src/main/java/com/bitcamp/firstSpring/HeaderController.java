package com.bitcamp.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

	@RequestMapping("header/header")
	public String header(
			@RequestHeader("referer") String reString,
			Model model
			
			) {
		model.addAttribute("re",reString);
		
		return "/header/header";
//		return "redirect:/member/login";
	}
}
