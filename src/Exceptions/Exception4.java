package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {

	public static void main(String[] args) {
		/*
		try {    // если хотим каждое исключение обработать по своему 
			run();			
		} catch (IOException e) {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} catch (ParseException e) {
			
		}
		
		
		try {    // если без разницы как обрабатывать
			run();
		} catch (IOException | ParseException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
        */
		
		try {    // все Exception наследуются от класса Exception 
			run();
		} catch (Exception e) {
			
		}
	}
	
	
	public static void run() throws IOException, ArrayIndexOutOfBoundsException, ParseException {
		
	}

}
