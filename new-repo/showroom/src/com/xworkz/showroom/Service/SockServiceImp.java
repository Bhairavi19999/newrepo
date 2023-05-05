package com.xworkz.showroom.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.showroom.Repository.SockRepo;
import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.dto.SockDTO;

public class SockServiceImp implements SockService{
	@Autowired
	private SockRepo sockRepo;
	@Autowired
	private Validator validator;
	@Override
	public boolean validandsave(SockDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null" + dto);
			Set<ConstraintViolation<SockDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.out.println("total violation:" + constraintViolations.size());
				constraintViolations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));
			} else {

				System.out.println("dto saved");
				return this.sockRepo.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
