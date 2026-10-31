package Enumeration; // Перечисление

import java.util.Arrays;

public class Test {
 
	public static void main(String[] args) {
		/*
		Animal animal = Animal.DOG; // инициализация Enum
		System.out.println(animal);
		switch(animal) {
		  case CAT:
			  System.out.println("It's a cat");
			  break;
		  case DOG:
			  System.out.println("It's a dog");
			  break;
		  case FROG:
			  System.out.println("It's a frog");
			  break;
		}
		
		Season season = Season.WINTER;
		System.out.println(season.getTemperature());
		
		
		//Object -> Test
		//Object -> Enum -> Season
		
        System.out.println(season instanceof Season); // instanceof проверяет был ли наш объект WINTER в enum Season
        System.out.println(season instanceof Enum);   // True потому что объекты класса Season также является объектами класса этого родителя (Enum)
        System.out.println(season.getClass());
		switch (season) {
		case WINTER:
			System.out.println("Today is winter");
			break;
		case SUMMER:
			System.out.println("Today is summer");
		    break;
		}
		*/
		
		Season season1 = Season.SUMMER;
		System.out.println(season1.name()); // Выводит название текущей Enum константы (SUMMER)
		
		
		// valueOf() - выводит информацию по String значениие
		Season summer = season1.valueOf("SUMMER"); // Пользователь ввел "SUMMER" и получил нужну информацию
		System.out.println(summer.getTemperature());
	
		Season winter = Season.WINTER;
	    System.out.println(winter.ordinal()); // Выводит индексы из Enum Season 
	    
	    // values() - выводит массив констант Enum
	    Season[] arr = Season.values();
	    System.out.println(Arrays.toString(arr));
	    
	}

}
