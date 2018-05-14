package Banka;

import java.util.*;

public class Racun {

	Scanner input = new Scanner(System.in);

	static int Userid;
	static double balance;
	static double isplati;
	static double uplati;
	static double iznos;

	public Racun() {

	}

	public Racun(int Userid, double balance) {

		Racun.Userid = Userid;
		Racun.balance = balance;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		Racun.balance = balance;
	}

	public double getIsplati() {
		return isplati;
	}

	public void setIsplati(double isplati) {
		Racun.isplati = isplati;
	}

	public double getUplati() {
		return uplati;
	}

	public void setUplati(double uplati) {
		Racun.uplati = uplati;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		Racun.iznos = iznos;
	}

	public void Isplati(double iznos) {

		if (iznos < balance && iznos > 0) {
			balance = balance - iznos;
			System.out.println("Podigli ste " + iznos + " i stanje vaseg racuna je:  " + balance);
		} else {
			System.out.println("Molimo unesite iznos manji od ukupnog stanja, i iznos koji je veci od nule");
		}
	}

	public void Uplati(double iznos) {

		if (iznos > 0) {
			balance = balance + iznos;
			System.out.println("Uplatili ste " + iznos + " i stanje vaseg racuna je:  " + balance);
		} else {

			System.out.println("\n" + "Molimo unesite pozitivan broj! ");
		}
	}

	public void Balance() {
		System.out.println("Stanje vaseg racuna je : " + balance);
	}

	public void ShowMenu() throws Exception {

		int izbor = 0;

		System.out.println("====================================================");
		System.out.println("Dobrodosli i hvala Vam sto koristite nas bankomat ");
		System.out.println("Vas User ID je: " + Userid);
		System.out.println("====================================================");
		System.out.println("1. Provjeri stanje");
		System.out.println("2. Uplati novac");
		System.out.println("3. Isplati novac");
		System.out.println("4. Exit ");

		do {
			System.out.println("====================================================");
			System.out.println("Izaberite jednu od ponudjenih opcija ");
			System.out.println("====================================================");
			izbor = input.nextInt();
			System.out.println("\n");

			switch (izbor) {

			case 1:
				System.out.println("------------------------------------------------");
				System.out.println("Stanje vaseg racuna je : " + balance + " KM");
				System.out.println("-------------------------------------------------");
				System.out.println("\n");
				break;

			case 2:
				System.out.println("------------------------------------------------ ");
				System.out.println(" Unesite iznos koji zelite uplatiti " + " KM");
				System.out.println("-------------------------------------------------");
				int iznos = input.nextInt();
				Uplati(iznos);
				System.out.println("\n");
				break;

			case 3:
				System.out.println("------------------------------------------------ ");
				System.out.println(" Unesite iznos koji zelite za isplatu " + " KM");
				System.out.println("-------------------------------------------------");
				int iznos1 = input.nextInt();
				Isplati(iznos1);
				System.out.println("\n");
				break;

			case 4:
				System.out.println("---------------------------------------------------");
				break;

			default:
				System.out.println("Pogresan unos!! Molimo pokusajte ponovo!");
				break;
			}
		} while (izbor != 4);
		System.out.println(" Hvala sto ste koristili nase usluge :) ");

	}
}