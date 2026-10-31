package Basic_Java;

public class SetterAndGetter {

	public static void main(String[] args) {
		Man human1 = new Man();
		human1.setAge(18);
		human1.setName("Ben");
		human1.getInfo();
        Man human2 = new Man();
        human2.setAge(22);
		human2.setName("Tom");
		human2.getInfo();
	}

}
class Man {
	private String name;//this вызывает объект внутри метода (в контексте сеторов)
	private int age;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}	
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void getInfo() {
		System.out.println(this.name+", " + this.age);
	}

}
