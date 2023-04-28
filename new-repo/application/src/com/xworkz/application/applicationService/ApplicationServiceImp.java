package com.xworkz.application.applicationService;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationServiceImp implements ApplicationService {

	@Override
	public boolean validandsave(ApplicationDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<ApplicationDTO>> cv = validator.validate(dto);
			System.out.println("no. of contraints: " + cv.size());

			if (cv != null && !cv.isEmpty()) {
				cv.forEach(c -> System.out.println(c.getPropertyPath() + " " + c.getMessage()));
			}else {
				
				System.out.println("dto saved");
				return true;
			}
			

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
