package FrqPractice2;

public class Frq1 {
	private String recombine(String word1, String word2) {
		return word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2, word2.length());
	}

	private String[] mixedWords(String[] words) {
		String[] returnArray = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			returnArray[i] = recombine(returnArray[i], returnArray[i + 1]);
			returnArray[i + 1] = recombine(returnArray[i + 1], returnArray[i]);
			i = i + 1;
		}
		return returnArray;
	}

}
