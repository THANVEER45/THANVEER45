package thanveer;

import java.util.*;

public class Asssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CAT METHOD:");
		Animal c1=new Cat();
		Pet c2=new Cat();
		c2.setName("Tiger");
		c2.getName();
		c2.play();
		c1.walk();
		c1.eat();	
		System.out.println("FISH METHOD:");
		Animal f1=new Fish();
		Pet f2=new Fish();
		f2.setName("Jelly");
		f2.getName();
		f2.play();
		f1.walk();
		f1.eat();
		System.out.println("SPIDER METHOD:");
		Animal s=new Spider();
		s.walk();
		s.eat();
	}	   
}
class Spider extends Animal{

	public void walk() {
		System.out.println("The Spider Walks By Leg ");
	}

	public void eat() {
		System.out.println("The Spider eats Pest");
		
	}
	
}
class Cat extends Animal implements Pet{
	private String name;
	public void walk() {
		System.out.println("The Cat Walks By Leg");
	}
	public void eat() {
		System.out.println("The Cat eats: Meat");
	}
	public void getName() {
		System.out.println("The Cat Name is: "+name);
	}
	public String setName(String name) {
		return this.name=name;
	}
	public void play() {
		System.out.println("The Cat Plays Football");
		
	}
}
class Fish extends Animal implements Pet{
	private String name;
	public void walk() {
		System.out.println("The Fish does not Walks But Swims");
	}
	public void eat() {
		System.out.println("The Fish eats: Algae");
	}
	public void getName() {
		System.out.println("The Fish Name is: "+name);
	}
	public String setName(String name) {
		return this.name=name;
	}
	public void play() {
		System.out.println("The Fish Plays Gymnastics");
		
	}
}
abstract class Animal
{
	public abstract void walk();
	public abstract void eat();
}
interface Pet
{
	public void getName();
	public String setName(String name);
	public void play();
}