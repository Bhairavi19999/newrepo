package com.xworkz.chain;

public class RunnerCupBoard {
	public static void main(String[] args) {
		CupBoard ref=new CupBoard("wood",1500,13,400.6D,300,"woodcentre");
		ref.show();
		System.out.println("              ");
		CupBoard ref1=new CupBoard("wood");
		ref1.show();
		System.out.println("              ");
		CupBoard ref2=new CupBoard("wood",1500);
		ref2.show();
		System.out.println("              ");
		CupBoard ref3=new CupBoard("wood",1500,13);
		ref3.show();
		System.out.println("              ");
		CupBoard ref4=new CupBoard("wood",1500,13,400.6D);
		ref4.show();
		System.out.println("              ");
		CupBoard ref5=new CupBoard("wood",1500,13,400.6D,300);
		ref5.show();
		System.out.println("              ");
		CupBoard ref6=new CupBoard("wood",1500,13,400.6D,300,"woodcentre");
		ref6.show();
		System.out.println("              ");
		

	}

}
