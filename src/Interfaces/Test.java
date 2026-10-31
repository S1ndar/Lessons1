package Interfaces;

public class Test {

	public static void main(String[] args) {
		/*Animal animal1 = new Animal(1);
		Person person1 = new Person("Bob");		
		animal1.showInfo();
		person1.showInfo();
				
		Info info1 = new Animal(1); // эти классы реализуют интерфейс
		Info info2 = new Person("Bob");
		outputInfo(info1);
		outputInfo(info2);
		*/
		Animal animal1 = new Animal(1, "hawk"); 
		Person person1 = new Person("Bob", "Hello");
		outputInfo(animal1);
        outputInfo(person1);
	}
	
    public static void outputInfo(Info info) { // это метод может действовать на любом из ОБЪЕКТОВ использующих интерфейс Info
    	info.showInfo(); //у интерфейса есть доступ только к этому методу    	
    }
}

