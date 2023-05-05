package com.xworkz.showroom.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showroom.Repository.SalesManagerRepo;
import com.xworkz.showroom.dto.SalesManagerDTO;
@Component
public class SalesManagerServiceImp implements SalesManagerService{
	@Autowired
	private SalesManagerRepo salRepo;
	@Autowired
	private Validator validator;
	@Override
	public boolean validandsave(SalesManagerDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null" + dto);
			Set<ConstraintViolation<SalesManagerDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.out.println("total violation:" + constraintViolations.size());
				constraintViolations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));
			} else {

				System.out.println("dto saved");
				return this.salRepo.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
