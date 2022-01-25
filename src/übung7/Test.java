package übung7;

import übung2.*;

public class Test {
	public static void main(String[] args) {
		MyList<Integer> l = new MyList<>();
		for (int i = 1; i <= 10; ++i)
			l.add(8 * i);
		System.out.println("removed: " + l.remove(4));
		System.out.println(l);
		System.out.println();

		MyList<Bruch> b = new MyList<>();
		Bruch[] c = { new Bruch(5, 5), new Bruch(3, 5), new Bruch(2, 5), new Bruch(5, 5), new Bruch(1, 5) };
		for (Bruch bruch : c)
			b.add(bruch);
		b.remove(2);
		System.out.println(b);
		System.out.println();
	}

}
