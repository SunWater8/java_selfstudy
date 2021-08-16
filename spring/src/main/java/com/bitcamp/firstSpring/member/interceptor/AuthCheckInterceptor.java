package com.bitcamp.firstSpring.member.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(false);
		if(session != null && session.getAttribute("loginInfo") != null) {
			return true;
		}
		response.sendRedirect(request.getContextPath()+"/member/login");
		
		return super.preHandle(request, response, handler);
	}
	
}
