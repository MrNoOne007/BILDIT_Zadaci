package zadaci_13_02_2018;

import java.util.Arrays;
import java.util.Scanner;

public class Matrica_Sort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite velicinu matrice: ");
		int n = input.nextInt();
		int m = input.nextInt();

		double[][] matrix = new double[n][m];

		System.out.println("Molimo unesite " + matrix.length + " redova i " + matrix[0].length + " kolona: ");

		for (int red = 0; red < matrix.length; red++) {
			for (int kolona = 0; kolona < matrix[red].length; kolona++) {
				matrix[red][kolona] = input.nextInt();
			}

		}

		// Pozivanje metode
		sortRows(matrix);

		System.out.println("\nMatrica sa sredjenim redovima: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-7.1f", matrix[i][j]);
			}
			System.out.println();
			
			input.close();
		}
		
	}

	public static double[][] sortRows(double[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);

		}

		return matrix;
	}
}