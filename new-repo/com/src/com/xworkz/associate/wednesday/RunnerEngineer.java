package com.xworkz.associate.wednesday;

public class RunnerEngineer {

	public static void main(String[] args) {
		Engineer engineer=new Engineer();

engineer.setName("ram");
engineer.setsalary(20000.0);

String[] ref= {"java","c","c++"};
engineer.setSkill(ref);

 Degree degree1=new Degree();
 degree1.setinfo("BE",4,true,7.8,"mechanical");
 
 
 Degree degree2=new Degree();
 degree2.setinfo("MSC",2,false,8.8,"phy");
 
 
 Degree degree3=new Degree(); 
 degree3.setinfo("Bsc",3,true,9.8,"math");
 
 
 Degree[] ref2= {degree1,degree2,degree3};
 engineer.setDegree(ref2);
 engineer.display();

	}

}
