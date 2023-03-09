package com.xwrkz.batch.wednesday;

public class RunnerImage {

	public static void main(String[] args) {
		Image Image =new Image("colored");
		Image.showdata();
		System.out.println("       ");
		Image Image1 =new Image(12);
		Image1.showdata();
		System.out.println("       ");

		Image Image2 =new Image(4.5D);
		Image2.showdata();
		System.out.println("       ");

		Image Image3 =new Image(true);
		Image3.showdata();
		System.out.println("       ");

		Image Image4 =new Image("colored","tumkur");
		Image4.showdata();
		System.out.println("       ");

		Image Image5 =new Image("colored","tumkur","JPG");
		Image5.showdata();
		System.out.println("       ");

		Image Image6 =new Image("colored",12);
		Image6.showdata();
		System.out.println("       ");

		Image Image7 =new Image("colored",4.5D);
		Image7.showdata();
		System.out.println("       ");

		Image Image8 =new Image("colored",true);
		Image8.showdata();
		System.out.println("       ");

		Image Image9 =new Image("colored","tumkur",true);
		Image9.showdata();
		
	}

}
