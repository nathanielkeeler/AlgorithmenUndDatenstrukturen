package übung7;

public class MyList<T> {
	Chain first;
	Chain last;
	int size;

	class Chain {
		private T o;
		private Chain next;

		Chain(T o) {
			this.o = o;
			next = null;
		}
	}

	public MyList() {
		first = null;
		last = null;
		size = 0;
	}

	public void add(T x) {
		Chain c = new Chain(x);
		c.o = x;
		if (size == 0) {
			first = c;
		}
		if (last != null) {
			last.next = c;
		}
		last = c;
		size++;
	}

	public int size() {
		return size;
	}

	public T get(int index) {
		Chain c = first;
		for (int i = 0; i < index; i++) {
			c = c.next;
		}
		return c.o;
	}

	public T remove(int index) {
		Chain c = first;
		Chain cl = null;

		if (index == 0) {
			first = c.next;
			size--;
			return c.o;
		}

		for (int i = 0; i < index; i++) {
			cl = c;
			c = c.next;
		}

		T removedObject = c.o;
		if (c.next != null) {
			assert cl != null;
			cl.next = c.next;
		} else {
			cl.next = null;
			last = cl;
		}
		size--;

		return removedObject;
	}

	@Override
	public String toString() {
		String str = "first: ";
		for (int i = 0; i < size - 1; i++) {
			str += get(i) + " -> ";
		}
		str += get(size - 1) + " :last";
		return str;
	}
}
