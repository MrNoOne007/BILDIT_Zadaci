package zadaci_15_02_2018;

import java.util.Scanner;

public class Investicija {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite iznos investicije: ");
		double iznosInvesticije = input.nextDouble();

		System.out.println("Molim unesite iznos interesne stope: ");
		double interesnaStopa = input.nextDouble();

		System.out.println("Molim unesite broj godina: ");
		double brojGodina = input.nextDouble();

		interesnaStopa = interesnaStopa / 1200;
		double buducavrijednost = iznosInvesticije * Math.pow(1 + interesnaStopa, brojGodina * 12);

		System.out.printf("Buduca vrijednost investicije je: %.2f", buducavrijednost);

		input.close();

	}

}
