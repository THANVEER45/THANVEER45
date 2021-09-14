package thanveer;

import java.util.Scanner;

public class OnlyDigits {

		boolean Digits(String str, int n)
	    {
	        for (int i = 0; i < n; i++)
	        {
	            if (Character.isDigit(str.charAt(i))) 
	            {
	                continue;
	            }
	            else 
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	  
	    public static void main(String args[])
	    {
	    	OnlyDigits od=new OnlyDigits();
	    	System.out.println("Enter a String:");
	        Scanner sc=new Scanner(System.in);
	        String str = sc.next();
	        int len = str.length();
	        System.out.println(od.Digits(str, len));
	    }
}
