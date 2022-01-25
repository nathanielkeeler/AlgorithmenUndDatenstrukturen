package übung6;

import java.util.ArrayList;
import java.util.Arrays;

public class Anwendungsbeispiel {

	public static void main(String[] args) {

		Zahlungsmittel geld[] = { new USD_Muenze(0.10), new USD_Schein(20), new SFR_Schein(5), new SFR_Muenze(0.50),
				new USD_Muenze(0.50), new EUR_Schein(50), new USD_Schein(100), new USD_Muenze(0.2),
				new USD_Muenze(0.25), new EUR_Muenze(0.01), new SFR_Schein(200), new USD_Schein(100), new EUR_Muenze(2),
				new EUR_Schein(5), new USD_Muenze(0.25), new SFR_Muenze(0.10), new SFR_Muenze(0.01),
				new USD_Muenze(0.50), new USD_Schein(100), new USD_Schein(100), new USD_Muenze(0.2),
				new USD_Muenze(0.01), new SFR_Schein(20), new SFR_Muenze(0.50), new USD_Muenze(0.50),
				new EUR_Schein(50), new USD_Schein(5), new EUR_Muenze(0.50), new EUR_Muenze(0.01), new SFR_Schein(10),
				new SFR_Schein(20), new SFR_Muenze(0.50), new SFR_Muenze(0.02) };

		geld = getGueltigeZahlungsmittel(geld);
		printSummeWaehrungen(geld);
		printGesamtgewichtMuenzen(geld);
		printGesamtflaecheScheine(geld);
		printGesamthöheMuenzen(geld);

		Arrays.sort(geld);

		System.out.print("Sortiertes Geld-Array: ");

		for (int i = 0; i < geld.length; ++i) {
			System.out.print(geld[i] + ", ");
		}

		System.out.println();
	}

	private static Zahlungsmittel[] getGueltigeZahlungsmittel(Zahlungsmittel[] geld) {
		int anzahlUngueltigerZahlungsmittel = 0;
		ArrayList<Zahlungsmittel> gueltigeZahlungsmittel = new ArrayList<>();

		for (Zahlungsmittel zahlungsmittel : geld) {

			System.out.println("Wert : " + zahlungsmittel.getWert() + ", Währung : " + zahlungsmittel.getWaehrung());

			if (!zahlungsmittel.wertIstGueltig()) {
				anzahlUngueltigerZahlungsmittel++;
			} else {
				gueltigeZahlungsmittel.add(zahlungsmittel);
			}

			System.out.println("Anzahl ungueltiger Zahlungsmittel : " + anzahlUngueltigerZahlungsmittel);
		}

		return gueltigeZahlungsmittel.toArray(Zahlungsmittel[]::new);
	}

	private static void printSummeWaehrungen(Zahlungsmittel[] geld) {
		double sumUSD = 0.0;
		double sumSFR = 0.0;
		double sumEUR = 0.0;

		for (Zahlungsmittel zahlungsmittel : geld) {
			if (zahlungsmittel.getWaehrung().equals("USD")) {
				sumUSD += zahlungsmittel.getWert();
			} else if (zahlungsmittel.getWaehrung().equals("SFR")) {
				sumSFR += zahlungsmittel.getWert();
			} else {
				sumEUR += zahlungsmittel.getWert();
			}
		}

		System.out.println("Summe USD : " + sumUSD + ", Summe EUR : " + sumEUR + ", Summe SFR : " + sumSFR);
	}

	private static void printGesamtgewichtMuenzen(Zahlungsmittel[] geld) {

		double sumWeight = 0.0;

		for (Zahlungsmittel zahlungsmittel : geld) {
			if (zahlungsmittel instanceof Muenze) {
				sumWeight += ((Muenze) zahlungsmittel).getGewicht();
			}
		}

		System.out.println("Gesamtgewicht der Münzen : " + sumWeight + " g");
	}

	private static void printGesamtflaecheScheine(Zahlungsmittel[] geld) {

		double sumPlane = 0.0;

		for (Zahlungsmittel zahlungsmittel : geld) {
			if (zahlungsmittel instanceof Schein) {
				sumPlane += ((Schein) zahlungsmittel).getBreite() * ((Schein) zahlungsmittel).getLaenge();
			}
		}

		System.out.println("Gesamtfläche der Scheine : " + sumPlane / 10 + " cm^2");
	}

	private static void printGesamthöheMuenzen(Zahlungsmittel[] geld) {
		double sumHeight = 0.0;

		for (Zahlungsmittel zahlungsmittel : geld) {
			if (zahlungsmittel instanceof Muenze) {
				sumHeight += ((Muenze) zahlungsmittel).getDicke();
			}
		}

		System.out.println("Gesamthöhe des Münzenstapels : " + sumHeight / 10 + " cm");
	}
}