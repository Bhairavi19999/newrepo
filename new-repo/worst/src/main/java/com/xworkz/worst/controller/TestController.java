package com.xworkz.worst.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.worst.constant.ApplicationCons;
import com.xworkz.worst.dto.PassPortDTO;

@Component
@RequestMapping("/")
public class TestController {
	public TestController() {
		System.out.println("running test controller");
	}

	@PostMapping("/save")
	public String onSave(@Valid PassPortDTO dto, BindingResult br, Model model, MultipartFile file) throws IOException {
		System.out.println("running save method");
		model.addAttribute("dtos", dto);
		if (br.hasErrors()) {
			model.addAttribute("mesg", "data is invalid");
			model.addAttribute("errors", br.getAllErrors());

			model.addAttribute("dto", dto);

			return "/Passport.jsp";
		} else {
			System.out.println("File received:" + file.getName());
			System.out.println("File size:" + file.getSize());
			System.out.println("File type:" + file.getContentType());
			System.out.println("File bytes:" + file.getBytes());
			File physicalFile = new File(ApplicationCons.FILE_LOCATION + file.getOriginalFilename());
			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			model.addAttribute("mesg", "details saved  " + dto.getFname() + "  is submitted sucesfully");
			return "/Display.jsp";
		}
	}

	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException {
		System.out.println("running sendimage...");
		File file = new File(ApplicationCons.FILE_LOCATION + fileName);
		response.setContentType(contentType);
		OutputStream outputStream = response.getOutputStream();
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[4096];
		int length;
		while ((length = in.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		in.close();
		outputStream.flush();

	
}}
