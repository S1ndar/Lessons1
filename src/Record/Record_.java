package Record;

import java.util.Objects;

public class Record_ {
	
	/* Следует учитывать, что мы не можем наследовать запись record от других классов.
	 * Также нельзя наследовать классы от records. Однако классы record могут реализовать интерфейсы. 
	 * Кроме того, классы record не могут быть абстрактными. 
	 * 
	 * В record нельзя явным образом определять нестатические поля и инициализаторы.
	 * Но можно определять статические переменные и инициализаторы, также как статические и нестатические методы
	 */

	public static void main(String[] args) {
        Classs c = new Classs(30,"Bob");         
        Recordd r = new Recordd(30,"Bob");   
        Recordd t = new Recordd(30,"Bob");
	    // record Student == class Student 
        // У record так же будут все setter, getter, 
        // и переопредленные методы equals(), hashCode(), toString()
        System.out.println(r.hashCode());
        System.out.println(t.hashCode());
        System.out.println(r.equals(t));
        System.out.println(r.toString());
        System.out.println(r.age());
        System.out.println(r.name());
        
        System.out.println("__________________");
        
        System.out.println(c.hashCode());
        System.out.println(c.equals(r));
        System.out.println(c.toString());
        System.out.println(c.getAge());
        System.out.println(c.getName());
        
	}

}
// record(){} 
record Recordd(int age,String name){}



// class{}
class Classs{
    private int age;
    private String name;
    public Classs(int a, String n) {
    	name = n;
    	age = a;
    }    
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}
    public void setAge(int age) {
		this.age = age;
	}
    public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Classs d = (Classs) obj;
		return age == d.age &&
			Objects.equals(name, d.name);		
	}
	
	// hashCode() - хэширует (преобразует любой объект в int)
	public int hashCode() { // Без переопредленного hashCode() метода result выдает false 
		return Objects.hash(name, age);
	}
}
