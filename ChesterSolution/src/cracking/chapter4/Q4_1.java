package cracking.chapter4;

public class Q4_1 {
	static final int UNBALANCED = -1;
	
	static boolean isBalanced(BSTNode tree) {
		return UNBALANCED != getHeight(tree, 0);
	}
	
	static int getHeight(BSTNode node, int depth) {
		if (null == node)
			return depth;
		System.out.println(String.format("Enter getHeight(%s, %d)", node.value, depth));
		int left, right;
		if (UNBALANCED == ((left = getHeight(node.left, depth + 1)))
			|| (UNBALANCED == (right = getHeight(node.right, depth + 1)))
			|| (1 < Math.abs(left - right)))
			return UNBALANCED;
		return Math.max(left, right);
	}
}
