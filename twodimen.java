package thanveer;
import java.util.*;
public class twodimen {
	public static void main(String[] args)
	{
		
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int[][] arrr=new int[a][b];
 for(int i=0;i<a;i++)
 {
	 for(int j=0;j<b;j++)
	 {
		 arrr[i][j]=sc.nextInt();
	 }
 }
 for(int i=0;i<a;i++)
 {
	 for(int j=0;j<b;j++)
	 {
		 int temp=arrr[i][j];
		 while(temp>0)
		 {
			 System.out.print(temp%10+" ");
			 temp=temp/10;
		 }
		 System.out.println();
	 }
	 System.out.println();
 }
}
}
