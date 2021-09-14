package thanveer;

public class CarMain {
	public static void main(String [] args)
	{
		Cars c=new Audi();
		c.accelaration();
		c.applyBrake();
		c.applyClutch();
		c.ChangeGears();
		c.accelaration();
		
		Cars c1=new Benz();
		c1.accelaration();
		c1.applyBrake();
		c1.applyClutch();
		c1.ChangeGears();
		c1.accelaration();
		
		Cars c2=new Kia();
		c2.accelaration();
		c2.applyBrake();
		c2.applyClutch();
		c2.ChangeGears();
		c2.accelaration();
		
	}

}
