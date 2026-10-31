package Interfaces;

public class Person implements Info { // классы обязаны реализовывать метод showInfo
    private String name;
    private String talk;
    public Person(String name, String talk) {
    	this.name = name;
    	this.talk = talk;
    }
    public void sayHello() {
    	System.out.println("Hello");
    }
    public void showInfo() {
    	System.out.println("Person's name is "+ this.name);
    	System.out.println("Person is saying "+talk);
    }
	
    
}
