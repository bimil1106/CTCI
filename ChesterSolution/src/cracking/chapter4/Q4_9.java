package cracking.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * You are given a binary tree in which each node contains a value.  Design an algorithm
 * to print all paths which sum to a given value.  Note that a path can start or end 
 * anywhere in the tree.
 */

public class Q4_9 {
	static void findSum(BSTNode node, int target) {
		Map<Integer, List<Integer>> prefixSum = new HashMap<Integer, List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		findSum(node, target, prefixSum, 0, list);
	}
	
	static void findSum(BSTNode node, int target, Map<Integer, List<Integer>> prefixSum, int sum, List<Integer> list) {
		if (node==null)
			return;
		list.add(node.value);
		int currentSum = node.value + sum;
		List<Integer> values = new ArrayList<Integer>();
		if (prefixSum.containsKey(currentSum))
			values = prefixSum.get(currentSum);
		values.add(list.size() - 1);
		prefixSum.put(currentSum, values);
		if (currentSum == target)
			printList(list,Arrays.asList(-1));
		int startingValue = currentSum - target;
		if (prefixSum.containsKey(startingValue))
			printList(list, prefixSum.get(startingValue));
		findSum(node.left, target, prefixSum, currentSum, list);
		findSum(node.right, target, prefixSum, currentSum, list);
		values.remove(values.size() - 1);
		list.remove(list.size() - 1);
	}

	private static void printList(List<Integer> list, List<Integer> startIndices) {
		for (int startIndex: startIndices) {
			System.out.print("[");
			for (int inx = startIndex + 1; inx<list.size(); inx++)
				System.out.print(list.get(inx) + ", ");
			System.out.println("]");
		}
	}
}
