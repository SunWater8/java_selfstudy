package com.bitcamp.firstSpring;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting", greeting());
		
		return mav ;
	}
	
	public Object greeting() {
		String str = "안녕하세요";
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if (hour >= 6 && hour <= 10) {
			str = "좋은 아침입니다.";
		} else if (hour >= 12 && hour <= 15) {
			str = "점심식사는 하셨나요?.";
		} else if(hour>18 && hour<=22){
			System.out.println("좋은 밤 되세요");
		}
		return str;
	}
	
}
