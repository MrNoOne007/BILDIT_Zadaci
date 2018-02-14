package zadaci_14_02_2018;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrefixU_Stringu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String string1 = null;
		String string2 = null;

		System.out.println("Molim unesite prvi string: ");

		try {
			string1 = input.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Unos moraju biti slova");
			System.exit(0);
		}

		System.out.println("Molim unesite drugi string");
		

		try {
			string2 = input.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Unos moraju biti slova");
			System.exit(0);
		}

		input.close();
		System.out.println("Zajednicki  prefiks je: " + prefix(string1, string2));

	}

	public static String prefix(String string1, String string2) {

		int minLength = Math.min(string1.length(), string2.length());
		for (int i = 0; i < minLength; i++) {
			if (string1.charAt(i) != string2.charAt(i)) {
				return string1.substring(0, i);
			}
		}
		return string1.substring(0, minLength);
	}
}
