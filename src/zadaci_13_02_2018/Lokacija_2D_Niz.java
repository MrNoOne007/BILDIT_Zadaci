package zadaci_13_02_2018;

import java.util.Scanner;

public class Lokacija_2D_Niz {



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
		
		locateLargest(matrix);
	}
	
	public static void locateLargest(double[][] matrix) {

		double max = matrix[0][0];
		int indexRed = 0;
		int indexKolona = 0;
		for (int red = 0; red < matrix.length; red++) {
			for (int kolona = 0; kolona < matrix[red].length; kolona++) {
				if(matrix[red][kolona]>max){
					max = matrix[red][kolona];
					indexRed = red;
					indexKolona = kolona;
				}
			}
			
		}
		System.out.println("Najveci element u matrici je " + max + " na lokaciji " + indexRed + ", " + indexKolona);

	}

}
