package com.xworkz.chain;

public class RunnerIron {

	public static void main(String[] args) {
		        Iron ref=new Iron("IRON","TATA",7.5D,"HOME","ROD",1000,true,44,26,55.85D);	
				ref.show();
				System.out.println("              ");

		        Iron ref1=new Iron("IRON");	
				ref1.show();
				System.out.println("              ");

				Iron ref2=new Iron("IRON","TATA");	
				ref2.show();
				System.out.println("              ");

				Iron ref3=new Iron("IRON","TATA",7.5D);	
				ref3.show();
				System.out.println("              ");

				Iron ref4=new Iron("IRON","TATA",7.5D,"HOME");	
				ref4.show();
				System.out.println("              ");

				Iron ref5=new Iron("IRON","TATA",7.5D,"HOME","ROD");	
				ref5.show();
				System.out.println("              ");

				Iron ref6=new Iron("IRON","TATA",7.5D,"HOME","ROD",1000);	
				ref6.show();
				System.out.println("              ");

				Iron ref7=new Iron("IRON","TATA",7.5D,"HOME","ROD",1000,true);	
				ref7.show();
				System.out.println("              ");

				Iron ref8=new Iron("IRON","TATA",7.5D,"HOME","ROD",1000,true,44);	
				ref8.show();
				System.out.println("              ");

				Iron ref9=new Iron("IRON","TATA",7.5D,"HOME","ROD",1000,true,44,26);	
				ref9.show();
				System.out.println("              ");

				Iron ref10=new Iron("IRON","TATA",7.5D,"HOME","ROD",1000,true,44,26,55.85D);	
				ref10.show();
	}

}
