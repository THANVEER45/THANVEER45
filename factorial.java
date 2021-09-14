package thanveer;

import java.util.Scanner;

public class factorial {
 public static int factorial(int n)
 {
	 if(n==0)
		 return 1;
	 else
		  return (n*factorial(n-1));
 }
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 int fact = factorial(n);
	 System.out.println(fact);
 }
}
