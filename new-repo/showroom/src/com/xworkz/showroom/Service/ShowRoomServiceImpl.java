package com.xworkz.showroom.Service;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.showroom.Repository.ShowRoomRepo;
import com.xworkz.showroom.dto.ShoeShowRoomDTO;

@Component
public class ShowRoomServiceImpl implements ShowRoomService {
	@Autowired
	private ShowRoomRepo shRepo;
	@Autowired
	private Validator validator;
	

	public ShowRoomServiceImpl(ShowRoomRepo shRepo, Validator validator) {
		super();
		this.shRepo = shRepo;
		this.validator = validator;
	}



	@Override
	public boolean validateandsave(ShoeShowRoomDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null"+dto);
			
			Set<ConstraintViolation<ShoeShowRoomDTO>> constraintViolations = validator.validate(dto);

			if (constraintViolations!=null && !constraintViolations.isEmpty()) {
				System.out.println("total violation:" + constraintViolations.size());
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			} else {
				System.out.println("dto saved");
				return this.shRepo.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
