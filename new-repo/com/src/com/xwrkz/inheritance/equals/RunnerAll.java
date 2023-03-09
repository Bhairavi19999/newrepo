package com.xwrkz.inheritance.equals;

public class RunnerAll {

	public static void main(String[] args) {
		Tv tv = new Tv("lg", 55000, 88);
		System.out.println(tv);
		Tv tv1 = new Tv("sony", 100000, 22);
		System.out.println(tv1);
		Tv tv3 = new Tv("lg", 55000, 88);
		System.out.println(tv3);
		boolean equal = tv.equals(tv1);
		System.out.println(equal);
		boolean equal2 = tv.equals(tv3);
		System.out.println(equal2);

		System.out.println("    ");

		Footware footware = new Footware("VKC", 10, "shoe");
		System.out.println(footware);
		Footware footware1 = new Footware("liberty", 11, "slippers");
		System.out.println(footware1);
		Footware footware2 = new Footware("VKC", 10, "shoe");
		System.out.println(footware2);
		boolean equal3 = footware.equals(footware1);
		System.out.println(equal3);
		boolean equal4 = footware.equals(footware2);
		System.out.println(equal4);

		System.out.println("    ");

		Cake cake = new Cake("venilla", 1000, "round", 2000);
		System.out.println(cake);
		Cake cake1 = new Cake("strawberry", 100, "square", 200);
		System.out.println(cake1);
		Cake cake2 = new Cake("venilla", 1000, "round", 2000);
		System.out.println(cake2);
		boolean equal5 = cake.equals(cake1);
		System.out.println(equal5);
		boolean equal6 = cake.equals(cake2);
		System.out.println(equal6);

		System.out.println("    ");

		WaterFall WaterFall = new WaterFall("jog falls", 129, "shivmoga");
		System.out.println(WaterFall);
		WaterFall WaterFall1 = new WaterFall("manikyadara", 140, "manglore");
		System.out.println(WaterFall1);
		WaterFall WaterFall2 = new WaterFall("jog falls", 129, "shivmoga");
		System.out.println(WaterFall2);
		boolean equal7 = WaterFall.equals(WaterFall1);
		System.out.println(equal7);
		boolean equal8 = WaterFall.equals(WaterFall2);
		System.out.println(equal8);

		System.out.println("   ");

		Alcohol Alcohol = new Alcohol("white", 90, 1000, "whiskey");
		System.out.println(Alcohol);
		Alcohol Alcohol1 = new Alcohol("black", 20, 800, "beer");
		System.out.println(Alcohol1);
		Alcohol Alcohol2 = new Alcohol("white", 90, 1000, "whiskey");
		System.out.println(Alcohol2);
		boolean equal9 = Alcohol.equals(Alcohol1);
		System.out.println(equal9);
		boolean equal10 = Alcohol.equals(Alcohol2);
		System.out.println(equal10);

		System.out.println("    ");

		Fridge Fridge = new Fridge("LG", 12000, 80, 20, 2, 100, "LONG", "BLACK", 1, 5, 40, "RAM");
		System.out.println(Fridge);
		Fridge Fridge1 = new Fridge("sony", 5000, 90, 80, 1, 210, "short", "white", 2, 4, 70, "raj");
		System.out.println(Fridge1);
		Fridge Fridge2 = new Fridge("LG", 12000, 80, 20, 2, 100, "LONG", "BLACK", 1, 5, 40, "RAM");
		System.out.println(Fridge2);
		boolean equal11 = Fridge.equals(Fridge1);
		System.out.println(equal11);
		boolean equal12 = Fridge.equals(Fridge2);
		System.out.println(equal12);

		System.out.println("   ");

		ChiefMinister chiefMinister = new ChiefMinister("AA", 1000, "BB", 550, 60, "white", 10, 50, "CC", 4, 40, 5,
				"DD");
		System.out.println(chiefMinister);
		ChiefMinister chiefMinister1 = new ChiefMinister("DD", 1020, "EE", 850, 40, "BLACK", 20, 60, "FF", 3, 30, 5,
				"GG");
		System.out.println(chiefMinister1);
		ChiefMinister chiefMinister2 = new ChiefMinister("AA", 1000, "BB", 550, 60, "white", 10, 50, "CC", 4, 40, 5,
				"DD");
		System.out.println(chiefMinister2);
		boolean equal13 = chiefMinister.equals(chiefMinister1);
		System.out.println(equal13);
		boolean equal14 = chiefMinister.equals(chiefMinister);
		System.out.println(equal14);

		System.out.println("   ");

		Fish fish = new Fish("gold", 10, 100, "decorte", 70);
		System.out.println(fish);
		Fish fish1 = new Fish("gold", 10, 100, "decorte", 70);
		System.out.println(fish1);
		Fish fish2 = new Fish("brown", 20, 1000, "cooking", 70);
		System.out.println(fish2);
		boolean equal15 = fish.equals(fish1);
		System.out.println(equal15);
		boolean equal16 = fish.equals(fish2);
		System.out.println(equal16);

		System.out.println("    ");

		Park park = new Park("AA", "BB", 10, 20, 30, "SWING");
		System.out.println(park);
		Park park1 = new Park("cc", "dd", 10, 20, 30, "football");
		System.out.println(park1);
		Park park2 = new Park("AA", "BB", 10, 20, 30, "SWING");
		System.out.println(park2);
		boolean equal17 = park.equals(park1);
		System.out.println(equal17);
		boolean equal18 = park.equals(park2);
		System.out.println(equal18);

		System.out.println("   ");

		PoliceStation policeStation = new PoliceStation("aa", "bb", 10, 3, 4, 10, 30, "cc", 10, 10);
		System.out.println(policeStation);
		PoliceStation policeStation1 = new PoliceStation("ee", "ff", 10, 3, 4, 10, 30, "gg", 10, 10);
		System.out.println(policeStation1);
		PoliceStation policeStation2 = new PoliceStation("ee", "ff", 10, 3, 4, 10, 30, "gg", 10, 10);
		System.out.println(policeStation2);
		boolean equal19 = policeStation.equals(policeStation1);
		System.out.println(equal19);
		boolean equal20 = policeStation.equals(policeStation2);
		System.out.println(equal20);

	}

}
