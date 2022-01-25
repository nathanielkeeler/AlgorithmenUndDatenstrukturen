package übung1;

public class CounterTest {

	public static void main(String[] args) {

		Counter a = new Counter();
		
		int inc = 10; // Counter inc
		int dec = 5; // Counter dec
		
		// Incrementation
		for(int i = 0; i < inc; ++i) {
			a.increment();
			System.out.println(a.get());
		}
		
		a.save();
		
		a.increment();
		a.increment();
		a.increment();
		System.out.println(a.get());
		
		a.restore();
		System.out.println(a.get());
		
		// Decrementation
		for(int i = 0; i < dec; i++) {
			a.decrement();
			System.out.println(a.get());
		}

	}

}
