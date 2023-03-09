package com.xworkz.override;

public class RunnerOver {
	public static void main(String[] args) {
		Soil soil=new RedSoil();
		System.out.println(soil.minerals());
		soil.wet();
		System.out.println("     ");
		
		
		Garland Garland=new LongGarland();
		Garland.beautiful();
		Garland.decorate();
		System.out.println("     ");
		
		
		Clock clock=new WallClock();
		System.out.println(clock.showdate());
		clock.showday();
		System.out.println("      ");
		
		
		Tiger tiger=new Tigeress();
		tiger.anger();
		tiger.rore();
		System.out.println("    ");
		
		
		Tubelight lamp=new Lamp();
		lamp.length();
		lamp.glowing();
		System.out.println("    ");
		
		
		
		Baloon baloon=new RoundBaloon();
		baloon.blast();
		baloon.expand();
		System.out.println("    ");

		
		Pani pani=new Puri();
		pani.flow();
		pani.liquid();
		System.out.println("   ");
		
		
		

			}

}
