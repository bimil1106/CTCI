package cracking.chapter9;

/*
 * 9.1
 * A child is running up a staircase with n steps, and can hop 1 step, 2 steps, or
 * 3 steps at a time. Implement a method to count how many possible ways the child
 * can run up the stairs.  
 * 
 */

/*        Top-Down Recursion: how we can divide the problem for case N into subproblems
 * 
 *        (n-1)-1 steps <--  (n-1) steps  <-- n steps in a staircase                        
 *        (n-1)-2 steps <--  
 *        (n-1)-3 steps <--
 *        
 *        (n-2)-1 steps <--  (n-2) steps                        
 *        (n-2)-2 steps <--  
 *        (n-2)-3 steps <--
 *        
 *        (n-3)-1 steps <--  (n-3) steps                        
 *        (n-3)-2 steps <--  
 *        (n-3)-3 steps <-- 
 * 
 */
public class Q9_1 {
	public static int numberOfCallMethod = 0;
	
	// running time O(3^n) 
	public static int countWays(int n) {
		System.out.println("numberOfCallMethod = " + ++numberOfCallMethod);
		System.out.println("n = " + n);
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else {
			return countWays(n-1) + countWays(n-2) + countWays(n-3);
		}
	}
	
	private static int numberOfCallMethodDP = 0;
	public static int countWaysDP(int n, int[] map) {

		System.out.println("numberOfCallMethodDP = " + ++numberOfCallMethodDP);
		System.out.println("n = " + n);
		System.out.println("map[" + n + "] = " + map[n]);
		
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (map[n] > -1) {
			return map[n];
		} else {
			map[n] = countWaysDP(n-1, map) + countWaysDP(n-2, map) + countWaysDP(n-3, map);
			return map[n];
		}
		
	}
}
