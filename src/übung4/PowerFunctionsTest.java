package übung4;

public class PowerFunctionsTest {

	public static void main(String[] args) {
		
		PowerFunctions.resetCounters();
		
		double average = 0.0;
		int range = 10000;
		
		for(int i = 0; i < range; i++) {
			double x = Math.random();
			int n = (int)(1000 * x);
			
			average += n;
			PowerFunctions.power(x, n);
			PowerFunctions.fastPower(x, n);
		}
		
		System.out.println("Average Exponent: " + (average / range));
		System.out.println("Average number of multiplications for power: " + (double)PowerFunctions.getCountPower() / range);
		System.out.println("Average number of multiplications for fastPower: " + (double)PowerFunctions.getCountFastPower() / range);
	}
}
