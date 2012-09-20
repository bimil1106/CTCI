package cracking.chapter5;

/* 
 * Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double,
 * print the binary representation. If the number cannot be represented accurately
 * in binary with less than 32 characters, print "ERROR"
 * 
 * */
public class Q5_2 {

	public static String printFractionToBinary(double fraction){
		final String ERROR = "ERROR";
		
		if(fraction >= 1 || fraction < 0){
			return ERROR;
		}
		
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		
		while(fraction > 0){
			if(binary.length() > 32){
				return ERROR;
			}
			
			double interFraction = fraction * 2;
			if(interFraction > 1){
				binary.append("1");
				fraction = interFraction - 1;
			}
			else{
				binary.append("0");
				fraction = interFraction;
			}
		}
		
		return binary.toString();
	}
}
