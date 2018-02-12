package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxVrijednost {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int maxBroj  = 0;
		int BrojPonavljanja = 0;

		System.out.println("Unesi cijeli broj, 0 prekida unos: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int broj = input.nextInt();
		while (broj != 0) {
			list.add(broj);
			broj = input.nextInt();
		}

		maxBroj = Collections.max(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == maxBroj) {
				BrojPonavljanja++;
			}
		}
		System.out.println(
				"Najveci uneseni cijeli broj je: " + maxBroj + " i  ponavljao se " + BrojPonavljanja + " puta.");

		input.close();

	}

}
