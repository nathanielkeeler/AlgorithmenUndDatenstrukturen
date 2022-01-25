package übung8;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<>();
		li.add("Montag");
		li.add("Dienstag");
		li.add("Mittwoch");
		li.add("Donnerstag");
		li.add("Freitag");
		li.add("Samstag");
		li.add("Sonntag");

		TreeSet<String> bb = new TreeSet<>();
		HashSet<String> ht = new HashSet<>();

		for (String s : li) {
			bb.add(s);
			ht.add(s);
		}
		System.out.println();
		System.out.println(li);
		System.out.println(bb);
		System.out.println(ht);
		System.out.println();

		ArrayList<Iterator<String>> holdIT = new ArrayList<>();

		holdIT.add(li.iterator());
		holdIT.add(bb.iterator());
		holdIT.add(ht.iterator());

		for (Iterator<String> it : holdIT) {
			while (it.hasNext()) {
				System.out.println(it.next());
				if (it.hasNext())
					it.next();
			}
			System.out.println();
		}

		ArrayList<Integer> primPool = Rechner.primzahlrechner(1000);
		System.out.print("Primzahlen: ");
		System.out.println(primPool);

		System.out.print("Primzahlzwillinge: ");
		for (int i = 0; i + 1 < primPool.size(); i++) {
			Integer next = primPool.get(i + 1);
			Integer now = primPool.get(i);
			if (next - now <= 2) {
				System.out.print("(" + now + "," + next + ") ");
			}
		}

	}

}
