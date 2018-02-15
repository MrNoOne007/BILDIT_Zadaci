package zadaci_15_02_2018;

import java.util.Scanner;

public class Pista {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed ");
		double Vspeed = input.nextDouble();
		System.out.print("Enter accelaration ");
		double aAccel = input.nextDouble();

		double Length = Math.pow(Vspeed, 2) / (2 * aAccel);

		System.out.print("The minimum runway length for this airplane is " + Length);

		input.close();

	}

}
