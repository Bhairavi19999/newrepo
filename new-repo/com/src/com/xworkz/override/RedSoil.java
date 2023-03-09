package com.xworkz.override;

public class RedSoil extends Soil {
	public RedSoil()
	{
		System.out.println(" no arg cont in RedSoil");
	}
	@Override
	public String minerals()
	{
		return "acid1";
	}

}
