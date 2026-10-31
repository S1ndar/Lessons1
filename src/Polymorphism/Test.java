package Polymorphism;

public class Test {

	public static void main(String[] args) {
		/*Animal animal1 = new Animal();
		Dog dog1 = new Dog();
		animal1.eat();
		dog1.eat();
		*/
	// тип лишь накладывает ограничения	
	//	Animal animal1 = new Dog(); // здесь мы рассматриваем собаку как животное 
	//	animal1.eat();              // когда создается объект класса потомка всегда определяется метод который переопределен в потомке
		                            // это называется позднее связывание
		/*                          
		Dog dog1 = new Dog(); // а здесь собаку как собаку
		dog1.bark();
		dog1.eat();
        */
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		test(animal);
		test(dog);
		test(cat);
		
		
	}
    public static void test(Animal animal) { // полиморфизм (функция с разными типами)
    	animal.eat();
    }

}
