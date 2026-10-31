package Basic_Java;

public class Arrays_of_Strings { // Цикл for each

	public static void main(String[] args) {
		int[] numbers = new int[5];

		String[] strings = new String[3];// массив может всметить в себя 3 объекта класса String
		strings[0] = "Привет";
		strings[1] = "Пока";
		strings[2] = "Джава";

		for (int i = 0; i < strings.length; i++) { // цикл for
			System.out.println(strings[i]);
		}

		for (String string : strings) { // цикл for each
			System.out.println(string);
		}

		int[] numbers1 = { 1, 2, 3 };
		int sum = 0;
		for (int x : numbers1) {
			sum = sum + x;
		}
		System.out.println(sum);

		int value = 0; // обычный тип переменной ( дом )
		String s = "sdf"; // ссылочный тип переменной ( адрес дома )

		System.out.println(s);
		System.out.println("a");
	}

}
