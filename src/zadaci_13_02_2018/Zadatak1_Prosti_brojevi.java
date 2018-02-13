package zadaci_13_02_2018;

import java.util.*;

public class Zadatak1_Prosti_brojevi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Mollimo unesite pocetni broj: ");

		int pocetni = input.nextInt();

		System.out.print("Molimo unesite krajnji broj: ");
		int krajnji = input.nextInt();

		int broj = 0;

		String primeNumbers = "";

		for (int i = pocetni; pocetni <= krajnji; pocetni++) {
			int counter = 0;
			for (broj = pocetni; broj >= 1; broj--) {
				if (pocetni % broj == 0) {
					counter++;
				}
			}
			if (counter == 2) {

				primeNumbers = primeNumbers + pocetni + " ";
			}
		}
		System.out.println("Prosti brojevi su: " + primeNumbers);

		input.close();

	}
}
