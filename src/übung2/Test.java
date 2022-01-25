package übung2;

public class Test {

	public static void main(String[] args) {

		Bruch x = new Bruch(2,5);
		Bruch y = new Bruch(2,4);
		
		y.add(x);
		System.out.println(y.get());
		
		System.out.println("----------------------");
		
		int n = 5;
		Bruch sum = new Bruch();
		for(int i = 1; i <= n; i++) {
			Bruch z = new Bruch(1, i);
			sum.add(z);
			System.out.println(sum.get() + " ");
		}
		
		System.out.println("----------------------");
		
		Bruch euler = new Bruch();
		euler.e(7);
	}

}
