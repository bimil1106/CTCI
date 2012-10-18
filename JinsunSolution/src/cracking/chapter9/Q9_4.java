package cracking.chapter9;

import java.util.ArrayList;

/*
 * Write a method to return all subsets of a set
 * 
 */

/*
 * P({1, 2, 3}) = P({2, 3}) UNION ( P({2, 3}) UNION {1})
 */

/*
 * This method uses a recursive algorithm to find the subsets.
 * 
 * This is the algorithm: suppose we want to extract the subsets of
 * 
 * A = {a, b, c, ...}
 * 
 * First we separate the first element from A:
 * 
 * first-element: a
 * B = {b, c, ...}
 * 
 * Now we use this recursive law:
 * 
 * The subsets of A are the collection of subsets of B,
 * plus the collection of subsets of B once again, but this time
 * the first element a is added to these subset:
 * 
 * Subsets-Of (A) = Subsets-Of (B) + ({a} + Subsets-Of (B))
 * 
 * For example, if A has only two members:
 * 
 * A = {a, b}
 * 
 * then
 * 
 * first-element = a
 * B = {b}.
 * 
 * The subsets of B:
 * {}, {b}
 * 
 * The subsets of B, a added:
 * {a}, {a, b}
 * 
 * Now the whole collection is
 * 
 * Subsets of A: {}, {b}, {a}, {a, b}
 */


public class Q9_4 {
		
	public static ArrayList<ArrayList<Integer>> getAllSubset(ArrayList<Integer> set) {
		
		ArrayList<ArrayList<Integer>> subsetCollection = new ArrayList<ArrayList<Integer>>();
		
		if(set.size() == 0) {
			subsetCollection.add(new ArrayList<Integer>());
		} else {
			ArrayList<Integer> reducedSet = new ArrayList<Integer>();
			reducedSet.addAll(set);
			
			int first = reducedSet.remove(0);
			ArrayList<ArrayList<Integer>> subsets = getAllSubset(reducedSet);
			subsetCollection.addAll(subsets);
			
			subsets = getAllSubset(reducedSet);
			for(ArrayList<Integer> s: subsets){
				s.add(0, first);
			}
			
			subsetCollection.addAll(subsets);
		}
		
		return subsetCollection;
		
	}
}
