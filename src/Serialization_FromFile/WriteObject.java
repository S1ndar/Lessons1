package Serialization_FromFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
     public static void main(String[] args) {
	     //Person p1 = new Person(10, "Paulo"); // Запись объектов 
	     // Person p2 = new Person(10, "Diablo");
	     Person[] people = {new Person(18, "Paulo"), // Запись массива 
	    		 new Person(39, "Tom"),new Person(50, "Diablo"),};	     
	                                                                               // .bin - файл с бинарными данными     
	     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){ //try with resources (закрывать поток не нужно)                                     
		    // FileOutputStream максимально абстрактен (записывает что угодно)
	        // ObjectOutputStream рассчитан только для записи объектов (не работает без FileOutputStream) 
			
			//oos.writeObject(p1);
			//oos.writeObject(p2);
			oos.writeObject(people);		    		 		   								   			
		} catch (IOException e) {			
			e.printStackTrace();
		}
     }
}


/*Как это работает?
 *1.Сначала ObjectOutputStream преобразует объекты p1 и p2 в последовательность байтов
 *2.Потом с помощью класса FileOutputStream, на который ссылается класс ObjectOutputStream, записывает эту последовательность в файл 
 *3.Затем с помощью интерфейса Serializable, который имплементируется в классе Person происходит запись объекта (соблюдая IOException)
 */
