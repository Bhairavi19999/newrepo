package education.dto;

public class EducationRepoImp implements EducationRepo {
	private EducationDTO[] repodto = new EducationDTO[3];
	private int eduindex = 0;

	@Override
	public boolean save(EducationDTO repo) {
		if (eduindex < repodto.length) {
			this.repodto[eduindex] = repo;
			System.out.println("data is saved at index:" + eduindex + "   " + repo);
			this.eduindex++;
			return true;
		} else {
			System.out.println("memory is full");
		}

		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (this.eduindex == 0) {
			return false;
		} else {
			for (int index = 0; index > this.repodto.length; index++) {
				EducationDTO ele = this.repodto[index];
				if (ele != null && ele.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {

		for (int index = 0; index < this.repodto.length; index++) {
			EducationDTO ele = this.repodto[index];
			if (ele != null && ele.equals(dto)) {
				System.out.println("dto is find:" + dto);
				return ele;
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByName(String studentname) {
		for (int index = 0; index < this.repodto.length; index++) {
			EducationDTO ele = this.repodto[index];
			if (ele != null && ele.getStudentname().equals(studentname)) {
				System.out.println("name is find:" + studentname);
			}
		}

		return null;
	}

	@Override
	public int total() {
		return this.eduindex;
	}

}
