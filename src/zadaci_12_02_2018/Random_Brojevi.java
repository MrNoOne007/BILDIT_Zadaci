package zadaci_12_02_2018;

public class Random_Brojevi {

	public static void main(String[] args) {

		
		// Niz od 10 :) 
		int[] niz = new int[10];

		// petlja koja ispsiuje 100 puta vrijednost od 0 do 9
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 10);
			niz[broj]++;
		}
		
		//petlja koja broji ponavljanja

		for (int i = 0; i < niz.length; i++) {
			System.out.println(i + " ponavlja " + niz[i] + " puta.");
		}

	}

}
