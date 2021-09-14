package thanveer;
import java.util.*;

class EmployeeDetails {  

int emp_id, salary;  
String name, address, department, email;  

public int getEmp_id() {  
  return emp_id;  
}  
public void setEmp_id(int emp_id) {  
  this.emp_id = emp_id;  
}  
public int getSalary() {  
  return salary;  
}  
public void setSalary(int salary) {  
  this.salary = salary;  
}  
public String getName() {  
  return name;  
}  
public void setName(String name) {  
  this.name = name;  
}  
public String getAddress() {  
  return address;  
}  
public void setAddress(String address) {  
  this.address = address;  
}  
public String getEmail() {  
  return email;  
}  
public void setEmail(String email) {  
  this.email = email;  
}  
  
public String toString() {  
  return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address  
          + ", email = " + email + "]";  
  }  
    
}  

public class DAY3{  

  public static void main(String args[]) {  
        
     
      EmployeeDetails emp = new EmployeeDetails(); 
      emp.setEmp_id(101);  
      emp.setName("Thanveer Ram R");   
      emp.setSalary(20000);  
      emp.setAddress("Chennai");  
      emp.setEmail("thanveerram.r@hcl.com");  
      System.out.println(emp);  
      int sal = emp.getSalary();  
      
  } 
}  