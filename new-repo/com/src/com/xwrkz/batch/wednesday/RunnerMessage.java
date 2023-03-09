package com.xwrkz.batch.wednesday;

public class RunnerMessage {

	public static void main(String[] args) {
		Message Message=new Message("tumkur");
		Message.showdata();
		System.out.println("        ");
		Message Message1=new Message("tumkur","banglore");
		Message1.showdata();
		System.out.println("        ");

		Message Message2=new Message("tumkur",2023);
		Message2.showdata();
		System.out.println("        ");

		Message Message3=new Message("tumkur",2023,"banglore");
		Message3.showdata();
		System.out.println("        ");

		Message Message4=new Message(true);
		Message4.showdata();
		



	}

}
