package com.xworkz.chain;

public class RunnerPlace {

	public static void main(String[] args) {
Place ref=new Place("TUMKUR",10000000,"KARNATAKA","INDIA","TUMKUR");
ref.show();
System.out.println("              ");

Place ref1=new Place("TUMKUR",10000000);
ref1.show();
System.out.println("               ");

Place ref2=new Place("TUMKUR",10000000,"KARNATAKA");
ref2.show();
System.out.println("               ");

Place ref3=new Place("TUMKUR",10000000,"KARNATAKA","INDIA");
ref3.show();
System.out.println("               ");

Place ref4=new Place("TUMKUR",10000000,"KARNATAKA","INDIA","TUMKUR");
ref4.show();
	}

}
