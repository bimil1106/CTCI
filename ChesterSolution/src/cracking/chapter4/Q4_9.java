package cracking.chapter4;

import java.util.ArrayList;
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
		Map<Integer, Integer> prefixSum = new HashMap<Integer, Integer>();
		prefixSum.put(node.value, 0);
		List<Integer> list = new ArrayList<Integer>();
		findSum(node, target, prefixSum, node.value, list);
	}
	
	static void findSum(BSTNode node, int target, Map<Integer, Integer> prefixSum, int sum, List<Integer> list) {
		if (node==null)
			return;
		list.add(node.value);
		Integer prefixKey = node.value + sum;
		prefixSum.put(prefixKey, list.size()-1);
		if (prefixSum.containsKey(node.value - target))
			printList(list, prefixSum.get(node.value-target));
		findSum(node.left, target, prefixSum, prefixKey, list);
		findSum(node.right, target, prefixSum, prefixKey, list);
		prefixSum.remove(prefixKey);
		list.remove(list.size()-1);
	}

	private static void printList(List<Integer> list, int startIndex) {
		System.out.print("[");
		for (int inx=startIndex; inx<list.size(); inx++)
			System.out.print(list.get(inx) + ", ");
		System.out.println("]");
	}
}
