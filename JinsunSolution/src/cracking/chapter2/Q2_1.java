package cracking.chapter2;

import java.util.Hashtable;


public class Q2_1 {
/* 
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * */
	
	
	public class Node{        
        int data;
        Node next = null;
        
        public Node(int data, Node next){
                this.data = data;
                this.next  = next;
        }
    }
	
	public static void removeDuplicates(Node head){
		
		Hashtable<Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
		Node prev = head;
		Node current = head;
		
		while(current != null){
			if(ht.containsKey(current.data)){
				prev.next = current.next;
			}else{
				ht.put(current.data, true);
				prev = current;
			}
			current = current.next;
		}
	}
	
	public static void removeDupWithoutBuffer(Node head){
		
		Node previous = head;
		Node current = head;
		Node keyNode = head;
		
		while(keyNode != null){
			int key = keyNode.data;
			while(current != null){
				if(key == current.data){
					previous.next = current.next;
				}else{
					previous = current;
				}
				current = current.next;
			}
			keyNode = keyNode.next;
			
		}
	}
}
