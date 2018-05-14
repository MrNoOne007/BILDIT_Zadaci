package Banka;

import java.util.Scanner;

public class Banka extends Racun {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		Racun Racun = new Racun(117, 200);
		Racun.ShowMenu();

	}
}
