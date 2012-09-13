package cracking.chapter6;

/*
 * You have 20 bottles of pills.  19 bottles have 1.0 gram pills, but one has pills
 * of weight 1.1 grams.  Given a scale that provides an exact measurement, how
 * would you find the heavy bottle?  You can only use the scale once.
 */
public class Q6_1 {
	// Strategy : weight = 1 + 1*2 + 1*3 + ... + 1.1 * k + ... 1 * N = (N + 1) * N / 2 + 0.1 * k
	// thus, k = ( weight - (N + 1) * N / 2 ) * 10;
	static int findHeavyBottle(double[] bottles) {
		double scale = 0.0;
		for (int i = 0; i<20; i++) {
			// pile i pills from i-th bottle
			scale += (i + 1) * bottles[i];
		}
		System.out.println("Scale pills = " + scale);
		double answer = (scale - (21*20/2)) * 10;
		return (int)answer;
	}
}
