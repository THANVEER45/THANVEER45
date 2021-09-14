package thanveer;
import java.util.*;
public class numdivisible {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char s1=s.charAt(0); // To get first digit
		int i=Character.getNumericValue(s1); // To convert char to int 
		if(i%2==0)
		{
			System.out.println(i+" is divisible by 2");
		}
		else
		{
			System.out.println(i+" is not divisible by 2");
		}

	}

}