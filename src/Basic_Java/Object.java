package Basic_Java;

public class Object { // все классы наследуются от класса Object (Constructors)

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
       
      
	}

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	
	
 
	
	
	
	
	
}
