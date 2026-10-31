package Basic_Java;
public class Inheritance {
	
	
	public static void main(String[] args) {
		Animal_Inheritance animal = new Animal_Inheritance();
		animal.setName("Some animal");
		animal.showInfo();
		animal.eat();
		animal.sleep();
		Dog_Inheritance dog = new Dog_Inheritance();
		dog.setName("Pedro");
		dog.showInfo();
		dog.eat();
		dog.bark();
		Cat_Inheritance cat = new Cat_Inheritance();
		cat.setName("Luka");
		cat.showInfo();
		cat.eat();
		cat.meow();
		
	}
	

}
