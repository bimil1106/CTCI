package cracking.chapter4;

import cracking.utils.Tree.Node;

/* 
 * Impelment a function to check if a binary tree is a binary search tree
 * 
 * */

public class Q4_5 {
	
//	public static boolean checkBST(Node root, Integer child){
//		System.out.println("each child: " + child);
//		if(root == null){
//			System.out.println("root is null. returning true...");
//			return true;
//		}
//		if(!checkBST(root.left, child)){
//			System.out.println("checking left node. returning false...");
//			return false;
//		}
//		
//		System.out.println("current data:");
//		System.out.println("root.data: " + root.data + " " + "child: " + child);
//		if(root.data < child){
//			System.out.println("root.data: " + root.data + " " + "child: " + child + ". returning false...");
//			return false;
//		}
//		child = Integer.valueOf(root.data);
//		
//		if(!checkBST(root.right, child)){
//			System.out.println("checking right node. returning false");
//			return false;
//		}
//		
//		return true;
//	}
	
	public static int child = Integer.MIN_VALUE;
	public static boolean checkBST(Node root){
		if(root == null) return true;
		
		if(!checkBST(root.left)) return false;
		
		if(root.data < child) return false;
		child = root.data;
		
		if(!checkBST(root.right)) return false;
		
		return true;
	}

	public static boolean checkBST(Node root, int min, int max){
		//System.out.println("each root.data: " + root.data);
		System.out.println("each min: " + min);
		System.out.println("each max: " + max);
		
		if(root == null){
			System.out.println("root is null. Returning true");
			return true;
		}
		
		if(root.data <= min || root.data >= max){
			System.out.println("root.data:" + root.data + " min:" + min + " max:" + max);
			System.out.println("out of range..");
			return false;
		}
		
		System.out.println("each root.data: " + root.data);
		if(!checkBST(root.left, min, root.data) ||
				!checkBST(root.right, root.data, max)){
			System.out.println("this is not BST. Returning false");
			return false;
		}
		
		return true;
	}
	
	public static boolean testCheckBST(Node root){
		System.out.println("each child: " + child);
		if(root == null){
			System.out.println("root is null. returning true...");
			return true;
		}
		if(!checkBST(root.left)){
			System.out.println("checking left node. returning false...");
			return false;
		}
		
		System.out.println("current data:");
		System.out.println("root.data: " + root.data + " " + "child: " + child);
		if(root.data < child){
			System.out.println("root.data: " + root.data + " " + "child: " + child + ". returning false...");
			return false;
		}
		child = root.data;
		
		if(!checkBST(root.right)){
			System.out.println("checking right node. returning false");
			return false;
		}
		
		return true;
	}

}
