package com.xworkz.associate.wednesday;

public class RunnerHospital {

	public static void main(String[] args) {
Hospital hospital=new Hospital();
hospital.setName("balaji");

Doctor doctor=new Doctor();
doctor.setinfo("shree", 2.6);
	String[] ref1= {"liver","heart"};
	doctor.setSpec(ref1);
	
	Doctor doctor1=new Doctor();
	doctor1.setinfo("sam", 1.9);
		String[] ref2= {"kedney","eyes"};
		doctor1.setSpec(ref2);
		
		Doctor[] ref3= {doctor,doctor1};
		hospital.setDoctor(ref3);

		
		
		hospital.display();	
	
	
	
	
	
	}

}
