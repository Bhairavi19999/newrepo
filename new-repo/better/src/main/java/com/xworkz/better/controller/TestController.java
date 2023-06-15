package com.xworkz.better.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/")
public class TestController {
	public TestController() {
		System.out.println("running test controller");
	}

	@RequestMapping(value = "/click", method = RequestMethod.POST)
	public ModelAndView method() {
		String externalUrl = "https://www.google.com";
		return new ModelAndView("redirect:" + externalUrl);
	}
}