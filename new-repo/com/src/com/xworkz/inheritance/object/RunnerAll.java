package com.xworkz.inheritance.object;


public class RunnerAll {

	public static void main(String[] args) {
Paint paint1=new Paint();
paint1.setNoofcolors(7);
paint1.setPaintersName("geetha");
paint1.setPrice(1000);
paint1.setType("waterpaint");
System.out.println(paint1);
System.out.println(paint1.hashCode() + "original hashcode is:"+System.identityHashCode(paint1));



System.out.println("    ");


Paint paint2=new Paint();
paint2.setNoofcolors(4);
paint2.setPaintersName("seetha");
paint2.setPrice(100);
paint2.setType("colorpaint");
System.out.println(paint2);
System.out.println(paint2.hashCode() + "original hashcode is:"+System.identityHashCode(paint2));
System.out.println("   ");

boolean equal=paint1.equals(paint2);
System.out.println(equal);
System.out.println("    ");

Adike adike1=new Adike();
adike1.setType("dry");
adike1.setPrice(120);
adike1.setColor("brown");
adike1.setWeigth(90);
System.out.println(adike1);
System.out.println(adike1.hashCode()+"original hashcode is:"+System.identityHashCode(adike1));
System.out.println("   ");

Adike adike2=new Adike();
adike2.setType("dry");
adike2.setPrice(120);
adike2.setColor("brown");
adike2.setWeigth(90);
System.out.println(adike2);
System.out.println(adike2.hashCode()+"original hashcode is:"+System.identityHashCode(adike2));
System.out.println("   ");

boolean equal1=adike1.equals(adike2);
System.out.println(equal1);
System.out.println("    ");


Coconut Coconut1=new Coconut();
Coconut1.setPrice(120);
Coconut1.setWeight(120);
Coconut1.setShape("round");
Coconut1.setTreename("coconuttree");
System.out.println(Coconut1);
System.out.println(Coconut1.hashCode()+"original hashcode is:"+System.identityHashCode(Coconut1));
System.out.println("   ");

Coconut Coconut2=new Coconut();
Coconut2.setPrice(200);
Coconut2.setWeight(120);
Coconut2.setShape("square");
Coconut2.setTreename("coco");
System.out.println(Coconut2);
System.out.println(Coconut2.hashCode()+"original hashcode is:"+System.identityHashCode(Coconut2));
System.out.println("   ");

boolean equal2=Coconut1.equals(Coconut2);
System.out.println(equal2);
System.out.println("    ");


Pipe Pipe1=new Pipe();
Pipe1.setBrand("TMT");
Pipe1.setLength(120);
Pipe1.setThickness(8.8);
Pipe1.setWeigth(30);
System.out.println(Pipe1);
System.out.println(Pipe1.hashCode()+"original hashcode is:"+System.identityHashCode(Pipe1));
System.out.println("   ");

Pipe Pipe2=new Pipe();
Pipe2.setBrand("pipe");
Pipe2.setLength(12);
Pipe2.setThickness(66);
Pipe2.setWeigth(99.9);
System.out.println(Pipe2);
System.out.println(Pipe2.hashCode()+"original hashcode is:"+System.identityHashCode(Pipe2));
System.out.println("   ");

boolean equal3=Pipe1.equals(Pipe2);
System.out.println(equal3);
System.out.println("    ");

Gold Gold1=new Gold();
Gold1.setBuyersname("ram");
Gold1.setGram(120);
Gold1.setPrice(5000);
Gold1.setShopname("vijaya");
System.out.println(Gold1);
System.out.println(Gold1.hashCode()+"original hashcode is:"+System.identityHashCode(Gold1));
System.out.println("   ");

Gold Gold2=new Gold();
Gold2.setBuyersname("raj");
Gold2.setGram(12);
Gold2.setPrice(5500);
Gold2.setShopname("bheema");
System.out.println(Gold2);
System.out.println(Gold2.hashCode()+"original hashcode is:"+System.identityHashCode(Gold2));
System.out.println("   ");

boolean equal4=Gold1.equals(Gold2);
System.out.println(equal4);
System.out.println("    ");



Door Door1=new Door();
Door1.setLength(55);
Door1.setMaterial("wood");
Door1.setThickness(50);
Door1.setWeigth(110);
System.out.println(Door1);
System.out.println(Door1.hashCode()+"original hashcode is:"+System.identityHashCode(Door1));
System.out.println("   ");

Door Door2=new Door();
Door2.setLength(45);
Door2.setMaterial("plastic");
Door2.setThickness(58);
Door2.setWeigth(90);
System.out.println(Door2);
System.out.println(Door2.hashCode()+"original hashcode is:"+System.identityHashCode(Door2));
System.out.println("   ");

boolean equal5=Door1.equals(Door2);
System.out.println(equal5);
System.out.println("    ");

 
Sugarcane Sugarcane1=new Sugarcane();
Sugarcane1.setBuyersname("ram");
Sugarcane1.setLength(22);
Sugarcane1.setOwnername("sam");
Sugarcane1.setShape("round");
System.out.println(Sugarcane1);
System.out.println(Sugarcane1.hashCode()+"original hashcode is:"+System.identityHashCode(Sugarcane1));
System.out.println("   ");

Sugarcane Sugarcane2=new Sugarcane();
Sugarcane2.setBuyersname("raj");
Sugarcane2.setLength(33);
Sugarcane2.setOwnername("sara");
Sugarcane2.setShape("triangle");
System.out.println(Sugarcane2);
System.out.println(Sugarcane2.hashCode()+"original hashcode is:"+System.identityHashCode(Sugarcane2));
System.out.println("   ");

boolean equal6=Sugarcane1.equals(Sugarcane2);
System.out.println(equal6);
System.out.println("    ");






	}
	
	

}
