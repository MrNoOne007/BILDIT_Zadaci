package zadaci_12_02_2018;

import java.util.Scanner;

public class Najveci_zajednicki_djelilac {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Molimo unesite dva broja");

		int broj1 = input.nextInt();
		int broj2 = input.nextInt();

		int NZD = 1;
		int N = 2;

		while (N <= broj1 && N <= broj2) {

			if (broj1 % N == 0 && broj2 % N == 0) {

				NZD = N;
			}

			N++;
		}
		System.out.println("Najveci zajednicki djelilac za brojeve " + broj1 + " i " + broj2 + " je " + NZD);

		input.close();

	}

}
