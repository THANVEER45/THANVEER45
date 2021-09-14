package thanveer;

import java.util.Arrays;

public class Anagram {
	Anagram(String s1,String s2)
	{
		boolean b=true;
		if(s1.length()!=s2.length())
		{
			b=false;
		}
		else
		{
			char[] arr1=s1.toLowerCase().toCharArray();
			char[] arr2=s2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			b=Arrays.equals(arr1,arr2);
		}
		if(b)
		{
			System.out.println(s1+" and "+s2+ " are anagrams");
		}else
		{
			System.out.println(s1+" and "+s2+ " are not anagrams");
		}
		
	}
	public static void main(String[] args) {
		Anagram a=new Anagram("Keep","Peek");
		Anagram r=new Anagram("thanveer","ram");


	}
	

}
