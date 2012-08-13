package cracking.chapter4;

public class BSTNode {
	BSTNode parent, left, right;
	int value;
	static BSTNode node(int value, BSTNode left, BSTNode right) {
		BSTNode n = new BSTNode();
		n.value = value;
		if (left!=null)
			left.parent = n;
		if (right!=null)
			right.parent = n;
		n.left = left;
		n.right = right;		
		return n;
	}
}
