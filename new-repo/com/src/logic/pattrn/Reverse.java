package logic.pattrn;

public class Reverse {
	public static void main(String[] args) {
		String word="bhairavi",nword=" ";
		char ch;
		System.out.println("original word is:");
		System.out.println("bhairavi");
		for(int i=0;i<word.length();i++)
		{
			ch=word.charAt(i);
			nword=ch+nword;
		}
		System.out.println("reverse word is:"+nword);
	}

}
