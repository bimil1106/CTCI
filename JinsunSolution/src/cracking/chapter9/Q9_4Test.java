package cracking.chapter9;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Q9_4Test {

	@Test
	public void testGetAllSubset() {
		//int[] member = {1, 2};
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.addAll(Arrays.asList(1,2,3));
		
		//Q9_4.getAllSubset(set);
		
		// extracts the subset
		ArrayList<ArrayList<Integer>> subSets = Q9_4.getAllSubset(set);

		System.out.println("Subsets:");

		// dump the subsets one by one
		for (ArrayList<Integer> subset : subSets) {
			dump(System.out, subset);
		}
	}
	
	// This method dumps the elements of a set in one line
		// It dumps the set into the given PrintStream object.
		private static void dump(PrintStream out, ArrayList<Integer> set) {
			out.print("{");

			boolean first = true;
			for (int n : set) {
				if (first) {
					first = false;

				} else {
					out.print(", ");

				}
				out.printf("%1$d", n);
			}

			out.println("}");
		}

}
