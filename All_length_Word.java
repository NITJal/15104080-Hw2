import java.util.Scanner;

public class All_length_Word {

public static void main(String[] args) 
{     
	int i;
    System.out.println("Enter string");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=s.length();
    char c[]=s.toCharArray();
    for(i=0;i<=n;i++)
    printAllLength(c,i);
}
static void printAllLength(char c[], int k) {
    int n = c.length;        
    printAllLengthRec(c, "", n, k);
}
static void printAllLengthRec(char c[], String s1, int n, int k) {
     
    if (k == 0) {
        System.out.println(s1);
        return;
    }
    for (int j = 0; j < n; ++j) {

        String s2 = s1 + c[j]; 
        printAllLengthRec(c, s2, n, k - 1); 
    }
}
}