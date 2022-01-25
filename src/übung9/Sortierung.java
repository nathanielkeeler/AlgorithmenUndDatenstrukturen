package übung9;

public class Sortierung {

	public static void mergesort(String[] x) {
		int length = x.length;
		if (length < 2) {
			return;
		}
		int mid = (length / 2);
		String[] a = new String[mid];
		String[] b = new String[length - mid];
		for (int i = 0; i < mid; i++) {
			a[i] = x[i];
		}
		for (int i = mid; i < length; i++) {
			b[i - mid] = x[i];
		}
		mergesort(a);
		mergesort(b);
		int leftLength = a.length;
		int rightLength = b.length;
		int mergeTarget = 0;
		int listIndexLeft = 0;
		int listIndexRight = 0;

		while (listIndexLeft < leftLength && listIndexRight < rightLength) {
			if (a[listIndexLeft].compareToIgnoreCase(b[listIndexRight]) <= 0) {
				x[mergeTarget] = a[listIndexLeft];
				listIndexLeft++;
			} else {
				x[mergeTarget] = b[listIndexRight];
				listIndexRight++;
			}
			mergeTarget++;
		}

		while (listIndexLeft < leftLength) {
			x[mergeTarget] = a[listIndexLeft];
			mergeTarget++;
			listIndexLeft++;
		}
		while (listIndexRight < rightLength) {
			x[mergeTarget] = b[listIndexRight];
			mergeTarget++;
			listIndexRight++;
		}
	}

}
