package Basic_Java;

public class Constructors_Object {

	public static void main(String[] args) {
		Human human1 = new Human(); // при создании объектов образуется конструктор 
	    human1.toString(); // возвращает хэшкод созданный для этого объекта (Object)
		human1.getInfo();
		System.out.println(human1);
		System.out.println(human1.getClass());
		
	}

}

class Human { // изменяемый класс
	private String name;
	private int age;		
	
	//constructor
	public Human() {
		this.name = "Имя по умолчанию";
		this.age = 0;
			
	}
	public Human(String name, int age) {		
		this.name = name;     
		this.age = age;
	}
	public void getInfo() {
		System.out.println(this.name+", " + this.age);
	}
	
	public String toString() { // представляет объект в виде строки, мы переопределили метод toString (Object)
	   return name+", "+age;   
	}
}
//Конструктор, отличается от метода тем, что у него нет типа
//перегрузка методов