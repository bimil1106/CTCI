package cracking.chapter4;

import static cracking.chapter4.BSTNode.node;
import static org.junit.Assert.*;

import org.junit.Test;

public class Q4_1Test {
	BSTNode tree = node(1, 
			node(2,
				node(4,
					node(8, null, null),
					null
				),
				node(5,
					node(10, null, null),
					node(11, null, null)
				)
			),
			node(3,
				node(6,
					node(12, null, null), 
					null
				),
				node(7,
					node(14, null, null),
					node(15, null, null)
				)
			)
		);

	BSTNode tree2 = node(1, 
			node(2,
				node(4,
					node(8, null, null),
					null
				),
				node(5,
					node(10, null, null),
					node(11, null, null)
				)
			),
			node(3,
				node(6,
					node(12, null, null), 
					null
				),
				null
			)
		);

	@Test
	public void testIsBalanced() {
		assertTrue(Q4_1.isBalanced(tree));
	}

	@Test
	public void testIsNotBalanced() {
		assertFalse(Q4_1.isBalanced(tree2));
	}

}
