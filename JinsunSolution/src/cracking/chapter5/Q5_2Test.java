package cracking.chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_2Test {

	/*
	1/2	  0.5 or 0.4999...	0.1 or 0.0111...	1/4+1/8+1/16...
	1/3	  0.333...	        0.010101...	        1/4+1/16+1/64...
	1/4	  0.25 or 0.24999...0.01 or 0.00111...	1/8+1/16+1/32...
	1/5	  0.2 or 0.1999...	0.00110011...	    1/8+1/16+1/128...
	*/
	@Test
	public void testPrintFractionToBinary() {
		System.out.println("0.5 to binary: " + Q5_2.printFractionToBinary(0.5));
		System.out.println("0.333 to binary: " + Q5_2.printFractionToBinary(0.333));
		System.out.println("0.25 to binary: " + Q5_2.printFractionToBinary(0.25));
		System.out.println("0.2 to binary: " + Q5_2.printFractionToBinary(0.2));
	}

}
