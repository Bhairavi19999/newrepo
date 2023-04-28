package education.dto;

public interface EducationService {
	boolean saveAndValidate(EducationDTO dto);

	boolean isExist(EducationDTO dto);

	EducationDTO find(EducationDTO dto);

	EducationDTO findByName(String studentname);

	int total();

}
