package thanveer;

import java.util.Scanner;

public class MultiThreadEx {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Runnable1 r1=new Runnable1();
		Thread t3=new Thread(r1);
		Runnable2 r2=new Runnable2();
		Thread t4=new Thread(r2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<26;i++)
		{
			System.out.println("Thread1:"+i);
			System.out.println(8/0);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=26;i<51;System.out.println("Thread2:"+i),i++);
	}
}
class Runnable1 implements Runnable
{
	public void run()
	{
		for(int i=51;i<76;System.out.println("Thread3:"+i),i++);
	}
}
class Runnable2 implements Runnable
{
	public void run()
	{
		for(int i=76;i<101;System.out.println("Thread4:"+i),i++);
	}
}