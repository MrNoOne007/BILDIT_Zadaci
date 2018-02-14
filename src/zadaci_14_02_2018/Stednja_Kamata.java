package zadaci_14_02_2018;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Stednja_Kamata {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double iznos = 0;
		int mjesec = 0;
		System.out.println("Molimo unesite iznos mjesecne stednje: ");

		try {
			iznos = input.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos. Molimo unesite decimalan broj");
			System.exit(0);
		}

		System.out.println("Molimo unesite broj mjeseci: ");

		try {
			mjesec = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos. Molimo unesite cijeli broj");
			System.exit(0);
		}

		racunajsumu(iznos, mjesec);
		input.close();
	}

	public static void racunajsumu(double iznos, int mjesec) {
		double suma = 0;
		double mjesecnakamata = 0.00417;
		for (int i = 1; i <= mjesec - 1; i++) {
			suma = (int) ((iznos + suma) * (1 + mjesecnakamata));
		}

		System.out.printf("Ukupana suma za " + mjesec + " mjesec" + " je " + "%5.3f", suma);

	}
}