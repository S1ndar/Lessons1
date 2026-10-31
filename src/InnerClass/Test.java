package InnerClass;

public class Test {

	public static void main(String[] args) {
		Car car = new Car(1);
		car.start();
	    Car.Battery battery = new Car.Battery(); // мы создали объект класса battery
		// В Java есть 3 типа вложенных классов :
		// 1.Нестатический(приватный)
		// 2.Статический 
		// 3.В методе 

	}

}
