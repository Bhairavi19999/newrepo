package com.xworkz.worst.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.worst.dto.PassPortDTO;
@Component
@RequestMapping("/")
public class Default {
	public Default() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/start")
	public String onStart(Model model)
	{
		System.out.println("running on start method from default");
		model.addAttribute("dto",new PassPortDTO());
		return "/Passport.jsp";
		
	}
}
