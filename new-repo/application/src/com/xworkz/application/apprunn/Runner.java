package com.xworkz.application.apprunn;

import java.time.LocalDate;

import com.xworkz.application.applicationService.ApplicationService;
import com.xworkz.application.applicationService.ApplicationServiceImp;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.dto.constants.Langused;
import com.xworkz.application.dto.constants.OsType;
import com.xworkz.application.dto.constants.Type;

public class Runner {
	public static void main(String[] args) {
		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setName("INSTAGRAM");
		applicationDTO.setTrialDays(8);
		applicationDTO.setType(Type.SOCIALMEDIA);
		applicationDTO.setVersion(2.0);
		applicationDTO.setSize(10);
		applicationDTO.setDevelopedBy("ramkumar");
		applicationDTO.setCreateDate(LocalDate.of(2005, 4, 10));
		applicationDTO.setPrice(10);
		applicationDTO.setFirstVersionReleasedDate(LocalDate.of(2015, 4, 20));
		applicationDTO.setCurrentVersionReleasedDate(LocalDate.of(2022, 5, 25));
		applicationDTO.setNextVersionReleasedDate(LocalDate.of(2027, 6, 11));
		applicationDTO.setMinProcessorSpeed(20);
		applicationDTO.setMinRamSpaceRequired(23);
		applicationDTO.setInternetNeeded(false);
		applicationDTO.setAgeLimit(20);
		applicationDTO.setNoOfDownloads(2);
		applicationDTO.setRating(4);
		applicationDTO.setOsTypeSupported(OsType.ANDROID);
		applicationDTO.setLangUsed(Langused.JAVA);
		ApplicationService application = new ApplicationServiceImp();
		System.out.println("saved:"+application.validandsave(applicationDTO));

	}

}
