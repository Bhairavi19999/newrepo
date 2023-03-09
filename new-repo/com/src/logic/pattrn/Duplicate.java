package logic.pattrn;

public class Duplicate {

	public static void main(String[] args) {
int[] n=new int[] {22,23,24,26,23,22,1,2,1};
System.out.println("duplicate elements are");
for(int i=0;i<n.length;i++)
{
	for(int j=i+1;j<n.length;j++)
	{
	if(n[i]==n[j])
		System.out.println(n[j]);
	}
}
	}

}
