package zadaci_14_02_2018;

import java.util.*;

public class BrojSlova_U_Stringu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Molimo unesite neku rijec: ");
		String rijec = input.nextLine();

		System.out.println("Unesena rijec " + rijec + " sastoji se od " + countLetters(rijec) + " slova");

		input.close();

	}

	public static int countLetters(String s) {

		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counter++;
			}

		}
		return counter;

	}
}
