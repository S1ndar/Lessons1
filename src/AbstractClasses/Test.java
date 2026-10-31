package AbstractClasses;

public class Test {

	public static void main(String[] args) {
		//Animal an1 = new Animal(); // является концепцией (не может использоваться в коде, в отличие от его наследников)
		Cat cat = new Cat();      // является сущностью
		Dog dog = new Dog();
		cat.makeSound();
		dog.makeSound();
		cat.eat();
		

	}

}
