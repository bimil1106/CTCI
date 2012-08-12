package cracking.chapter4;

import org.junit.Test;

import cracking.chapter4.Q4_3.BSTNode;

public class Q4_3Test {

	@Test
	public void testBuildBST() {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		BSTNode tree = Q4_3.buildBST(array);
		printTree(tree, ".");
	}

	private void printTree(BSTNode node, String space) {
		if (node!=null) {
			System.out.println(space + node.value);
			printTree(node.left, space + ".");
			printTree(node.right, space + ".");
		}
	}

}
