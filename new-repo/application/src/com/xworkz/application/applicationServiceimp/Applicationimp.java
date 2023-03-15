package com.xworkz.application.applicationServiceimp;

import java.time.LocalDate;

import com.xworkz.application.applicationService.ApplicationService;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.dto.constants.Langused;
import com.xworkz.application.dto.constants.OsType;
import com.xworkz.application.dto.constants.Type;

public class Applicationimp implements ApplicationService {

	@Override
	public boolean validandsave(ApplicationDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String name = dto.getName();
			Type type = dto.getType();
			double version = dto.getVersion();
			double size = dto.getSize();
			String developedBy = dto.getDevelopedBy();
			LocalDate createDate = dto.getCreateDate();
			double price = dto.getPrice();
			LocalDate firstVersionReleasedDate = dto.getFirstVersionReleasedDate();
			LocalDate currentVersionReleasedDate = dto.getCurrentVersionReleasedDate();
			LocalDate nextVersionReleasedDate = dto.getNextVersionReleasedDate();
			int trialDays = dto.getTrialDays();
			Langused langUsed = dto.getLangUsed();
			double minProcessorSpeed = dto.getMinProcessorSpeed();
			double minRamSpaceRequired = dto.getMinRamSpaceRequired();
			boolean internetNeeded = dto.isInternetNeeded();
			int ageLimit = dto.getAgeLimit();
			int noOfDownloads = dto.getNoOfDownloads();
			int rating = dto.getRating();
			OsType osTypeSupported = dto.getOsTypeSupported();
			boolean validname = false;
			boolean validtype = false;
			boolean validsize = false;
			boolean validversion = false;
			boolean validdevelopedBye = false;
			boolean validcreateDate = false;
			boolean validprice = false;
			boolean validfirstVersionReleasedDate = false;
			boolean validcurrentVersionReleasedDate = false;
			boolean validnextVersionReleasedDate = false;
			boolean validtrialDays = false;
			boolean validlangUsed = false;
			boolean validminProcessorSpeed = false;
			boolean validminminRamSpaceRequired = false;
			boolean validageLimit = false;
			boolean validnoOfDownloads = false;
			boolean validrating = false;
			boolean validosTypeSupported = false;
			boolean validinternetNeeded = false;
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.err.println("name is invalid");
			}
			if (size > 0 && size < 100) {
				System.out.println("size is valid");
				validsize = true;
			} else {
				System.err.println("size is invalid");
			}
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3
					&& developedBy.length() < 30) {
				System.out.println("developedBy is valid");
				validdevelopedBye = true;
			} else {
				System.err.println("developedBy is invalid");
			}
			if (version > 0 && version < 100) {
				System.out.println("version is valid");
				validversion = true;
			} else {
				System.err.println("version is invalid");
			}
			if (price > 0 && price < 100) {
				System.out.println("price is valid");
				validprice = true;
			} else {
				System.err.println("price is invalid");
			}
			if (trialDays > 0 && trialDays < 7) {
				System.out.println("trialdays is valid");
				validtrialDays = true;
			} else {
				System.err.println("trialdays is invalid");
			}
			if (ageLimit > 0 && ageLimit < 40) {
				System.out.println("agelimit is valid");
				validageLimit = true;
			} else {
				System.err.println("agelimit is invalid");
			}
			if (noOfDownloads > 0 && noOfDownloads < 5) {
				System.out.println("noOfDownloads is valid");
				validnoOfDownloads = true;
			} else {
				System.err.println("noOfDownloads is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validtype = true;
			} else {
				System.err.println("type is invalid");
			}
			if (rating > 0 && rating < 5) {
				System.out.println("rating is valid");
				validrating = true;
			} else {
				System.err.println("rating is invalid");
			}
			if (osTypeSupported != null) {
				System.out.println("osTypeSupported is valid");
				validosTypeSupported = true;
			} else {
				System.err.println("osTypeSupported is invalid");
			}
			if (langUsed != null) {
				System.out.println("lang used is valid");
				validlangUsed = true;
			} else {
				System.err.println("lang used is invalid");
			}
			if (minProcessorSpeed > 0 && minProcessorSpeed < 500) {
				System.out.println("minProcessorSpeed is valid");
				validminProcessorSpeed = true;
			} else {
				System.err.println("minProcessorSpeed is invalid");
			}
			if (minRamSpaceRequired > 0 && minRamSpaceRequired < 500) {
				System.out.println("minRamSpaceRequired is valid");
				validminminRamSpaceRequired = true;
			} else {
				System.err.println("minRamSpaceRequired is invalid");
			}
			LocalDate today = LocalDate.now().plusDays(1);
			if (createDate != null && createDate.isBefore(today)) {
				System.out.println("createddate is valid");
				validcreateDate = true;
			} else {
				System.err.println("created date is invalid");
			}
			LocalDate before = LocalDate.now();
			if (firstVersionReleasedDate != null && firstVersionReleasedDate.isBefore(before)) {
				System.out.println("firstVersionReleasedDate is valid");
				validfirstVersionReleasedDate = true;
			} else {
				System.err.println("firstVersionReleasedDate is invalid");
			}
			LocalDate day = LocalDate.now();
			if (currentVersionReleasedDate != null && currentVersionReleasedDate.isBefore(day)) {
				System.out.println("currentVersionReleasedDate is valid");
				validcurrentVersionReleasedDate = true;
			} else {
				System.err.println("currentVersionReleasedDate is invalid");
			}
			LocalDate afterday = LocalDate.now();
			if (nextVersionReleasedDate != null && nextVersionReleasedDate.isAfter(afterday)) {
				System.out.println("nextVersionReleasedDate is valid");
				validnextVersionReleasedDate = true;
			} else {
				System.err.println("nextVersionReleasedDate is invalid");
			}
			if (internetNeeded == true) {
				System.out.println("internetNeeded is valid");
				validinternetNeeded = true;
			} else {
				System.err.println("internetNeeded is invalid");
			}
			if (validname && validtype && validversion && validsize && validdevelopedBye && validcreateDate
					&& validprice && validfirstVersionReleasedDate && validcurrentVersionReleasedDate
					&& validnextVersionReleasedDate && validtrialDays && validlangUsed && validminProcessorSpeed
					&& validminminRamSpaceRequired && validinternetNeeded && validageLimit && validnoOfDownloads
					&& validrating && validosTypeSupported) {
				System.out.println("data is valid");

			} else {
				System.err.println("data is invalid");
			}

		} else {

			System.err.println("dto is null");
		}

		return false;
	}

}
