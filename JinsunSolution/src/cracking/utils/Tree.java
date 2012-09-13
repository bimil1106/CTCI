package cracking.utils;

public class Tree {
	public class Node{
		public int data;
		public Node left;
		public Node right;
		
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
		public void printNode(){
			System.out.println("{ " + data + " }");
		}
	}
	
	public Node root;
	
	public Tree(){
		root = null;
	}
	
	public Node find(int key){
		Node current = root;
		
		if(current == null){
			System.out.println("this tree is empty. returing...");
			return null;
		}
		
		while(current.data != key){
			if(key < current.data){
				current = current.left;
			}
			else{
				current = current.right;
			}
			
			if(current == null){
				return null;
			}
		}
		
		return current;		
	}
	
	public void insert(int data){
		Node newNode = new Node(data);
		
		if(root == null){
			root = newNode;
		}
		else{
			Node parent;
			Node current = root;
			
			while(true){
				parent = current;
				if(data < current.data){
					current = current.left;
					if(current == null){
						parent.left = newNode;
						return;
					}
				}
				else{
					current = current.right;
					if(current == null){
						parent.right = newNode;
						return;
					}
				}
			}			
		}
	}


	public void printTreeInorder(Node root){
		
		if(root != null){
			printTreeInorder(root.left);
			System.out.print(root.data + " ");
			printTreeInorder(root.right);
		}
	}

	public void printTreeInorder(){
		
		if(root != null){
			printTreeInorder(root.left);
			System.out.print(root.data + " ");
			printTreeInorder(root.right);
		}
	}

}
