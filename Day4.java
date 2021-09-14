package thanveer;

import java.util.*;
public class Day4 {
	public static void main(String[] args)throws CloneNotSupportedException {
		Employee d1=new Employee(51973276,"SHIVA",1999);
		Employee d2=(Employee) d1.clone();
		d2.employee_name="shiva";
		d2.employee_id=9191191;
		d2.employee_salary=22000;
		System.out.println(d1+" "+d2);
	    Employee d3=new Employee(7272881,"Raj",25000);
		Employee d4=d3;
		d4.employee_name="kumar";
		d4.employee_id=837037948;
		d4.employee_salary=22000;
		System.out.println(d3+" "+d4);
		System.out.println("The Hash code:"+d1.hashCode()+" "+d2.hashCode()+" "+d3.hashCode()+" "+d4.hashCode());
		System.out.println("The Boolean Equals Method: "+d1.equals(d2)+" "+d2.equals(d4));
		d1=null;
		System.gc();
	}
}
class Employee implements Cloneable{
    int employee_id;
    String employee_name;
    int employee_salary;    
    protected Object clone() throws CloneNotSupportedException {
      
        Employee e=new Employee();        
        e.employee_id=this.employee_id;
        e.employee_name=this.employee_name;
        e.employee_salary=this.employee_salary;
        return e;
    }
    public boolean equals(Object obj) {
        Employee e=(Employee)obj;
		return this.employee_id==e.employee_id;
    }
    protected void finalize() throws Throwable {
        System.out.println("Employee object is getting deleted");
    }
    public String toString() {
        return "Employee [Employee_id=" + employee_id + ", Employee_name=" + employee_name + ", Employee_address=" + employee_salary + "]";
    }
    public int hashCode() {
        return employee_id;
    }
    public Employee() {
        
    }
    public Employee(int employee_id, String employee_name, int employee_salary) {
        
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }   
}