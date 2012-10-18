package cracking.chapter9;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q9_1Test {

	@Test
	public void testCountWays() {
		//System.out.println(Q9_1.countWays(100));
		//System.out.println(Q9_1.countWays(10));
		
		int[] map = new int[10];
		for(int i = 0; i < map.length; i++) {
			map[i] = -1;
		}
		
		System.out.println(Q9_1.countWaysDP(3, map));
	}

}
