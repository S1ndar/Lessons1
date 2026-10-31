package Generics;


import java.util.ArrayList;
import java.util.List;

public class Wildcards {

	public static void main(String[] args) {
		List<Animal> listOfAnimal = new ArrayList<Animal>();
		listOfAnimal.add(new Animal(1));
		listOfAnimal.add(new Animal(2));
        test(listOfAnimal);
        
        List<Dog> listOfDog = new ArrayList<Dog>();
        listOfDog.add(new Dog(3));
        listOfDog.add(new Dog(4));
        test(listOfDog);
        
	}                         //Wildcard, содержимое класса лист принимает только объекты класса Object
    private static void test(List<? extends Animal> list) { // на вход поставляется либо объекты класса Animal, либо же объекты его потомков 
       for (Animal animal : list) {                         // extends - сам класс и его потомки
		 System.out.println(animal);                        // super - сам класс и его родители
		 animal.eat();
	   }
       
    }
    private static void test1(Animal animal) { // на вход можно принять объект класса Dog, так как Dog наследуется от Animal
    	
    }
}           
/*   Иерархия наследования(от высшего к нисшему)
 *    1.Object
 *    2.Animal
 *    3.Dog
 */

