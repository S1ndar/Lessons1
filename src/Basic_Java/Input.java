package Basic_Java;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		System.out.println("Введите что-нибудь");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println("Вы ввели " +a);

	}

}
