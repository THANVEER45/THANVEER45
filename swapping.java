package thanveer;
public class swapping {
static int a=10; //static
int b=20; //non-static
public static void main(String[] args)
{
	swapping s = new swapping();
 a=a+s.b; //for non static use object file
 s.b=a-s.b;
 a=a-s.b;
 System.out.println(a);
 System.out.println(s.b);
}
}
