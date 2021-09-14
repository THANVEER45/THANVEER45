package thanveer;

public class Rotation {

	public static void main(String[] args) {
		String s1="Thanveer";
		StringBuilder s2=new StringBuilder("reevnahT");
		String s3=s2.reverse().toString();
		if(s1.equals(s3))
		{
			System.out.println("Two String are rotation of each other");
		}
		else 
		{
			System.out.println("Two String are not a rotation of each other");
		}

	}

}