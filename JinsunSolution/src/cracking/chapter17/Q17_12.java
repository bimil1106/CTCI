package cracking.chapter17;

import java.util.HashSet;
import java.util.Set;

/*
 * Design an algorithm to find all pairs of integers within an array which sum to a
 * specified value
 */

public class Q17_12 {
	public static class Pair {
		int left;
		int right;
		
		public Pair(int left, int right) {
			this.left = left;
			this.right = right;
		}
		
		@Override
		public boolean equals(Object o) {
			Pair p = (Pair)o;
			if (p instanceof Pair) {
				return (left == p.right && right == p.left)
						|| (left == p.left && right == p.right);
			}
			
			return false;
		}
		
		@Override
		public int hashCode(){
			final int PRIME = 17;
			int result = 1;
			result = result + PRIME * (left + right);
			return result;
		}
		
		@Override
		public String toString() {
			return "(" + left + " , " + right + ")";
		}
	}
	
	public static Set<Pair> findAllPairsSum(int[] data, int sum) {
		int left, right;
		Set<Pair> pairs = new HashSet<Pair>();
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i; j < data.length; j++) {
				left = data[i];
				right = data[j];
				if (left+right == sum) {
					pairs.add(new Pair(left, right));
				}
			}
		}
		
		System.out.println("Pairs: " + pairs);
		
		return pairs;
	}
}
