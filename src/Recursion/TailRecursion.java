package Recursion;

// Хвостовая рекурсия - это специальный вид рекурсии, 
// при котором вызов рекурсивной функции является последней операцией в функции. 
// Это позволяет оптимизировать использование памяти и уменьшить вероятность переполнения стека.
public class TailRecursion {
  
	public static void main(String[] args) {
        int result = factorial(5, 1);
        System.out.println("Factorial: " + result);
    }

    public static int factorial(int n, int result) {
        if (n == 0) {
            return result;
        }
        // Вызов рекурсии 
        return factorial(n - 1, n * result);
        // result - получение факториала 
    }
}
	
	


