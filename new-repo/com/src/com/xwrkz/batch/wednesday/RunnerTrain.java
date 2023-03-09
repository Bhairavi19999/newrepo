package com.xwrkz.batch.wednesday;

public class RunnerTrain {

	public static void main(String[] args) {
Train Train=new Train("vasco");
Train.showdata();
System.out.println("        ");
Train Train1=new Train(16240);
Train1.showdata();
System.out.println("        ");
Train Train2=new Train(156);
Train2.showdata();
System.out.println("        ");
Train Train3=new Train("vasco","tumkur");
Train3.showdata();
System.out.println("        ");
Train Train4=new Train("vasco","tumkur","gubbi");
Train4.showdata();
System.out.println("        ");
Train Train5=new Train("vasco",16240);
Train5.showdata();
System.out.println("        ");
Train Train6=new Train("vasco",156);
Train6.showdata();
System.out.println("        ");
Train Train7=new Train(16240,156);
Train7.showdata();
System.out.println("        ");
}

}
