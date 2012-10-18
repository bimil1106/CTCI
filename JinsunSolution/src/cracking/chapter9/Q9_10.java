package cracking.chapter9;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * You have a stack of n boxes, with widths wi, height hi, and depths di. The boxes
 * cannot be rotated and can only be stacked on top of one another if each box 
 * in the stack is strictly larger than the box above it in width, height, and depth.
 * Implement a method to build the tallest stack possible, where the height of a 
 * stack is the sum of the heights of each box.
 *  
 */

/*
 * b1, b2, b3, ....., bn
 * max(the tallest stack of b1 in the bottom, the tallest stack of b2 in the bottom, ....
 * 		the tallest stack of bn in the bottom)
 * 
 */
public class Q9_10 {
	
	// Let suppose the length of all boxes are integer
	public static class Box {
		String lable;
		int height;
		int width;
		int depth;
		
		public Box(String label, int height, int width, int depth) {
			this.lable = label;
			this.height = height;
			this.width = width;
			this.depth = depth;
		}
		
		public int height() {
			return height;
		}
		
		public boolean canBeAbove(Box box) {
			if (box == null) {
				return true;
			}
			return width < box.width && height < box.height && depth < box.depth; 
		}
		
		@Override
		public String toString() {
			return "[height:" + height + " width:" + width + " depth:" + depth + "]"; 
		}
	}

	public static ArrayList<Box> getTallestStack(ArrayList<Box> stack, Box bottomBox) {
		
		ArrayList<Box> tallestStack = null;
		int maxHeight = 0;
		
		for(int i = 0; i < stack.size(); i++) {
			Box candidateBox = stack.get(i);
			if (candidateBox.canBeAbove(bottomBox)) {
				ArrayList<Box> newStack = getTallestStack(stack, candidateBox);
				int newHeight = getTotalHeight(newStack);
				if (newHeight > maxHeight ) {
					tallestStack = newStack;
					maxHeight = newHeight;
				}
			}	
		}
		
		if (tallestStack == null) {
			tallestStack = new ArrayList<Box>();
		}
		
		if (bottomBox != null) {
			tallestStack.add(0, bottomBox);
		}
		
		return tallestStack;
	}

//	public static ArrayList<Box> getTallestStack(ArrayList<Box> stack, Box bottomBox) {
//		System.out.println("Starting with stack: " + stack + " bottomBox: " + bottomBox);
//		
//		ArrayList<Box> tallestStack = null;
//		int maxHeight = 0;
//		
//		for(int i = 0; i < stack.size(); i++) {
//			Box candidateBox = stack.get(i);
//			System.out.println("i = " + i + " candidateBox: " + candidateBox + " bottomBox: " + bottomBox);
//			if (candidateBox.canBeAbove(bottomBox)) {
//				System.out.println("This box " + candidateBox + " can be above the bottom box " + bottomBox);
//				ArrayList<Box> newStack = getTallestStack(stack, candidateBox);
//				System.out.println("getTallestStack is returned...");
//				System.out.println("newStack: " + newStack);
//				int newHeight = getTotalHeight(newStack);
//				System.out.println("newHeight: " + newHeight);
//				if (newHeight > maxHeight ) {
//					System.out.println("newHeight " + newHeight + " is greater than maxHeight " + maxHeight);
//					tallestStack = newStack;
//					maxHeight = newHeight;
//				}
//				System.out.println("current tallest stack: " + tallestStack + " current tallest height: " + newHeight);
//				System.out.println();
//			}	
//		}
//		
//		System.out.println("after for statement done... ");
//		System.out.println("tallestStack: " + tallestStack + " bottomBox: " + bottomBox);
//		if (tallestStack == null) {
//			tallestStack = new ArrayList<Box>();
//		}
//		
//		if (bottomBox != null) {
//			tallestStack.add(0, bottomBox);
//		}
//		System.out.println("returning tallestStack: " + tallestStack);
//		System.out.println();
//		
//		return tallestStack;
//	}
//
//	@SuppressWarnings("unchecked")
//	public static ArrayList<Box> getTallestStackDP(ArrayList<Box> stack, Box bottomBox, 
//					HashMap<Box, ArrayList<Box>> stack_map) {
//		System.out.println("Starting with stack: " + stack + " bottomBox: " + bottomBox);
//		System.out.println("Starting with stack_map: " + stack_map);
//		if(bottomBox != null && stack_map.containsKey(bottomBox)) {
//			System.out.println("bottomBox: " + bottomBox + " is not null. " + "stack_map contains bottomBox... so returning with stacks");
//			System.out.println();
//			return stack_map.get(bottomBox);
//		}
//		
//		ArrayList<Box> tallestStack = null;
//		int maxHeight = 0;
//		
//		for(int i = 0; i < stack.size(); i++) {
//			Box candidateBox = stack.get(i);
//			System.out.println("i = " + i + " candidateBox: " + candidateBox + " bottomBox: " + bottomBox);
//			if (candidateBox.canBeAbove(bottomBox)) {
//				System.out.println("This box " + candidateBox + " can be above the bottom box " + bottomBox);
//				ArrayList<Box> newStack = getTallestStackDP(stack, candidateBox, stack_map);
//				System.out.println("getTallestStack is returned...");
//				System.out.println("newStack: " + newStack);
//				int newHeight = getTotalHeight(newStack);
//				System.out.println("newHeight: " + newHeight);
//				if (newHeight > maxHeight ) {
//					System.out.println("newHeight " + newHeight + " is greater than maxHeight " + maxHeight);
//					tallestStack = newStack;
//					maxHeight = newHeight;
//				}
//				System.out.println("current tallest stack: " + tallestStack + " current tallest height: " + newHeight);
//				System.out.println();
//			}	
//		}
//		
//		System.out.println("after for statement done... ");
//		System.out.println("tallestStack: " + tallestStack + " bottomBox: " + bottomBox);
//		if (tallestStack == null) {
//			tallestStack = new ArrayList<Box>();
//		}
//		
//		if (bottomBox != null) {
//			tallestStack.add(0, bottomBox);
//		}
//		System.out.println("returning tallestStack: " + tallestStack);
//		
//		stack_map.put(bottomBox, tallestStack);
//		System.out.println("returning with stack_map: " + stack_map);
//		System.out.println();
//		
//		return (ArrayList<Box>)tallestStack.clone();
//	}

	public static int getTotalHeight(ArrayList<Box> stack) {
		int height = 0;
		
		for(Box b: stack) {
			height += b.height();
		}
		
		//System.out.println("height: " + height);
		
		return height;
	}
}


