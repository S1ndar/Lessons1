package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class CreateException { // Выбрасывание исключений 

	public static void main(String[] args) throws Scanner_Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			//int x = Integer.parseInt(sc.nextLine());
			int x = sc.nextInt(); // то же самое, но короче
			
			if(x != 0) {
				throw new Scanner_Exception("Пользователь ввел что-то кроме нуля");				
			}	
		}	
	}			        
}				
				
			