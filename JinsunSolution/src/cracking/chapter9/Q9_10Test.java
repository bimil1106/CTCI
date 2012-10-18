package cracking.chapter9;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import cracking.chapter9.Q9_10.Box;

public class Q9_10Test {

	@Test
	public void testTallestStack() {
		// Box(label, height, width, depth)
		Box b1 = new Box("b1", 2, 2, 2);
		Box b2 = new Box("b2", 5, 5, 5);
		Box b3 = new Box("b3", 4, 4, 4);
		
		ArrayList<Box> stack = new ArrayList<Box>();
		stack.add(b1);
		stack.add(b2);
		stack.add(b3);
		
		System.out.println("total height:" + Q9_10.getTallestStack(stack, null));
		//System.out.println("total height:" + Q9_10.getTallestStackDP(stack, null, new HashMap<Box, ArrayList<Box>>()));
	}

}
