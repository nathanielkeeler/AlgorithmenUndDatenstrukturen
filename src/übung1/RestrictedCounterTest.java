package übung1;

public class RestrictedCounterTest {

	public static void main(String[] args) {

		RestrictedCounter r = new RestrictedCounter(15);
		
		for(int i = 0; i < 20; ++i) {
			r.increment();
			System.out.println("r= " + r.get() + " (free capacity= " + r.freeCapacity() + ")");
		}
		
		for(int i = 0; i < 20; ++i) {
			r.decrement();
			System.out.println("r= " + r.get() + " (free capacity= " + r.freeCapacity() + ")");
		}
	}

}
