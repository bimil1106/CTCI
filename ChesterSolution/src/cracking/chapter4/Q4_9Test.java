package cracking.chapter4;

import static cracking.chapter4.BSTNode.node;
import static org.junit.Assert.*;

import org.junit.Test;

public class Q4_9Test {
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
	public void testFindSumBSTNodeInt() {
		Q4_9.findSum(tree, 15);
	}

}
