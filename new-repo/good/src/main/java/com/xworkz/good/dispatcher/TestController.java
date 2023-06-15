package com.xworkz.good.dispatcher;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	public TestController() {
		System.out.println("running testcontroller");
	}
@RequestMapping("/clickon")
	public String onClick() {
		System.out.println("running onclick");
		return "/index.jsp";
	}

}
