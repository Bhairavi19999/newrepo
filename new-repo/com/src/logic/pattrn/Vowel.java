package logic.pattrn;

import java.io.IOException;

public class Vowel {
	public static void main(String[] args)
	throws IOException
	{
	String str="bhairavi";
	str=str.toLowerCase();
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			count++;
		}
	}
	
	System.out.println("total number og vowels in string is:"+count);
	//System.out.println("given string contains "+str.charAt(i)+"at the index"+i);
	}
}
