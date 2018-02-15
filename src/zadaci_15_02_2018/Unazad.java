package zadaci_15_02_2018;

import java.util.Scanner;

public class Unazad {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Molimo unesite cijeli broj");

		int broj = input.nextInt();
		System.out.println(reverse(broj));

		if (isPalindrome(broj))
			System.out.println(" Broj je palindrom ");
		else
			System.out.println("Broj nije palindrom");
		input.close();
	}

	public static int reverse(int broj) {

		int reverse = 0;
		while (broj != 0) {
			
			reverse = reverse * 10 + broj % 10;
			broj = broj / 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int broj) {

		if (broj == reverse(broj)) {
			return true;
		}
		return false;
	}
}
