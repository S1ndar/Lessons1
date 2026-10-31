package Generics;

public class Animal {
	 private int id;
     public void eat() {
    	 System.out.println("Animal is eating");
     }
     public Animal() { // создаем дефолтный конструктор чтобы у класса потомка не возникало ошибок
    	               // конструктор родителя и конструктор потомка должны быть идентичны
     }
     public Animal(int id){
        this.id = id;	 
     }
     public String toString() {
    	 return String.valueOf(id);
     }
}
