package Basic_Java;

public class Animal_Inheritance { // Класс родитель
   String name;     
   public void showInfo() {
		System.out.println("Animal name is "+name);
   }
   public void eat() {
	   System.out.println(name+" is eating");
   }
   public void sleep() {
	   System.out.println(name+" is sleeping");
   }
   public void setName(String name) {
	 this.name = name;
   }
   public String getName() {
	   return name;
   }
}
