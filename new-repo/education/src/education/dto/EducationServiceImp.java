package education.dto;

public class EducationServiceImp implements EducationService {
	private EducationRepo educationRepo;

	public EducationServiceImp(EducationRepo educationRepo) {
		this.educationRepo = educationRepo;
	}

	@Override
	public boolean saveAndValidate(EducationDTO dto) {
		System.out.println("running in educationserviceimp" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			String studentname = dto.getStudentname();
			int id = dto.getId();
			String stream = dto.getStream();
			Double fee = dto.getFee();

			boolean validstudentname = false;
			boolean validid = false;
			boolean validstream = false;
			boolean validfee = false;
			if (EducationUtil.validString(studentname)) {
				System.out.println("name is valid");
				validstudentname = true;
			} else {
				System.out.println("name is invalid");
			}
			if (EducationUtil.validInt(id)) {
				System.out.println("id is valid");
				validid = true;
			} else {
				System.out.println("id ia invalid");
			}
			if (EducationUtil.validString(stream)) {
				System.out.println("stream is valid");
				validstream = true;
			} else {
				System.out.println("stram is invalid");
			}
			if (EducationUtil.validnumber(fee)) {
				System.out.println("fee is valid");
				validfee = true;
			} else {
				System.out.println("fee is invalid");
			}
			if (EducationUtil.valiFlag(validfee, validid, validstream, validstudentname)) {
				boolean exist = this.educationRepo.isExist(dto);
				if (!exist) {
					boolean save = this.educationRepo.save(dto);
					System.out.println("data is valid" + save);
					return save;
				} else {
					System.out.println("data is invalid");
				}
			}

		} else {
			System.out.println("dto is null");
		}
		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		return educationRepo.isExist(dto);
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		return educationRepo.find(dto);
	}

	@Override
	public EducationDTO findByName(String studentname) {
		if (EducationUtil.validString(studentname)) {
		return educationRepo.findByName(studentname);
	}
		return null;
	}

	@Override
	public int total() {
		return educationRepo.total();
	}

}
