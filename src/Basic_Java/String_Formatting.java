package Basic_Java;

public class String_Formatting {

	public static void main(String[] args) {
	    System.out.println("Hello");  // println выводит что-то на экран и переносит строку
	    System.out.print("hello again"); 
        System.out.println("hello again");
        System.out.printf(" %s This is a %f string, %d" , "NICE" , 0.0001 , 10000); // s - string ; d - digit 
                                                                                  // f - floating
        
        System.out.printf("String %10d \n", 1);  // \n переносит следующую строку ( как println)
        System.out.printf("String %10d \n", 100);  
        System.out.printf("String %10d \n", 10000);
        System.out.printf("String %10d \n", 1000000000); // printf - форматирует значения
        
        System.out.printf("String %-10d \n", 10);
       
        
		System.out.printf("String %.1f \n", 45.29283746574839); // самый нужный случай применения этой функции
		System.out.printf("String %.2f \n", 45.29283746574839); 
		System.out.printf("String %.3f \n", 45.29283746574839); 
		System.out.printf("String %.4f \n", 45.29283746574839); 
        
        // пример % - [10][.42]
        
        
        
	}

}
