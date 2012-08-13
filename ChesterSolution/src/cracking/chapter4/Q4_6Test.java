package cracking.chapter4;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking.chapter4.Q4_6.BSTNode;

public class Q4_6Test {
	static BSTNode node(int value, BSTNode left, BSTNode right) {
		BSTNode n = new BSTNode();
		n.value = value;
		n.left = left;
		n.right = right;
		return n;
	}

	BSTNode tree = node(1, 
						node(2,
							node(4,
								node(8, null, null),
								node(9, null, null)
							),
							node(5,
								node(10, null, null),
								node(11, null, null)
							)
						),
						node(3,
							node(6,
								node(12, null, null), 
								node(13, null, null)
							),
							node(7,
								node(14, null, null),
								node(15, null, null)
							)
						)
					);
	
	@Test
	public void testNext() {
		BSTNode next = Q4_6.next(tree);
		assertEquals(2, next.value);
		next = Q4_6.next(tree.left.right);
		assertEquals(6, next.value);
		next = Q4_6.next(tree.right.right);
		assertEquals(8, next);
	}

}
