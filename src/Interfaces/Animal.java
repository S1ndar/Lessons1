package Interfaces;

public class Animal implements Info{ // класс может реализовывать любое количество интерфейсов

	private int id;
	private String sound;
	public Animal(int id, String sound) {
		this.id = id;
		this.sound = sound;
	}
    
	public void sleep() {
		System.out.println("I'm sleeping");
	}
		
	@Override // аннотация
	public void showInfo() {
		System.out.println("The animal's Id is "+this.id);				
		System.out.println("The animal makes a "+sound+ " sound");
	}

	
    
}
