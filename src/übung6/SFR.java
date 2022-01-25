package übung6;

public abstract class SFR extends Zahlungsmittel {
   protected SFR(double wert) {
	   super("SFR", wert);
   }
   public abstract boolean wertIstGueltig();
}
