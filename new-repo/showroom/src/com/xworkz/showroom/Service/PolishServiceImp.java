package com.xworkz.showroom.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showroom.Repository.PolishRepo;
import com.xworkz.showroom.dto.PolishDTO;
@Component
public class PolishServiceImp implements PolishService{
	@Autowired
	private PolishRepo poRepo;
	@Autowired
	private Validator validator;

	@Override
	public boolean validandsave(PolishDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null" + dto);
			Set<ConstraintViolation<PolishDTO>> constraintViolations = this.validator.validate(dto);

			if (constraintViolations!=null &&!constraintViolations.isEmpty()) {
				System.out.println("total violation:" + constraintViolations.size());
				constraintViolations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));
			} else {

				System.out.println("dto saved");
				return this.poRepo.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
