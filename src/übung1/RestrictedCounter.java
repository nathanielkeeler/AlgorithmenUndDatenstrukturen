package übung1;

public class RestrictedCounter extends Counter {
	
	private int max;

	public RestrictedCounter(int maxNum) {
		max = maxNum;
	}
	
	public void increment() {
		if (x >= max) {
			x = max;
			System.out.println("Max Capacity reached!");
			return;
		}
		++x;
	}
	
	public int freeCapacity() {
		int free = max - x;
		return free;
	}
}
