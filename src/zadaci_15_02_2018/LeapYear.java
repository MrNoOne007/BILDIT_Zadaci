package zadaci_15_02_2018;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Molim unesite zeljenu pocetnu godinu: ");
		int pocetna = input.nextInt();
		System.out.println("Molim unesite zeljenu krajnju godinu: ");
		int krajnja = input.nextInt();

		int counter = 0;
		for (int i = pocetna; i < krajnja; i++) {
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
				counter++;
				if (counter % 10 == 0) {
					System.out.println(i);

				} else {
					System.out.print(i + " ");
				}
			}

			input.close();
		}
	}
}
