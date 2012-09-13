package cracking.chapter4;

import cracking.utils.Tree.Node;

/*
 * You have two very large binary trees: T1, with millions of nodes, and T2, with
 * hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1
 * 
 * A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree
 * of n is identical to T2. That is, if you cut off the tree at node n, the two trees
 * would be identical.
 * 
 */
public class Q4_8_1 {

	public boolean isSubtree(Node t1, Node t2){
		
		if(t1 == null && t2 == null) return true;
		
		if(t1 == null || t2 == null) return false;
				
		Node root = find(t1, t2.data);
		if(root == null) return false;
		
		return isSubtreeIdentical(root, t2);
	}
	
	// suppose the tree is binary search tree
	public Node find(Node t, int key){
		Node current = t;
		
		while(current != null){
			if(current.data == key) return current;
			
			if(current.data > key){
				current = current.left;
			}
			else{
				current = current.right;
			}
		}
		
		return null;
	}
	
	public boolean isSubtreeIdentical(Node t1Sub, Node t2){
		
		if(t1Sub != null && t2 != null){
			if(!isSubtreeIdentical(t1Sub.left, t2.left)) return false;
			System.out.println("t1Sub.data: " + t1Sub.data + " t2.data: " + t2.data);
			if(t1Sub.data != t2.data){
				return false;
			}
			if(!isSubtreeIdentical(t1Sub.right, t2.right)) return false;
		}
		
		return true;
	}
}
