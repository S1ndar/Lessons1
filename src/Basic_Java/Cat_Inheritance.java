package Basic_Java;
public class Cat_Inheritance extends Animal_Inheritance{
    public void eat() {
    	System.out.println(name+" is eating");
    }
    public void meow() {
    	System.out.println(name+" is meowing");
    }
    public void showInfo() {
    	System.out.println("Cat's name is "+ name);
    }

}
