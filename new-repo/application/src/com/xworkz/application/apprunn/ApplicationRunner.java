package com.xworkz.application.apprunn;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.dto.AttendenceDTO;
import com.xworkz.application.dto.AwarenessDTO;
import com.xworkz.application.dto.MarketDTO;
import com.xworkz.application.dto.TravelDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		AttendenceDTO attendenceDTO = new AttendenceDTO();

		attendenceDTO.setName("company");
		attendenceDTO.setNoOfAttended(20);
		attendenceDTO.setTotalNoOfWorkers(100);
		attendenceDTO.setLocation("bang");
		attendenceDTO.setAttendenceOn(LocalDate.now());
		System.out.println(attendenceDTO);
		System.out.println("equals is:" + attendenceDTO.equals(attendenceDTO));
		System.out.println("hashcode is:" + attendenceDTO.hashCode());
		System.out.println("    ");

		TravelDTO travelDTO = new TravelDTO();
		travelDTO.setFrom("tum");
		travelDTO.setTo("goa");
		travelDTO.setDepartedDate(LocalDate.now());
		travelDTO.setNoOfTraverlers(20);
		travelDTO.setTicketPrice(1000);
		System.out.println(travelDTO);
		System.out.println("equals is:" + travelDTO.equals(travelDTO));
		System.out.println("hashcode is:" + travelDTO.hashCode());
		System.out.println("    ");

		MarketDTO marketDTO = new MarketDTO();
		marketDTO.setFamousFor("fruits");
		marketDTO.setLocation("manglore");
		marketDTO.setName("cityMarket");
		marketDTO.setPrice(150000);
		marketDTO.setSize(46);
		System.out.println(marketDTO);
		System.out.println("equals is:" + marketDTO.equals(marketDTO));
		System.out.println("hashcode is:" + marketDTO.hashCode());
		System.out.println("    ");

		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setName("facebook");
		applicationDTO.setDevelopedBy("kumar");
		applicationDTO.setLaunchedOn(LocalDate.of(2015, 8, 02));
		applicationDTO.setVersion(2.3);
		applicationDTO.setCurrentlyUsedBy("raj");
		System.out.println(applicationDTO);
		System.out.println("equals is:" + applicationDTO.equals(applicationDTO));
		System.out.println("hashcode is:" + applicationDTO.hashCode());
		System.out.println("    ");

		AwarenessDTO awarenessDTO = new AwarenessDTO();
		awarenessDTO.setCreatedBy("gov");
		awarenessDTO.setDate(LocalDate.of(2011, 2, 20));
		awarenessDTO.setFollowedBy("citizen");
		awarenessDTO.setNoEnd(false);
		awarenessDTO.setPreventation("socialDistance");
		System.out.println(awarenessDTO);
		System.out.println("equals is:" + awarenessDTO.equals(awarenessDTO));
		System.out.println("hashcode is:" + awarenessDTO.hashCode());
		System.out.println("    ");

	}

}
