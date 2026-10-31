package Basic_Java;

public class Arrays {

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5 };
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		int[] numbers1 = new int[10]; //массив с пустыми ячейками
		
		for (int j = 0; j < numbers1.length; j++) {
			numbers1[j] = j * 10;
			System.out.println(numbers1[j]);
		}

	}

}
