package cracking.chapter4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cracking.utils.Tree;
import cracking.utils.Tree.Node;

public class Q4_8Test {

	@Test
	public void testIsSubtree() {
		Tree t1 = new Tree();
		Node root1 = t1.new Node(10);
		root1.left = t1.new Node(20);
		root1.right = t1.new Node(15);
		root1.right.left = t1.new Node(25);
		root1.right.right = t1.new Node(23);
		t1.printTreeInorder(root1);
		System.out.println();
		
		Tree t2 = new Tree();
		Node root2 = t2.new Node(15);
		root2.left = t2.new Node(25);
		root2.right = t2.new Node(23);
		t2.printTreeInorder(root2);
		System.out.println();
		
		Q4_8 q4_8 = new Q4_8();
		
		assertTrue(q4_8.isSubtree(root1, root2));

		Tree t3 = new Tree();
		Node root3 = t3.new Node(10);
		root3.left = t3.new Node(20);
		root3.right = t3.new Node(15);
		root3.right.left = t3.new Node(25);
		root3.right.right = t3.new Node(23);
		root3.right.right.left = t3.new Node(13);
		t3.printTreeInorder(root3);
		System.out.println();
		
		assertFalse(q4_8.isSubtree(root3, root2));
	}

}
