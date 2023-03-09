package com.xworkz.associate.wednesday;

public class RunnerIsro {

	public static void main(String[] args) {
		Isro Isro=new Isro();
		String[] ref= {"banglore","manglore"};
		Isro.setLocation(ref);
		
		
		int[] ref1= {12,18,21};
		Isro.setSatelliteNos(ref1);
		
		
		Scientist scientist1=new Scientist();
			scientist1.setName("abk");
			scientist1.setDisgnation("senior");
				
		Scientist scientist2=new Scientist();
		scientist2.setName("raman");
		scientist2.setDisgnation("junior");
		 
		Scientist[] ref3= {scientist1,scientist2};
		Isro.setScientist(ref3);
				
		Isro.display();
		
		
		
		
	}

}
