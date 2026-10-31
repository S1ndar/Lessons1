package Equals_StringPool;

public class Equals_StringPool {

	public static void main(String[] args) {
		/*int x = 1;
		  int c = 1;
		  System.out.println(x==c); // сравнение примитивов
        
		                            // -> указатель
		Animal an1 = new Animal(1); // an1 -> участок памяти{1}
		Animal an2 = new Animal(1); // an2 -> другой участок памяти{1}
		
		
		Animal an3 = new Animal(1);
		Animal an4 = an3;
	    System.out.println(an3 == an4); // == сравнивает ссылки(указатели), работает только для примитивов, и если эти ссылки будут равны
		
		
		//System.out.println(an1.equals(an2)); // тоже самое что и == (нужно переопределить метод equals чтобы все заработало)
		
		System.out.println(an1.equals(an2));
		
						
		String string1 = "hello"; // string1 -> участок памяти{"hello"}             
		String string2 = "hello"; // string2 -> такой же участок памяти{"hello"}
		
		System.out.println(string1==string2); // НО с классом string такое работает(из-за String pool)
		// String pool ссылапет указатели на одну и ту же строку, если эти строки одинаковы
		
		String string3 = new String("hello"); // НО такой метод уже не сработает
		String string4 = new String("hello"); // у этих объектов разные ссылки
		System.out.println(string3==string4);
		*/
		
		
		String a = "bye";
		String b = "bye23".substring(0,3);
		
		System.out.println(a==b); // ВСЕГДА если мы хотим структурно сравнить объекты нужно использовать метод equals
	}

}


class Animal{
	private int id;
	
	public Animal(int id) {
		this.id = id;
	}
	
	
	public boolean equals(Object ob) { // мы переопределили метод equals
		Animal otherAn = (Animal)ob; // Downcasting object to animal
		return this.id == otherAn.id;
		
		
	}
}
