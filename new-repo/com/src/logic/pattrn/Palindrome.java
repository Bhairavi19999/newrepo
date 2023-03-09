package logic.pattrn;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String x,y="";
		Scanner a=new Scanner(System.in);
		System.out.println("enter the word");
		x=a.nextLine();
		int l=x.length();
		for(int k=l-1;k>=0;k--)
			{
			y=y+x.charAt(k);
			}
	if(x.equalsIgnoreCase(y))
	{
		System.out.println("the word is palindrome");
	}
	else
	{
		System.out.println("the word is not a palindrome");
	}

}
}
