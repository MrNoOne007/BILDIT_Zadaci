package zadaci_12_02_2018;

import java.util.ArrayList;

import java.util.List;

public class Najveca_Vrijednosti_U_ArrayListi {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(253);
		list1.add(351);
		list1.add(149);
		list1.add(117);
		list1.add(16);
		list1.add(1);
		list1.add(13);
		
		ArrayList<Integer> praznaLista = new ArrayList<>();

		System.out.println("Najveci element u listi je: " + max(list1));
		System.out.println("Najveci element u praznoj listi je: " + max(praznaLista));
	}

	public static Integer max(ArrayList<Integer> list) {

		int max = 0;
		if (list.isEmpty()) {
			return null;
		} else {
			for (int a : list) {
				if (a > max) {
					max = a;
				}
			}
		}
		return max;

	}
}