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

public class Q4_8 {
	
	public boolean isSubtree(Node r1, Node r2){
		if(r2 == null){
			return true; // empty tree is always a subtree  
		}
		
		return matchSubRoot(r1, r2);
	}

	public boolean matchSubRoot(Node r1, Node r2){
		
		if(r1 == null){
			return false;
		}
		
		if(r1.data == r2.data){
			return isSubtreeIdentical(r1, r2);
		}
		else{
			return matchSubRoot(r1.left, r2) || matchSubRoot(r1.right, r2);
		}
	}
	
	public boolean isSubtreeIdentical(Node t1, Node t2){
		
		if(t1 == null && t2 == null){
			return true;
		}
		
		if(t1 == null || t2 == null){
			return false;
		}
		
		if(t1.data != t2.data){
			return false;
		}
		else{
			return isSubtreeIdentical(t1.left, t2.left) && isSubtreeIdentical(t1.right, t2.right);
		}
	}
}
