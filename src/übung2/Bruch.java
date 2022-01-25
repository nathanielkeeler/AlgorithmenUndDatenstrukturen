package �bung2;

public class Bruch implements Comparable{
	
	private int z�hler;
	private int nenner;
	
	public Bruch() {
		z�hler = 0;
		nenner = 1;
	}
	
	public Bruch(int z�hler) {
		this.z�hler = z�hler;
		nenner = 1;
	}
	
	public Bruch(int z�hler, int nenner) {
		if(nenner == 0) {
			throw new IllegalArgumentException("Nenner darf nicht null sein!", null);
		}
		if(nenner < 0) {
			z�hler *= -1;
			nenner *= -1;
		}
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	
	public Bruch e(int n) {
		Bruch euler = new Bruch();
		for(int i = 0; i <= n; i++) {
			Bruch fac = new Bruch();
			fac.z�hler = 1;
			fac.nenner = factorial(i);
			euler.add(fac);
			System.out.println(euler.get());
			
			double res = euler.toDouble();
			System.out.println(" | " + res);
		}
		return euler;
	}

	public void add(Bruch B) {
		int gn = nenner * B.nenner;
		int answer = z�hler * B.nenner + B.z�hler * nenner;
	    int ggt = ggt(answer, gn);
		z�hler = answer / ggt;
	    nenner = gn / ggt;
	}
	
	public int ggt(int a, int b) {
		if(b > a)	{
			return (ggt(b,a));
		} else {
			return( (b == 0) ? a : ggt(b, a % b) );
		}
	}
	
	public int factorial(int n) {
	    int ans = 0;
		for(int i = 0; i <= n; i++) {
	    	if(i == 0) {
	    		ans = 1;
	    	} else {
	    		ans = ans * i;
	    	}
	    }
		return ans;
	}
	
	public double toDouble() {
		return (double)z�hler / nenner;
		
	}
	
	public String get() {
		return z�hler + "/" + nenner;
	}
	
	public int getNenner() {
		return nenner;
	}

	public int getZ�hler() {
		return z�hler;
	}

	@Override
	public int compareTo(Object o) {
		Bruch bruch = (Bruch)o;
		double bruch1 = (double)this.getZ�hler() / this.getNenner();
		double bruch2 = (double)bruch.getZ�hler() / bruch.getNenner();
		
		return Double.compare(bruch1, bruch2);
	}
}
