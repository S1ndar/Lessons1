package FromFile;
import java.io.File;
import java.io.FileNotFoundException; // исключение
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		/*String separator = File.separator; // слешы в зависимости от OC
		String path = "C:"+separator+"JavaLessons"+separator+"File.Scanner.txt";  //обязательно ставить разширение файла
		File file = new File(path);
        */
		
		
		File file = new File("Test2");
		
		Scanner sc = new Scanner(file);
		/*while(sc.hasNextLine()) { // читает все строки 
			System.out.println(sc.nextLine());
		}
		*/
		
		// Для считывания данных из файла
		Integer f = 0;
		String line = sc.nextLine();  // если 1 строка
		String[] numbersString = line.split(" "); // split() разделяет элементы
		int[] numbers = new int[9];
		//List<Integer> numbers = new ArrayList();
	    
		int counter = 0;
		
		for (String number : numbersString) {
		    numbers[counter++] = f.parseInt(number);
		}
		/*int sum = 0;
		for (int i = 0; i < numbers.length; i++) { // сумма всех чисел массива
	        sum = sum + numbers[i];
	    }
	    System.out.println(sum);
	    */
	    System.out.println(Arrays.stream(numbers).sum()); // сумма всех чисел массива 
		System.out.println(Arrays.toString(numbersString)); // для выведения массива
		sc.close(); // ОБЯЗАТЕЛЬНО НАДО ЗАКРЫВАТЬ ПОТОК
	}

}
