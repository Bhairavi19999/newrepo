package education.dto;

public interface EducationRepo {
	boolean save(EducationDTO repo);

	boolean isExist(EducationDTO dto);

	EducationDTO find(EducationDTO dto);

	EducationDTO findByName(String studentname);

	int total();

}
