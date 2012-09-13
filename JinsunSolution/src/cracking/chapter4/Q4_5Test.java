package cracking.chapter4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cracking.utils.Tree;
import cracking.utils.Tree.Node;

public class Q4_5Test {

	@Test
	public void testCheckBST() {

		Tree t = new Tree();
		t.insert(15);
		t.insert(20);
		t.insert(25);
		Node root = t.root;
		t.printTreeInorder(root);
		
		System.out.println("Starting checkBST");
		assertTrue(Q4_5.checkBST(root));
		assertTrue(Q4_5.checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		System.out.println();
		
		Tree t2 = new Tree();
		t2.insert(15);
		t2.insert(13);
		t2.insert(25);
		t2.insert(7);
		t2.insert(14);
		
		Node root2 = t2.root;
		t2.printTreeInorder(root2);
		System.out.println("Starting checkBST");
		Q4_5.child = Integer.MIN_VALUE;
		assertTrue(Q4_5.checkBST(root2));
		assertTrue(Q4_5.checkBST(root2, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		System.out.println();
		
		Tree t3 = new Tree();
		Node root3 = t3.root;
		root3 = t3.new Node(15);
		root3.left = t3.new Node(20);
		root3.right = t3.new Node(25);
		
		t3.printTreeInorder(root3);
		System.out.println("Starting checkBST");
		Q4_5.child = Integer.MIN_VALUE;
		assertFalse(Q4_5.checkBST(root3));
		assertFalse(Q4_5.checkBST(root3, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

}
