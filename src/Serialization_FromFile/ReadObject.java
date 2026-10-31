package Serialization_FromFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class ReadObject {// Почти всё тоже самое что и в WriteObject
    public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){ // try with resources (Закрывать поток не нужно)
			
			/*Person p1 = (Person)ois.readObject(); // readObject return Object (это родитель), поэтоиу нужен DownCasting
			  Person p2 = (Person)ois.readObject();			
			  System.out.println(p1);
			  System.out.println(p2); // Вывод объектов
			 */
			
			Person[] people = (Person[])ois.readObject(); // мы прировняли массив класса Person и массив, который у нас записан в в файле			
			System.out.println(Arrays.toString(people)); // Вывод массива
					
			} catch (IOException | ClassNotFoundException e) { // ClassNotFoundEXception нужен если в объекте нет нашего класса		
			e.printStackTrace();
			
			// В конце программа выводит нам такую схему -  age ; name (для объектов)
			// [age ; name ;  age ; name  ;  age ; name  ; age ; name] 
		}
	}
}
/* Как это работает?
 * Сначала с помощью класса ObjectInputStream, который ссылается на класс FileInputStream, бинарный код преобразуется в обычный
 * Затем мы выводим эти данные (соблюдая IOException и ClassNotFoundException)
 */