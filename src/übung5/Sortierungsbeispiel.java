package übung5;

import übung2.Bruch;

public class Sortierungsbeispiel {

	public static void main(String[] args) {

		final Integer[] a = { 15, 3, 8, 9, 20, 70, 4, 6, 53, 1024, 1, 32, 69, 44, 9, 77, 89, 99, 583, 325 };
		final String[] b = { "loves", "hates", "sees", "knows", "looks for", "finds", "able", "ceta", "penelope",
				"gustav", "cinema", "xylophon" };
		final Bruch[] c = { new Bruch(2, 5), new Bruch(15, 4), new Bruch(2, 4), new Bruch(2, 8), new Bruch(9, 6), new Bruch(1, 4), new Bruch(1, 3) };

		Sortierung S = new Sortierung();
		S.mergesort(a);
		S.mergesort(b);
		S.mergesort(c);

		System.out.print("a: ");
		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.print("b: ");
		for (int i = 0; i < b.length; ++i)
			System.out.print(b[i] + " ");
		System.out.println();
		
		System.out.print("c: ");
		for (int i = 0; i < c.length; ++i)
			System.out.print(c[i].get() + " ");
		System.out.println();
	}

}
