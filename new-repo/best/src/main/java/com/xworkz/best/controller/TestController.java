package com.xworkz.best.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	public TestController() {
		System.out.println("running test controller");
	}

	public String onClick() {
		System.out.println("running onclick");

		return "/display.jsp";
	}
}