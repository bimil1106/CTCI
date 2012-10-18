package cracking.chapter9;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking.chapter9.Q9_7.Color;

public class Q9_7Test {

	/*
	 * w  w  w  w  w
	 * w  p  w  w  w
	 * w  p  w  w  w
	 * w  w  w  w  w
	 * w  y  w  y  y
	 * 
	 * choose blue (3, 1)
	 * 
	 * b  b  b  b  b
	 * b  p  b  b  b
	 * b  p  b  b  b
	 * b  b  b  b  b
	 * b  y  b  y  y
	 * 
	 */
	@Test
	public void testPaintfill() {
		Q9_7.Color[][] actual = new Color[][] {
 			{Color.W, Color.W, Color.W, Color.W, Color.W},
 			{Color.W, Color.P, Color.W, Color.W, Color.W},
 			{Color.W, Color.P, Color.W, Color.W, Color.W},
 			{Color.W, Color.W, Color.W, Color.W, Color.W},
 			{Color.W, Color.Y, Color.W, Color.Y, Color.Y}
		};
		
//		Q9_7.Color[][] expected = new Color[][] {
// 			{Color.W, Color.W, Color.W, Color.B, Color.W},
// 			{Color.W, Color.P, Color.B, Color.B, Color.B},
// 			{Color.W, Color.P, Color.W, Color.B, Color.W},
// 			{Color.W, Color.W, Color.W, Color.W, Color.W},
// 			{Color.W, Color.Y, Color.W, Color.Y, Color.Y}
//		};
		
		Q9_7.paintfill(actual, 3, 1, Color.B);
		
		
	}

}
