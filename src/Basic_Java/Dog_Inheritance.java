package Basic_Java;

public class Dog_Inheritance extends Animal_Inheritance{ // более узкое понятие, нежели животнотое (Класс потомок)
       
	public void eat() {
       System.out.println(name+" is eating");
    }
	
	public void bark() {
	   System.out.println(name+" is barking");
    }
    public void showInfo() {
	   System.out.println("Dog's name is "+ name);
    }
      
}
// extends - разширяет класс
// Animal ялвяется родителем класса Dog