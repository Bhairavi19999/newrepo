package com.xworkz.override;

public class RoundBaloon extends Baloon{
	public RoundBaloon()
	{
		System.out.println(" no arg const in RoundBaloon");
	}
	@Override
	public void expand()
	{
		System.out.println(" running expend in roundbaloon");
	}

}
