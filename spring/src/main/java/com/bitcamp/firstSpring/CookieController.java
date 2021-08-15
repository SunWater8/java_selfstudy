package com.bitcamp.firstSpring;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	@RequestMapping("cookie/make")
	public String makeCookie(HttpServletResponse response) {
		Cookie c = new Cookie("username", "bora");
		response.addCookie(c);
		return "cookie/make";
	}
	
	@RequestMapping("cookie/view")
	public String view(
			@CookieValue (value="usernames", defaultValue="scott") String userName,
			Model model
			) {
		model.addAttribute("usernames", userName);
		return "cookie/view";
	}
}
