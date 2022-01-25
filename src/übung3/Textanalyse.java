package übung3;

public class Textanalyse {

	final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final int[] index = new int[26];

	public static void main(String[] args) {
		Textanalyse t = new Textanalyse();
		t.getArgumentsAmount(args);
		t.getCharAmount(args);
	}

	private void getArgumentsAmount(String[] args) {
		System.out.println("Number of Arguments: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("Length of Argument " + (i + 1) + ": " + args[i].length());
		}
	}

	private void getCharAmount(String[] args) {
		for (String arg : args) {
			for (int i = 0; i < arg.length(); ++i) {
				char c = charToUpper(arg.charAt(i));
				int position = this.alphabet.indexOf(c);
				++this.index[position];
			}
		}
		printCharOccurences();
	}

	private void printCharOccurences() {
		for (int i = 0; i < index.length; ++i) {
			if (index[i] > 0) {
				System.out.print(this.alphabet.charAt(i) + ": " + index[i] + " | ");
			}
		}
	}

	private static char charToUpper(char c) {
		return Character.toUpperCase(c);
	}
}
