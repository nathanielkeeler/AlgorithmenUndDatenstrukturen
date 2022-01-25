package übung9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TextAnalyse {
	static Integer line = 1;

	private static boolean isLetter(char c) {
		return ((('a' <= c) && (c <= 'z')) || (('A' <= c) && (c <= 'Z')) || (c == 'ß') || (c == 'ä') || (c == 'ö')
				|| (c == 'ü') || (c == 'Ä') || (c == 'Ö') || (c == 'Ü'));
	}

	private static String readWord(BufferedReader f) throws IOException {
		String s = new String();
		char c;
		int ci;
		// wait for next letter
		do {
			ci = f.read();
			c = (char) ci;
			if (c == '\n') {
				line++;
			}
		} while (!isLetter(c) && (ci != -1));
		// wait for end of word
		while (isLetter(c)) {
			s += c;
			ci = f.read();
			c = (char) ci;
		}
		if (s.length() == 0)
			return null;
		else
			return s;
	}

	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> wordMap = new HashMap<>();
		try {
			BufferedReader f = new BufferedReader(new FileReader("src/übung9/Beispieltext.txt"));
			String s;

			while ((s = TextAnalyse.readWord(f)) != null) {
				if (!wordMap.containsKey(s)) {
					ArrayList<Integer> newArr = new ArrayList<>();
					newArr.add(1);
					newArr.add(line);
					wordMap.put(s, newArr);
				} else {
					ArrayList<Integer> manipulator = wordMap.get(s);
					manipulator.set(0, manipulator.get(0) + 1);
					manipulator.add(line);
					wordMap.put(s, manipulator);
				}
			}
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei:" + e.getMessage());
		}

		String[] keys = wordMap.keySet().toArray(new String[0]);
		Sortierung.mergesort(keys);

		for (String key : keys) {
			ArrayList<Integer> row = wordMap.get(key);
			Integer wordCount = row.get(0);
			row.remove(0);
			System.out.println(wordCount + "x " + key);
			System.out.println(" in Zeile(n): " + row);
		}
	}
}
