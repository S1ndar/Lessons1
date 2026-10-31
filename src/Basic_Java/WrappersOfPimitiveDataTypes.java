package Basic_Java;

public class WrappersOfPimitiveDataTypes {

	public static void main(String[] args) {
		int x = 1; // если нужно просто число то используем примитив
		
		Integer x2 = new Integer(123); // класс обертка
		
		Integer x3 = 123; // автоупаковка
		int y = x3;       // автораспаковка
		
	    Integer.parseInt("1234");  // перевод из String в Int (статический метод)
	    
	   
		
		// Классы обертки Double, Integer, Character, Float, Short, Byte, Long, Boolean 
	}

}
