package ua.com.foxmainded.anagrams;

public class Anagrams {

	public void reverseText(String text) {

		Anagrams Text = new Anagrams();

		for (String part : text.split(" ")) {
			Text.reverseWord(part);
//			System.out.print(" ");
		}
	}

	private StringBuilder reverseWord(String word) {

		StringBuilder reversed = new StringBuilder(word);

		int i = 0, j = reversed.length() - 1;
		do {
			char symbolFirst = reversed.charAt(i);
			char symbolSecond = reversed.charAt(j);
			if (Character.isLetter(symbolFirst) & Character.isLetter(symbolSecond)) {
				char temp = symbolFirst;
				symbolFirst = symbolSecond;
				symbolSecond = temp;
				reversed.setCharAt(i, symbolFirst);
				reversed.setCharAt(j, symbolSecond);
				i++;
				j--;
			}

			if (!Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {
				i++;
				j--;
			}

			if (Character.isLetter(symbolFirst) & !Character.isLetter(symbolSecond)) {
				j--;
			}

			if (!Character.isLetter(symbolFirst) & Character.isLetter(symbolSecond)) {
				i++;
			}

		} while (i < j);

		return reversed;
	}

	public static void main(String[] args) {

		Anagrams insert = new Anagrams();
		insert.reverseText("a1bcd efg!h");

	}

}