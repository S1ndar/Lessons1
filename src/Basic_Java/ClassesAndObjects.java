package Basic_Java;

public class ClassesAndObjects { // публичный класс - главный класс в Java, может быть только один

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(-20);
	    person1.speak(); // мы вызвали метод speak
	    System.out.println(person1.getName());
	    System.out.println(person1.getAge());
		

	}

}
// У Класса может быть :
// 1.Данные ( поля ) (рост, вес, скорость)
// 2.Действия, которые он может совершать ( методы ) (прыгать, бегать, летать)

class Person{ // вспомогательный класс
   private String name;// поле
   private int age;
  
   public void setName(String username) { //сетор
	   if(username.isEmpty()){
		   System.out.println("Ты ввёл пустое имя");	   
	   } else {
		   name = username;		   
	   }
   }
   public String getName() { // гетор
	   return name;
   }

   public void setAge(int userage) {
	   if(userage<0) {
		   System.out.println("Возраст должен быть положительным");
	   } else {
		   age = userage;		   
	   }
   }
   public int getAge() {
	   return age;
   }
   
   
   
     void speak() { // метод (объект)
    	 System.out.println("Меня зовут " +name +","+ " мне "+age +"лет" );	 			    	  
    }
     void sayHello() { // ему не нужны данные
	    System.out.println("Привет ");
    }
     int calculateYearsToRetirement() {
    	 int years = 65 - age;
    	 return years;
    	 
     }
    
     
     
  //метод должен что-то вернуть классу, данные из которого он берёт
  //но всё зависит от типа метода (void ничего не возвращает)   
}