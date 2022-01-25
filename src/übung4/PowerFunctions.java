package übung4;

public class PowerFunctions {

	private static Counter countPower = new Counter();
	private static Counter countFastPower = new Counter();

	public static double power(double x, int n) {
		double y = Math.pow(x, n);
		for (int i = 0; i < n; i++) {
			countPower.increment();
		}
		return y;
	}

	public static double fastPower(double x, int n) {
		double result = 1;
		while (n > 0) {
			if (n % 2 == 1) {
				result *= x;
				countFastPower.increment();
			}
			x = x * x;
			n = n / 2;
			countFastPower.increment();
		}
		return result;
	}

	public static void resetCounters() {
		countPower.reset();
		countFastPower.reset();
	}

	public static double getCountPower() {
		return countPower.get();
	}

	public static double getCountFastPower() {
		return countFastPower.get();
	}
}
