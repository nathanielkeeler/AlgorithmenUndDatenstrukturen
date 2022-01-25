package übung8;

import java.util.ArrayList;

public class Rechner {
	public static ArrayList<Integer> primzahlrechner(int n) {
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> primPool = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			numbers.add(i);
		}
		while (!numbers.isEmpty()) {
			Integer base = numbers.get(0);
			primPool.add(base);
			for (Integer i = base; i <= n; i += base) {
				numbers.remove(i);
			}
		}

		return primPool;
	}
}