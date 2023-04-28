package sportsspots.dto;

public class SportRepoIm implements SportRepo {
	private SportsDTO[] sportsDTOs = new SportsDTO[2];
	int spoindex = 0;

	@Override
	public boolean save(SportsDTO repo) {
		if (spoindex < sportsDTOs.length) {
			this.sportsDTOs[spoindex] = repo;
			System.out.println("data is saved at index:" + spoindex + "  " + repo);
			this.spoindex++;
			return true;
		} else {
			System.out.println("memory is full");
		}
		return false;
	}

	@Override
	public SportsDTO find(SportsDTO dto) {
		return null;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SportsDTO isExist(SportsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
