package zadaci_14_02_2018;

public class Pick_Card {

	public static void main(String[] args) {
		// Pick a card
		int card = (int) (Math.random() * 52);
		int rank = card / 4; // determine the rank 0-12
		int suit = card % 4; // determine the suit 0-3

		String strRank = "";
		String strSuit = "";

		switch (rank) {

		case 0:
			strRank = "Ace";
			break;
		case 10:
			strRank = "Jack";
			break;
		case 11:
			strRank = "Kraljica";
			break;
		case 12:
			strRank = "Kralj";
			break;
		default:
			strRank = "" + (rank + 1);
			break;
		}

		switch (suit) {
		case 0:
			strSuit = "djeteline";
			break;
		case 1:
			strSuit = "kocke";
			break;
		case 2:
			strSuit = "srca";
			break;
		case 3:
			strSuit = "lista";
			break;
		}

		System.out.print("Karta koju ste izabrali je " + strRank + " u znaku " + strSuit);

	}



	}


