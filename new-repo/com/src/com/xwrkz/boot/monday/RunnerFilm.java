package com.xwrkz.boot.monday;

public class RunnerFilm {

	public static void main(String[] args) {
Film Film=new Film();
System.out.println("film name is:"+Film.name);
System.out.println("investment for film is:"+Film.insvestment);
System.out.println("hero name is:"+Film.heroname);
System.out.println("hereoin name is:"+Film.heroinname);
System.out.println("rating for the name is:"+Film.rating);

System.out.println("UPDATED");

Film.name="om";
System.out.println("film name is:"+Film.name);
Film.insvestment=500000;
System.out.println("investment for film is:"+Film.insvestment);
Film.heroname="raj";
System.out.println("hero name is:"+Film.heroname);
Film.heroinname="prema";
System.out.println("hereoin name is:"+Film.heroinname);
Film.rating=5;
System.out.println("rating for the name is:"+Film.rating);

}

}
