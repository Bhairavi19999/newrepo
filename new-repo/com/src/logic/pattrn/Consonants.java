package logic.pattrn;

import java.util.Scanner;

public class Consonants {
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter a String");
		Scanner sc=new Scanner(System.in);
		String String=sc.nextLine();
		for(int i=0;i<String.length();i++)
		{
			char ch=String.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("");
			}
			else if(ch!=' ')
			{
			count++;	
			}
		}
		System.out.println("number of consonents in senctence is:"+count);
	}

}
