package AbstractClasses;

public class Dog implements AbleToMakeSound{ // но у класса dog не будет метода eat, наследуемого от родителя
     public void makeSound() {              
    	 System.out.println("Bark");
     }
}
