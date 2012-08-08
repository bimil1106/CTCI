package cracking.chapter1;

import java.util.HashSet;
import java.util.Set;

public class Q1_1 {
	static boolean isUnique(String s) {
		Set<Character> set = new HashSet<Character>();
		for (char c: s.toCharArray()) {
			if (set.contains(c))
				return false;
			else
				set.add(c);
		}
		return true;
	}
}