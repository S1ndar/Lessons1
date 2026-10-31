package Basic_Java;

public class AnonymousClasses {

	public static void main(String[] args) {
		/*Animal animal = new Animal();
		animal.eat();
        
		Animal animal2 = new Animal() { // Anonymous class, объект который здесь создается это наследник класса Animal
			public void eat() {
				System.out.println("Other animal is eating"); // можем использовать его только один раз  
			}
			
		};
		animal2.eat();
		*/
		
		/*AbleToEat ableToEat = new Human();
		ableToEat.eat();
		*/
		
		AbleToEat able = new AbleToEat() { // Anonymous class, класс который реализует метод интерфейса
			                               // Используем, когда нам от класса нужно исполнение только одного метода
			@Override
			public void eat() {
				System.out.println("Someone is eating");
				
			}
		};
		able.eat(); 
	}

}

interface AbleToEat{
	public void eat();
}

/*
class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
}
*/

/*class Human implements AbleToEat{
	public void eat() {
		System.out.println("a");
	}
}
*/