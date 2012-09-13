package cracking.chapter4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cracking.utils.Tree;

public class Q4_8_1Test {

	@Test
	public void testIsSubtree() {
		Tree t1 = new Tree();
		t1.insert(10);
		t1.insert(5);
		t1.insert(15);
		t1.insert(3);
		t1.insert(7);
		t1.printTreeInorder();
		System.out.println();
		
		Tree t2 = new Tree();
		t2.insert(5);
		t2.insert(3);
		t2.insert(7);
		t2.printTreeInorder();
		System.out.println();
		
		Tree t3 = new Tree();
		t3.insert(5);
		t3.insert(3);
		t3.insert(10);
		t3.printTreeInorder();
		System.out.println();
		
		Q4_8_1 treeTest = new Q4_8_1();
		
		assertTrue(treeTest.isSubtree(t1.root, t2.root));
		assertFalse(treeTest.isSubtree(t1.root, t3.root));	
		
	}

}
