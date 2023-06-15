package com.xworkz.dog.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dog.dto.PassportDTO;

@Component
@RequestMapping("/")
public class Defalt {
	public Defalt() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/start")
	public String onStart(Model model)
	{
		System.out.println("running on start method from default");
		model.addAttribute("dto",new PassportDTO());
		return "/Passport.jsp";
		
	}
}