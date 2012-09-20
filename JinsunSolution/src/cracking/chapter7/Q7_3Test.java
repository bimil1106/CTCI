package cracking.chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q7_3Test {

	@Test
	public void test() {
		/* Line1 (-3,-3) (3,3)  Line2 (-2,0) (0,2)*/
		Q7_3.Line l1 = (new Q7_3()).new Line(-3, -3, 3, 3);
		Q7_3.Line l2 = (new Q7_3()).new Line(-2, 0, 0, 2);
		assertFalse(l1.intersect(l2));
		
		/* Line1 (-3,-3) (3,3)  Line2 (-2,1) (0,2)*/
		l1 = (new Q7_3()).new Line(-3, -3, 3, 3);
		l2 = (new Q7_3()).new Line(-2, 1, 0, 2);
		assertTrue(l1.intersect(l2));
		
	}

}
