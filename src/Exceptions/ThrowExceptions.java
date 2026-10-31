package Exceptions;

import java.io.File;
import java.io.FileNotFoundException; // все исключения н6аследуются от класса Exception
import java.util.Scanner;

public class ThrowExceptions {

	public static void main(String[] args) {
	/*  try {                                  // Исключение
		   File file = new File("Test2");     // Если тут находят ошибку то сразу переходит к обработке исключения
		   Scanner sc = new Scanner(file);
		   String line = sc.nextLine();
		   System.out.println(line);		   
	} catch (FileNotFoundException e) {         // Обработка исключения
		System.out.println("Файл не найден");
	}
	 
	   System.out.println("После блока try catch");	
	*/
		//readFile(); // Мы должны добавить исключение во все методы где используется метод readFile 
		
		try {                                 
			 readFile();
			 System.out.println("Исключения нет");    // Лучше обрабатывать исключения самим
		} catch (FileNotFoundException e) {         
		    System.out.println("Обработка исключения в методе main");
		}
	}	
	public static void readFile() throws FileNotFoundException {
		File file = new File("Test2");
		Scanner sc1 = new Scanner(file);
		
	}

}
