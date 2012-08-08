package cracking.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking.chapter3.q3_1.ThreeStack;

public class Q3_1Test {

	@Test
	public void testThreeStack() {
		ThreeStack<String> stack3 = new ThreeStack<String>(100);
		stack3.push("Xin", 0);
		stack3.push("Chester", 1);
		stack3.push("Jinsun", 2);
		stack3.push("Song", 0);
		stack3.push("Kim", 1);
		stack3.push("Lee", 2);
		stack3.push("QCOM", 0);
		stack3.push("SAFEMED", 1);
		stack3.push("SONY", 2);
		stack3.push("MITCHEL", 0);
		stack3.push("BSC", 1);
		stack3.push("LG", 2);
		stack3.push("AMAZON", 1);
		String s11=stack3.pop(0);
		String s12=stack3.pop(0);
		String s13=stack3.pop(0);
		String s21=stack3.pop(1);
		String s22=stack3.pop(1);
		String s23=stack3.pop(1);
		String s31=stack3.pop(2);
		String s32=stack3.pop(2);
		String s33=stack3.pop(2);
		assertTrue("MITCHEL".equals(s11));
		assertTrue("QCOM".equals(s12));
		assertTrue("Song".equals(s13));
		assertTrue("AMAZON".equals(s21));
		assertTrue("BSC".equals(s22));
		assertTrue("SAFEMED".equals(s23));
		assertTrue("LG".equals(s31));
		assertTrue("SONY".equals(s32));
		assertTrue("Lee".equals(s33));
	}

}
