package übung2;

public class Bruch implements Comparable{
	
	private int zähler;
	private int nenner;
	
	public Bruch() {
		zähler = 0;
		nenner = 1;
	}
	
	public Bruch(int zähler) {
		this.zähler = zähler;
		nenner = 1;
	}
	
	public Bruch(int zähler, int nenner) {
		if(nenner == 0) {
			throw new IllegalArgumentException("Nenner darf nicht null sein!", null);
		}
		if(nenner < 0) {
			zähler *= -1;
			nenner *= -1;
		}
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	public Bruch e(int n) {
		Bruch euler = new Bruch();
		for(int i = 0; i <= n; i++) {
			Bruch fac = new Bruch();
			fac.zähler = 1;
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
		int answer = zähler * B.nenner + B.zähler * nenner;
	    int ggt = ggt(answer, gn);
		zähler = answer / ggt;
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
		return (double)zähler / nenner;
		
	}
	
	public String get() {
		return zähler + "/" + nenner;
	}
	
	public int getNenner() {
		return nenner;
	}

	public int getZähler() {
		return zähler;
	}

	@Override
	public int compareTo(Object o) {
		Bruch bruch = (Bruch)o;
		double bruch1 = (double)this.getZähler() / this.getNenner();
		double bruch2 = (double)bruch.getZähler() / bruch.getNenner();
		
		return Double.compare(bruch1, bruch2);
	}
}
