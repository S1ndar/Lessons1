package Basic_Java;

public class Static {

	public static void main(String[] args) {
		     
        Hman h1 = new Hman("Bob", 40);
        Hman h2 = new Hman("Tom", 90);
        Hman h3 = new Hman("Tom", 90);
        h1.printNumberOfPEople();
    
        
        
        
        //Hman.descruption = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        //Hman.descruption = "Bad";
        h1.getAllFields();
        h2.getAllFields();
        
        
        
		/*System.out.println(Math.pow(2, 4));
		  System.out.println(Math.PI); */
	}

}   // Math - колекция статических объектов (public static final double)

class Hman{ // переменные класса инициализируются автоматически
	
	private static int countPeople; // инициализируется только когда в main создается объект
	private String name;
	private int age;
	//public static String descruption; // выводится для одного объекта, работает для всех классов
	                                    // имеет начальное значение
		
	public Hman(String name, int age) {
		this.name = name;
		this.age = age;
		countPeople++;
	}
	
	public void printNumberOfPEople() {
		System.out.println("Number of people is "+countPeople);
	}
	
	public void getAllFields() {
		System.out.println(name+", "+age/*+", "+descruption*/);
	}
    
	/*public static void printAllFields() { // этот метод один для всех объектов и выводит только одно значение
		System.out.println(descruption);
	}
	*/
}