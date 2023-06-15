package com.xworkz.jam.disptacher;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	public TestController() {
		System.out.println("running testcontroller" + getClass().getSimpleName());
	}

	@RequestMapping("/click")
	public String Onclick() {
		System.out.println("running method onclick");
		return "/index.jsp";
	}

}
