package com.xworkz.inheritance.tuesday;

public class RunnerAll {

	public static void main(String[] args) {
		
		CandyCrush CandyCrush=new CandyCrush();
		CandyCrush.play();
		Game Game=new CandyCrush();
		CandyCrush game=(CandyCrush)Game;
		game.play();
		System.out.println("        ");
		
		
		
		ValentinesDay ref=new ValentinesDay();
		ref.Tuesday();
		Feb14 Feb14=new ValentinesDay();
		ValentinesDay ref1=(ValentinesDay)Feb14;
		ref1.Tuesday();
		System.out.println("        ");
		
		
		
		Camera ref2=new Camera();
		ref2.capture();
		Device Device=new Camera();
		Camera ref3=(Camera)Device;
		ref3.capture();
		System.out.println("       ");
		
		
		
		Whiskey ref4=new Whiskey();
		ref4.drink();
		Alchohol Alchohol=new Whiskey();
		Whiskey ref5=(Whiskey)Alchohol;
		ref5.drink();
		System.out.println("      ");

		
		Criket ref6=new Criket();
		ref6.players();
		Sport Sport=new Criket();
		Criket ref7=(Criket)Sport;
		ref7.players();

		
		
		
		
		

	}

}
