package com.xworkz.completeapplication.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.completeapplication.dto.ShowRoomDTO;

@Component
@RequestMapping("/")
public class DefaultController {
	public DefaultController() {
		System.out.println("creted" + this.getClass().getSimpleName());
	}

	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("running on statrt method from DefaultController");
		model.addAttribute("dto", new ShowRoomDTO());
		return "Showroom.jsp";
	}

}
