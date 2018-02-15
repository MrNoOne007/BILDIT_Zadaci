package zadaci_15_02_2018;

import java.util.Scanner;

public class String_NeparnePozicije {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Molimo unesite neki string");
		String rijec = input.nextLine();

		for (int i = 0; i < rijec.length(); i += 2) {

			System.out.print(rijec.charAt(i));

			input.close();
		}
	}
}
