package �bung1;

public class Counter {
	
	protected int x; // Z�hlerstand
	private int y; // Gespeicherter Z�hler
	
	// Konstruktor
	public Counter() { 
		x = 0;
	}
	
	// Hochz�hlen
	public void increment() { 
		++x;
	}
	
	// Runterz�hlen
	public void decrement() {
		if(x>0) {
			--x;
		}
	}
	
	// Auslesen
	public int get() {
		return x;
	}
	
	// Zur�cksetzen
	public void reset() {
		x = 0;
	}
	
	// Speichert aktuellen Z�hlerstand
	public void save() {
		y = x;
	}
	
	// Setzt Z�hler auf zuletzt gespeicherten Wert zur�ck
	public void restore() {
		if (y == 0) {
			System.out.println("Counter has not been saved yet! Please save first.");
			System.exit(1);
		}
		x = y;
	}
}
