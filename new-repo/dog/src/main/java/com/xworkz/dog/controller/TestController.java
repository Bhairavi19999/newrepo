package com.xworkz.dog.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.dog.constant.ApplicationCons;
import com.xworkz.dog.dto.PassportDTO;
import com.xworkz.dog.service.PassService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class TestController {

	private List<PassportDTO> list = new ArrayList<PassportDTO>();
	@Autowired
	private PassService service;

	public TestController() {
		log.info("running TestController...");
		
	}

	@PostMapping("/save")
	public String onSave(@Valid PassportDTO dto, BindingResult br, Model model, MultipartFile file) throws IOException {
		log.info("running save method" + dto);

		model.addAttribute("dtos", dto);
		if (br.hasErrors()) {
			model.addAttribute("mesg", "data is invalid");
			model.addAttribute("errors", br.getAllErrors());

			model.addAttribute("dto", dto);

			return "/Passport.jsp";
		} else {
			log.info("File received:" + file.getName());
			log.info("File size:" + file.getSize());
			log.info("File type:" + file.getContentType());
			log.info("File bytes:" + file.getBytes());
			dto.setOriginalFileName(file.getOriginalFilename());
			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			log.info("dto after file details:" + dto);
			list.add(dto);
			log.info("calling save and validate....");
			log.info("list:" + list);
			service.validateAndSave(dto);
			File physicalFile = new File(ApplicationCons.FILE_LOCATION + dto.getFileName());
			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			model.addAttribute("mesg", "details saved  " + dto.getFname() + "  is submitted sucesfully");
			return "/Display.jsp";
		}
	}

	@GetMapping("fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException {
		log.info("running sendimage...");
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
	}

	@GetMapping("view")
	public String view(Model model) {
		log.info("running view");
		model.addAttribute("list", this.list);
		return "View.jsp";
	}

	@GetMapping("showFile")
	public void showFile(String fileName, String contentType, HttpServletResponse response) throws IOException {
		log.info("running showFile...");
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
	}

}
