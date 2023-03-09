package com.xworkz.override;

public class WallClock extends Clock {
	public WallClock()
	{
System.out.println(" no arg const in WallClock");
}
	@Override
	public int showdate()
	{
		return 25;
	}

}
