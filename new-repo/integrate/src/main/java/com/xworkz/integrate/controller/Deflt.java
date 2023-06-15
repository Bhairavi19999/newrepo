package com.xworkz.integrate.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.integrate.dto.AccountDTO;

@Component
@RequestMapping("/")
public class Deflt {
	public Deflt() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("running on start method from default");
		model.addAttribute("dto", new AccountDTO());
		return "/Account.jsp";

	}

}
