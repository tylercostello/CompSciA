package FrqPractice3;

public class HiddenWord {
	private String hiddenWord;

	public HiddenWord(String theWord) {
		hiddenWord = theWord;
	}

	public String getHint(String guess) {
		String hintString = "";
		for (int i = 0; i < hintString.length(); i++) {
			if (guess.charAt(i) == hiddenWord.charAt(i)) {
				hintString += guess.charAt(i);
			} else if (hiddenWord.indexOf(guess.charAt(i)) != -1) {
				hintString += "+";
			} else {
				hintString += "*";
			}
		}

		return hintString;
	}
}
