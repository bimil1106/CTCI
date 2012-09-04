package google.top150.transposeinplace;

/*
 * Question: Given coins of values 1, 5, 7.  Make 10 with smallest number of give coins
 * Greedy algorithm is not acceptable.  
 */
public class NumberOfSmallestCoins {
	/*
	 * Strategy: C(n) = 1 + MIN{ C(n-k) if n >= k }
	 * 			where C(n) is minimum number of coins to make n (total value)
	 * 			and k is a denominator
	 */
	static int getMinimumNumberOfCoinsToMake(int sum) {
		return getNumbers(new int[sum + 1], sum, new int[]{1, 5, 7});
	}
	
	static int getNumbers(int[] minCoins, int sum, int[] denominators) {
		if (sum == 0) {
			return 0;
		}
		getNumbers(minCoins, sum - 1, denominators);	
		int count = Integer.MAX_VALUE;
		for (int denominator: denominators) {
			if (sum >= denominator && minCoins[sum - denominator] < count) {
				count = minCoins[sum - denominator];
				System.out.println(String.format("minCoins[%d - %d] = %d", sum, denominator, count));
			}
		}
		minCoins[sum] = count + 1;
		return minCoins[sum];
	}
	
}
