package zadaci_12_02_2018;

import java.util.Scanner;

public class Samoglasnici_Suglasnici {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Molim Vas unesite vasu rijec: ");

		String rijec = input.nextLine();
		int samoglasnici = 0;
		int suglasnici = 0;

		for (int i = 0; i < rijec.length(); ++i) {
			char ch = rijec.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++samoglasnici;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++suglasnici;

			}

		}

		System.out.println("Samoglasnici: " + samoglasnici);
		System.out.println("Suglasnici: " + suglasnici);
		
		input.close();
	}
}