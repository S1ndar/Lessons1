package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		//////Java5//////
		// ArrayList хранит в себе объекты класса Object 
		List animals = new ArrayList(); // динамический массив
		Animal1 outAnimal = new Animal1();
		
		animals.add("Cat"); // 0
		animals.add("Dog"); // 1
		animals.add("Frog");// 2
		animals.add(outAnimal);
       		
		String animal = (String)animals.get(1); // DownCasting
		System.out.println(animal);
	    
		//////Generics/////
		List<String> animals2 = new ArrayList<String>(); // параметризация (принимает только объекты определенного класса)
		animals2.add("cat");                             // поэтому DownCasting не нужен
		animals2.add("dog");
		animals2.add("frog");

		String animal2 = animals2.get(1);
		
		/////Java7/////
		List<String> animals3 = new ArrayList<>(); 
	}

}
class Animal1{
	
}
