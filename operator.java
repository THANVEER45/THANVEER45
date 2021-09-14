package thanveer;
import java.util.Scanner;

public class operator {

	static void addition(int n,int m)
	{
		System.out.println(n+m);
	}
	static void subtraction(int n,int m)
	{
		System.out.println(n-m);
	}
	static void division(int n,int m)
	{
		System.out.println(n/m);
	}
	static void multiplication(int n,int m)
	{
		System.out.println(n*m);
	}
	static void modulus(int n,int m)
	{
		System.out.println(n%m);
	}
	public static void main(String[] args) {
		System.out.println("1. Arithmetic");
		System.out.println("2. relational");
		System.out.println("3. logical");
		
		System.out.println("choose from above menu");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i==1)
		{
		    System.out.println("1. addition");
		    System.out.println("2. subtraction");
		    System.out.println("3. division");
		    System.out.println("4. multiplication");
		    System.out.println("5. modulus");
		    System.out.println("6. go back");
		    System.out.println("choose from above menu");
			int j=sc.nextInt();
			if(j==1)
			{
				System.out.println("Enter two values");
				int n=sc.nextInt();
				int m=sc.nextInt();
				addition(n,m);
			}
			if(j==2)
			{
				System.out.println("Enter two values");
				int n=sc.nextInt();
				int m=sc.nextInt();
				subtraction(n,m);
			}
			if(j==3)
			{
				System.out.println("Enter two values");
				int n=sc.nextInt();
				int m=sc.nextInt();
				division(n,m);
			}
			if(j==4)
			{
				System.out.println("Enter two values");
				int n=sc.nextInt();
				int m=sc.nextInt();
				multiplication(n,m);
			}
			if(j==5)
			{
				System.out.println("Enter two values");
				int n=sc.nextInt();
				int m=sc.nextInt();
				modulus(n,m);
			}
			else
			{
				System.exit(0);
			}
		}
		else if(i==2)
		{
			System.out.println("1.less than");
			System.out.println("2.less than or equal to");
		    System.out.println("3.greater than");
			System.out.println("4.greater than or equal to");
			System.out.println("5.equal to");
			System.out.println("6.not equal to");
			System.out.println("choose from above menu");
			int j=sc.nextInt();
		}
		else
		{
			System.out.println("1. AND");
			System.out.println("2. OR");
			System.out.println("3. NOT");
			System.out.println("choose from above menu");
			int j=sc.nextInt();
		}


	}

}
