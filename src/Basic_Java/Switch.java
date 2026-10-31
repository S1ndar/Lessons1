package Basic_Java;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваш возраст");
		int age = sc.nextInt();
		switch(age){
		case 0:
			System.out.println("Вы родились");
			break;
		case 7:
			System.out.println("Вы пошли в школу");
			break;
		case 18:
			System.out.println("Вы закончили школу");
			break;
		
		
		
		}
	}

}
