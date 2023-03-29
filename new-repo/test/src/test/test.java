package test;

public class test {
	1.java components are:
		JVM:java virtual machine.
		JRE:java runtime envirnment.
		JDK:java development kit.

		2.Java features are:
		*platform independent.
		*robust.
		*easy to learn.
		*simple.
		*secure.

		3.Constructor:it is a spl method same as a clasname,it doest have any return statment.
		types are: defaultand paramersized.

		4.variables:variables are nothing but passing ref to the memory location depends on the datatype.
		types are class level variables and method level variables.
		*class level variables are delecre inside the class outside the method.
		static and non static(instance).
		*method level variable are declre inside a method.
		types are local and parameters.
		we intilalize into 4 ways:literals,const,ref,method

		7.oops concepts java supports class,object,polymorphisum,abstraction,inheritance,encapsulation.
		mainly there are 4 principles in java.
		polymorphisum:one action can perform into many ways.
		ther are 2 types:override and overload. 
		abstraction:hiding implimentation and showing the funtions to users.
		to abstraction we use abstract keyword.
		abstract cls and abstract method used acchive abstraction.
		inheritance:inherites properties from parent cls to child cls.
		ther are 4 types:single,multilevel,multiple,herachical.
		use extend keyword.
		encapsulation:binding of cls and methods into single entity.
		using set and get method we achive encapsulation.

		11.Interface is nothing but connection btwn two system.
		it has a is a and has a relation btwn usage and impl class.
		we use interface keyword to achive interface.


		12.Exception it is event when it occurs in a program it stops excution of that code.
		exception is a sub cls of throwable cls.
		throwable cls another sub cls called error.
		exception can handle in 2 ways:try and chach and thrwoable.


		10.reverse a array
		public class Reverse {
		public static void main(String[] args) {
		String array="bhairavi",nword=" ";
		char ch;
		System.out.println("original word is:");
		System.out.println("bhairavi");
		for(int i=0;i<array.length();i++){
		ch=array.charAt(i);
		nword=ch+nword;}
		System.out.println("reverse word is:"+nword);}}


		13.access specifiers are:public private,protected and defalut.
		public can access any package to another.
		private can access only with in the same package.
		protected can access with the same cls only.

		14.abstraction is one of principle in java hiding implienetion and showing functionality to users.
		we acchive 100percent abstrction using interface.
		use abstract keyword.
		*interface is also known as abstract method it is 
		connection btwn two system it consists only methods does not contain body.
		use interface keyword.

}
