package thanveer;



import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int vowels=0;
		int consonants=0;
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
		int a=s.length();
		for(int i=0;i<a;i++)
		{
			
			if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("Number of vowels is:"+ vowels);
		System.out.println("Number of consonants is:"+consonants);

	}

}
