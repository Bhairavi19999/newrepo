package com.xworkz.showroom.Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.Service.PolishService;
import com.xworkz.showroom.Service.SalesManagerService;
import com.xworkz.showroom.Service.ShowRoomService;
import com.xworkz.showroom.Service.SockService;
import com.xworkz.showroom.configuration.ShoeShowRoomConfi;
import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.dto.SalesManagerDTO;
import com.xworkz.showroom.dto.ShoeShowRoomDTO;
import com.xworkz.showroom.dto.SockDTO;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowRoomConfi.class);
		ShowRoomService serviceimpl = spring.getBean(ShowRoomService.class);
		ShoeShowRoomDTO dto = new ShoeShowRoomDTO(1, "bhwe", "tdaum", "gsdat");
		boolean save = serviceimpl.validateandsave(dto);
		System.out.println("save:" + save);
		System.out.println("           ");

		PolishService polishService = spring.getBean(PolishService.class);
		PolishDTO dto1 = new PolishDTO("black");
		boolean save1 = polishService.validandsave(dto1);
		System.out.println("save:" + save1);
		System.out.println("           ");

		SalesManagerService salesManagerService = spring.getBean(SalesManagerService.class);
		SalesManagerDTO serviceimpl1 = new SalesManagerDTO("swaraj");
		boolean save2 = salesManagerService.validandsave(serviceimpl1);
		System.out.println("save:" + save2);
		System.out.println("           ");
		
		
		SockService scService = spring.getBean(SockService.class);
		SockDTO dto2 = new SockDTO("zup");
		boolean save3 = scService.validandsave(dto2);
		System.out.println("save:" + save3);
		System.out.println("           ");

	}

}
