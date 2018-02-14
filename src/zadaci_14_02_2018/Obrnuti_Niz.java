package zadaci_14_02_2018;

import java.util.Scanner;

public class Obrnuti_Niz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite deset cijelih brojeva: ");
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");

			input.close();
		}
	}
}
