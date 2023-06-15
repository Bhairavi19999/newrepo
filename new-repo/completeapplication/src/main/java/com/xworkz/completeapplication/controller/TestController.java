package com.xworkz.completeapplication.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.completeapplication.dto.ShowRoomDTO;

@Component
@RequestMapping("/")
public class TestController {
	public TestController() {
		System.out.println("running test controller");
	}

	@PostMapping("/save")
	public String onSave(@Valid ShowRoomDTO dto, BindingResult br, Model model)
			 {
		System.out.println("running on save method");
		model.addAttribute("dtos", dto);
		if (br.hasErrors()) {
			model.addAttribute("mesg", "data is invalid");

			model.addAttribute("errors", br.getFieldErrors());
			br.getFieldErrors().forEach(e -> System.out.println(e.getField() 
					+ ":" + e.getDefaultMessage()));
//			model.addAttribute("dto",dto);
			return "/Showroom.jsp";
		} else {
//			System.out.println("File received:" + file.getName());
//			System.out.println("File size:" + file.getSize());
//			System.out.println("File type:" + file.getContentType());
//			System.out.println("File bytes:" + file.getBytes());
//			File physicalFile = new File("C:\\Users\\Bhairavi" + file.getOriginalFilename());
//			try (OutputStream os = new FileOutputStream(physicalFile)) {
//				os.write(file.getBytes());
			}
			model.addAttribute("mesg", "showroom bill of" + dto.getCustomerName() + "is submitted succesfully");
			model.addAttribute("dto",dto);

//		}
		return "/Display.jsp";

	}
}