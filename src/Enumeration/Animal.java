package Enumeration;

public enum Animal { // Название enum всегда в единственном числе
    DOG("Собака"), CAT("Кошка"), FROG("лягушка");
 // тоже самое, что и new DOG("собака");	
	String translation;
	Animal(String translation) {
    	this.translation = translation;
    }
	public String toString() {
		return "Перевод на русский язык "+translation;		
	}
}
