package cracking.chapter4;

/*
 * Write an algorithm to find the 'next' node (i.e., in-order successor) of a given node 
 * in binary search tree.  You may assume that each node has a link to its parent.
 */

public class Q4_6 {
	static class BSTNode {
		BSTNode parent, left, right;
		int value;
	}
	
	static BSTNode next(BSTNode node) {
		BSTNode parent = node.parent;
		if (parent==null) // which means root
			return node.left;
		else if (node==parent.left)
			return parent.right;
		else if (node==parent.right) {
			BSTNode parentNext = next(parent);
			if (parentNext!=null)
				return parentNext.left;
		}
		return null;
	}
}
