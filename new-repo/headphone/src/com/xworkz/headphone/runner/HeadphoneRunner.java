package com.xworkz.headphone.runner;

import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.WeightAndType;
import com.xworkz.headphone.dto.HeadphoneDTO;
import com.xworkz.headphone.service.HeadphoneService;
import com.xworkz.headphone.service.HeadphoneServiceImp;

public class HeadphoneRunner {

	public static void main(String[] args) {
		HeadphoneDTO headphoneDTO = new HeadphoneDTO(Brand.BOAT, "ACI100", 5000, false, Color.BLACK,
				WeightAndType.BLUETOOTH, "bhairavi", 123, LocalDate.of(2023, 1, 1), 2);
		HeadphoneService headphoneService = new HeadphoneServiceImp();
		System.out.println("saved:" + headphoneService.validateandsave(headphoneDTO));
	}

}
