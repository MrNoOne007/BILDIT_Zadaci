package zadaci_13_02_2018;

import java.util.Scanner;

public class MinimalnaVrijednost_U_Nizu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.println("Molimo budite ljubazni pa unesite clanove niza: ");

		for (int i = 0; i < array.length; i++) {
			
			array[i] = input.nextDouble();

		}
		System.out.print("Najmanji clan niza je: " + min(array));
	}

	public static double min(double[] array) {

		double min = array[0];

		for (double member : array) {
			if (member < min) {
				min = member;
			}
		}

		return min;

	}

}
