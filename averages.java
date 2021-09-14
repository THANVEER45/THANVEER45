package thanveer;
import java.util.Scanner;

public class averages {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter rollno:");
	    int rollno=sc.nextInt();
	    System.out.println("Enter age:");
	    int age=sc.nextInt();
	    System.out.println("Enter maths mark:");
	    int maths=sc.nextInt();
	    System.out.println("Enter physics mark:");
	    int physics=sc.nextInt();
	    System.out.println("Enter chemistry mark:");
	    int chemistry=sc.nextInt();
	    int total;
	    int avg;
	    total=tot(maths,physics,chemistry);
		avg=average(maths,physics,chemistry);
        display(name,rollno,age,total,avg);
	}
	static int tot(int maths1, int physics1, int chemistry1) {
		     int s=maths1+physics1+chemistry1;
		     return s;
	}
	static int average(int maths2, int physics2, int chemistry2) {
    	int r=(maths2+physics2+chemistry2)/3;
		return r;
	}
    static void display(String name1, int rollno1,int age1, int total1, int avg1) {
		if(avg1>75)
		{
			System.out.println("Name: "+name1+"|roll no: "+rollno1+"|age is: "+age1+"|total is: "+total1+"|average is: "+avg1+"|Grade is: A");
		}
		else if(avg1>65 && avg1<=75)
		{
			System.out.println("Name: "+name1+"|roll no: "+rollno1+"|age is: "+age1+"|total is: "+total1+"|average is: "+avg1+"|Grade is: B");
		}
		else if(avg1>35 && avg1<=65)
		{
			System.out.println("Name: "+name1+"|roll no: "+rollno1+"|age is: "+age1+"|total is: "+total1+"|average is: "+avg1+"|Grade is: C");
		}
		if(avg1<=35)
		{
			System.out.println("Name: "+name1+"|roll no: "+rollno1+"|age is: "+age1+"|total is: "+total1+"|average is: "+avg1+"|Grade is: D");
		}
	}

}