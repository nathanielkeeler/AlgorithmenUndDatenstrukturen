package übung5;

import übung2.Bruch;

public class Sortierung {

	public Sortierung() {
	}

	public void mergesort(Comparable[] x) {
		if (x.length < 2)
			return;

		// Splits Array into two Sub-Arrays
		// Arrays sizes are assigned from 0 to half (for l[]) and from half to x.length (for r[])
		int mid = x.length / 2;
		Comparable[] l = new Comparable[mid];
		Comparable[] r = new Comparable[x.length - mid];

		// Sub-Array values are assinged
		for (int i = 0; i < mid; i++)
			l[i] = x[i];

		for (int i = mid; i < x.length; i++)
			r[i - mid] = x[i];

		mergesort(l);
		mergesort(r);

		merge(x, l, r, mid, x.length - mid);
	}

	private void merge(Comparable[] x, Comparable[] l, Comparable[] r, int left, int right) {
		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {
			if (l[i].compareTo(r[j]) < 0)
				x[k++] = l[i++];
			else
				x[k++] = r[j++];
		}

		while (i < left)
			x[k++] = l[i++];

		while (j < right)
			x[k++] = r[j++];
	}
}
