package Access_Modifiers;
public class Access_Modifiers extends Person { // есть доступ в пределах проекта
    /*public int id;
    private int g;
    protected int y;
    public final static String Constant = "Const";
    */
	public static void main(String[] args) {
		Person person1 = new Person();                                                                  
		/* модификаторы доступа: public, private, default(в пределах пакета), protected( в пределах пакета и всем подклассам, даже если они вне пакета.
	    person1.name = "Sasha";
		поля лучше всего делать private из-за правила инкапсуляции,
		НО единственный случай когда поля нужно делать public это когда мы создаем константу :
		public final static String Constant = "const";
		 */
		System.out.println(person1.Constant);
		
		
	}
	
	
	
	public Access_Modifiers(String name) {
		this.name = name;       
	} 


		 
       
		
		
		
		
	private void tecnicalMethod() { // только внутри класса
		
	}
}

class Test2{
	
}