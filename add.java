package thanveer;

public class add {
	static int a=10; //static
	int b=20; //non-static
	public static void main(String[] args) {
		add s=new add();
		
        while (s.b != 0){
            int carry = (a & s.b) ; //CARRY is AND of two bits
          
            a = a ^s.b; //SUM of two bits is A XOR B
          
            s.b = carry << 1; //shifts carry to 1 bit to calculate sum
            
            System.out.println(a);
            
            while (s.b != 0)
            {
                // borrow contains common
                // set bits of y and unset
                // bits of x
                int c = (~a) & s.b;
         
                // Subtraction of bits of x
                // and y where at least one
                // of the bits is not set
                a = a ^ s.b;
         
                // Borrow is shifted by one
                // so that subtracting it from
                // x gives the required sum
                s.b = c << 1;
            }
            System.out.println(a);
            
        }
        }
       
 }

