package sportsspots.dto;

public interface SportService {
	boolean validAndSave(SportsDTO dto);

	SportsDTO find(SportsDTO dto);

	int total();

	SportsDTO isExist(SportsDTO dto);

}
