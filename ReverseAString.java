package thanveer;
import java.util.*;
public class ReverseAString {

	static void reverseWords(String str)
	{
		int k=0;
		for(int i=0;;i++)
		{
			if(str.charAt(i)==' ')
			{
				k=i+1;
				for(int j=i-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
				break;
			}
		}
	
        for (int l= k; l < str.length(); l++) 
        {
        	if(l==str.length()-1)
        	{
        		for(int h=l;h>=k;h--)
                {
               	 System.out.print(str.charAt(h));
                }
        		System.out.print(" ");
        	}
        	else if (str.charAt(l) == ' ')
            {
                for(int h=l-1;h>=k;h--)
                {
            	 System.out.print(str.charAt(h));
                }
                System.out.print(" ");
                k=l+1;
            }
        }
 }

 public static void main(String[] args)
 {
	    System.out.println("Enter a String:");
	 	Scanner sc=new Scanner(System.in);
	 	String s1 = sc.nextLine();
        reverseWords(s1);

 }
}
