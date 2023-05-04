package com.xworkz.showroom.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;
@Component
public class ShowRoomServiceImpl implements ShowRoomService{

	@Override
	public boolean validandsave(ShoeShowRoomDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<ShoeShowRoomDTO>> cvs = validator.validate(dto);
			System.out.println("no. of contraints: " + cvs.size());

			if (cvs != null && !cvs.isEmpty()) {
				cvs.forEach(c -> System.out.println(c.getPropertyPath() + " " + c.getMessage()));
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
