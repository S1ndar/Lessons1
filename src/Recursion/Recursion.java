package Recursion;

public class Recursion {
// Стек - последовательное выполнение кода
  // Стек поддерживает две операции :
	// Занесение элементов
	// Извлечение элементов
	
// Все вызовы функции сохраняются в стеке
	
	
	public static void main(String[] args) {
		//counter(3);
          System.out.println(fac(4));
	}    
	/*private static void someMethod() {
		System.out.println("Hello");
		
		
		someMethod(); // Рекурсивный метод (бесконечный цикл)
        // SomeMethod() -> SomeMethod() -> SomeMethod()		
 	}
 		
	// counter(3) -> counter(2) -> counter(1) 
	// static нужен чтобы вызывать метод без класса
	private static void counter(int n) {
		if (n==0) { // Условие для выхода из рекурсии
			return;
		}
		System.out.println(n);
		counter(n-1); // здесь ждут counter(3) и counter(2) и counter(1) пока не получиться 0, что соответсвует условию выхода из рекурсии
		// Так работает факториал n! = n * (n-1) * (n-2) * (n-3) *...*1
	}
	*/
    private static int fac(int n) { // факториал
    	// Базовый случай - аргумент для выхода из цикла 
    	if(n==1) {
    		return 1;
    	}
    	// Рекурсивный случай 
    	return n * fac(n-1); 
    	// n4 = 4 * (4-1)           
    	// n3 = (4-1) * (4-1-1)
    	// n2 = (4-1-1) * (4-1-1-1)
    	// n1 = (1) (4-1-1-1) * (4-1-1-1-1)
    	// fac(4) = n4 * n3 * n2 * n1
    	
    }
}   
