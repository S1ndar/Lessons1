package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedAndUnchecked {

	public static void main(String[] args) throws FileNotFoundException {
		// Exceptions : 
		// Checked (Complete time exception) без обработки исключений код не скомпилируется (исключительный случай)
        // Unchecked (Runtime exception)     ошибка в коде (нельзя обработать, нужно избавляться от ошибок)
		
		/*
		File file = new File("Test2");
		Scanner sc = new Scanner(file); // Checked
				
		int a = 1/0;  // Unchecked
		System.out.println(a);
				
		String name = null;
		name.hashCode();
		*/	
		
		int[] arr = new int[2];
		System.out.println(arr[2]);
		
	}

}
