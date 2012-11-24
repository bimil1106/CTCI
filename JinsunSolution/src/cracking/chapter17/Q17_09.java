package cracking.chapter17;

import java.util.HashMap;

/*
 * Design a method to find the frequency of occurrences of any given word 
 * in a book
 */

public class Q17_09 {
	public static int findFrequencyWord(String word){		
		HashMap<String, Integer> lookupTable = buildLookupTable();	
		
		return lookupTable.containsKey(word)? lookupTable.get(word):0;
	}
	
	public static HashMap<String, Integer> buildLookupTable(){
		HashMap<String, Integer> lookupTable = new HashMap<String, Integer>();
		String book = "this book is very short book this is very meanful work so this is very precious";

		String[] words = book.split(" ");

		for (String word: words) {
			word = word.toLowerCase();
			if (lookupTable.containsKey(word)) {
				int count = lookupTable.get(word);
				lookupTable.put(word, ++count);
			} else {
				lookupTable.put(word, 1);
			}
		}
		
		return lookupTable;
	}
}
