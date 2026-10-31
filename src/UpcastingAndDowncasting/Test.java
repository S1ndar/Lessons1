package UpcastingAndDowncasting;

public class Test { // что-то похожее с СonversionOfPrimitiveDataTypes

	public static void main(String[] args) {
	 	 // Upcasting - Восходящее преобразование( из потомка в родителя) 
		Animal animal1 = new Dog(); // мы собаку воспринимаем как животное 
		animal1.eat();
		Dog dog = new Dog();
		Animal animal2 = dog; // тоже Upcasting, происходит неявно(автоматически)
		
		// Downcasting - Нисходящее преобразование(небезопасно)
		Dog dog1 = (Dog)new Animal();
        Dog dog2 = (Dog)animal2;
        dog2.bark();
        
		Animal a = new Animal();
		Dog dog3 = (Dog) a; // (Dog) меняет ссылку на объект (первый Animal), но не меняяет сам объект 
		dog3.bark();        // поэтому тут ошибка
	}

}
