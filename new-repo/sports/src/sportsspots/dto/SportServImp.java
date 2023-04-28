package sportsspots.dto;

public class SportServImp implements SportService {
	private SportRepo sportRepo;

	public SportServImp(SportRepo sportRepo) {
		this.sportRepo = sportRepo;
	}

	@Override
	public boolean validAndSave(SportsDTO dto) {
		System.out.println("running sport in sportsimp" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			String name = dto.getName();
			int noOfPlyers = dto.getNoOfPlyers();
			String places = dto.getPlaces();
			double salary = dto.getSalary();
			boolean validname = false;
			boolean validnoOfPlyers = false;
			boolean validplaces = false;
			boolean validsalary = false;
			if (Util.validString(name)) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.out.println("name is invalid");
			}
			if (Util.validInt(noOfPlyers)) {
				System.out.println("noOfPlyers is valid");
				validnoOfPlyers = true;
			} else {
				System.out.println("noOfPlyers is invalid");
			}
			if (Util.validString(places)) {
				System.out.println("places is valid");
				validplaces = true;
			} else {
				System.out.println("places is invalid");
			}
			if (Util.validnumber(salary)) {
				System.out.println("salary is valid");
				validsalary = true;
			} else {
				System.out.println("salary is invalid");
			}
			if (Util.valiFlag(validname, validnoOfPlyers, validplaces, validsalary)) {
				boolean save = this.sportRepo.save(dto);
				System.out.println("data is valid");
				return save;
			} else {
				System.out.println("data is invalid");
			}
		} else {
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public SportsDTO find(SportsDTO dto) {
		return sportRepo.find(dto);
	}

	@Override
	public int total() {
		return sportRepo.total();
	}

	@Override
	public SportsDTO isExist(SportsDTO dto) {
		return sportRepo.isExist(dto);
	}

}
