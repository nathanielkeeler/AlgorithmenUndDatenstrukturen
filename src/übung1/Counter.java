package übung1;

public class Counter {
	
	protected int x; // Zählerstand
	private int y; // Gespeicherter Zähler
	
	// Konstruktor
	public Counter() { 
		x = 0;
	}
	
	// Hochzählen
	public void increment() { 
		++x;
	}
	
	// Runterzählen
	public void decrement() {
		if(x>0) {
			--x;
		}
	}
	
	// Auslesen
	public int get() {
		return x;
	}
	
	// Zurücksetzen
	public void reset() {
		x = 0;
	}
	
	// Speichert aktuellen Zählerstand
	public void save() {
		y = x;
	}
	
	// Setzt Zähler auf zuletzt gespeicherten Wert zurück
	public void restore() {
		if (y == 0) {
			System.out.println("Counter has not been saved yet! Please save first.");
			System.exit(1);
		}
		x = y;
	}
}
