package thanveer;
import java.util.Scanner;
public class Day8 extends Thread{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		new Thread(()-> {for(int i=0;i<=n;i++)) {
			if(i%2==1)
				System.out.println("odd:"+i);}
	}).start();
	new Thread(()-> {for(int i=0;i<=n;i++)) {
		if(i%2==0)
			System.out.println("even"+i);
		}).start();
	}
}