package cracking.chapter4;

/*
 * Given a sorted (increasing order) array, write an algorithm to create a binary
 * search tree with minimal height.
 */

public class Q4_3 {
	static BSTNode create(int value) {
		BSTNode node = new BSTNode();
		node.value = value;
		return node;
	}
	
	static BSTNode buildBST(int[] array) {
		return buildBST(array, 0, array.length-1);
	}
	
	static BSTNode buildBST(int[] array, int start, int end) {
		if (end<start)
			return null;
		int mid = (end-start)/2 + start;
		BSTNode node = create(array[mid]);
		node.left = buildBST(array, start, mid-1);
		node.right = buildBST(array, mid+1, end);
		return node;
	}
	
}
