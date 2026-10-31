package Serialization_FromFile;

import java.io.Serializable;
 
public class Person implements Serializable{ // он разрешает записывать объекты

	private int id;
	private String name;
	private transient String Nickname; // transient используется когда мы не хотим сериализовывать данный объект 
	                                   // (то есть выведет null или 0) 
	
    private static final long serialVersionUID = -372220374360445371L;
    // serialVersionUID нужен для того чтобы помечать состояние класса (когда меняется класс, мы должны перегенировать его)
        
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}	
	
	public String toString() { // возвращает строку 
		return id + " ; "+name;
	}
	
	
}


