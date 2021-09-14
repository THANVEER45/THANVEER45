package thanveer;

import java.util.Scanner;

public class Countingchar {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		int a=s.length();
		for(int i=0;i<a;i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Total number of character is:"+count);

	}

}