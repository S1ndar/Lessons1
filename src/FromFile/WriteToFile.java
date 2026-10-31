package FromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {

	public static void main(String[] args) throws FileNotFoundException {
		// Для записи данных из файла
		File file = new File("Test2");
        PrintWriter pw = new PrintWriter(file); 
        // PrintWriter прелназначен для записи только текстовых значений
        pw.println("test row 1");
        pw.println("test row 2");
        
        pw.close(); // ОБЯЗАТЕЛЬНО НАДО ЗАКРЫВАТЬ ПОТОК
	}

}
