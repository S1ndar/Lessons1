package Polymorphism;

public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
    public void bark() {
    	System.out.println("The Dog is barking");
    }
}
