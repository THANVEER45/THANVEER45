package thanveer;
public class Demo {
static int a=1; //static
int b=2; //non-static
public static void main(String[] args)
{
	Demo demo = new Demo();
	int f1=demo.b;
	int c=a>f1?a:f1;
	System.out.println(c);
}
}
