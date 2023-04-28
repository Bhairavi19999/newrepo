package sportsspots.dto;

public interface SportRepo {
	boolean save(SportsDTO repo);

	SportsDTO find(SportsDTO dto);

	int total();

	SportsDTO isExist(SportsDTO dto);

}
