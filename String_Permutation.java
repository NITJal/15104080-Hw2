

import java.util.Scanner;
public class String_Permutation {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		 String_Permutation pm=new  String_Permutation();
		 pm.permutate(s, 0, n-1);
	   
	}
	void permutate(String s, int l, int r)
	{
	
	   int i;
	   if (l == r)
	    System.out.println(s);
	   else
	   {
	       for (i = l; i <= r; i++)
	       {
	          s=swap(s,l,i);
	          permutate(s,l+1,r);
	          s=swap(s,l,i);
	          
	       }
	   }
	}
	
	public String swap(String s,int i,int j)
	{
		char[] c= s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		String s1=String.valueOf(c);
		return s1;
		
	}
}
	