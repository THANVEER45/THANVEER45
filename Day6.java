package thanveer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Day6 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(new Mycomparable());
		pq.offer(new Employee1(123,"TOKYO",2000));
		pq.offer(new Employee1(124,"Professor",1000));
		pq.offer(new Employee1(125,"Denver",2500));
		pq.offer(new Employee1(12,"OSLO",3000));
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
	    
	}
}
class Employee1
{
	int id;
	String name;
	double salary;
	public String  toString()
	{
		return "Employee name:"+name+" Employee ID:"+id+" Employee Salary:"+salary;
	}
	public Employee1(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
class Mycomparable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee1 e1=(Employee1)o1;
		Employee1 e2=(Employee1)o2;
		if(e1.salary<e2.salary)
		{
			return -1;
		}
		else if(e1.salary>e2.salary) {
			return 1;
		}
		else { 
			return 0;
		}
	}
	
}