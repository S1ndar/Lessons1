package Basic_Java;

class String_Builder {

	public static void main(String[] args) {
	    String x = "Hello"; //  Так как на этот объект никакая переменная не ссылается, он удаляется
	    x.toUpperCase(); // Все методы класса string не изменяют строку, а возвращают новую
	    x = x.toUpperCase();  // со всеми неизменяемыми объектами  
	    System.out.println(x);
	   
		
		  String s1 = "Hello ";
		  String s2 = "my";
		  String s3 = " friend";
		  String sAll = s1+s2+s3; // s1+s2=s12; s12+s3=s123=sAll - 2 дополнительные строки 
		  System.out.println(sAll);
		
		
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1.toString());
		sb1.append(" my"); // дополняет строку в StringBuilder
		sb1.append(" friend");
		System.out.println(sb1.toString());
		
		
    }

}
// используется когда мы хотим часто изменять строку 