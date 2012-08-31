package cracking.chapter2;

import cracking.utils.SimpleLinkedList;
import cracking.utils.SimpleLinkedList.Node;

/* 
 * Write code to partition a linked list around a value x, such that all nodes
 * less than x come before all nodes greater than or equal to x.
 * 
 * */

public class Q2_4 {
	/* 
	 * 1. use two parameters List node and x value
	 * 2. create two lists for lessThanX and greaterThanX
	 * 3. go through the list from first to last with null
	 * 4. every lookup, if less than x, put the node into lessThanX, 
	 * otherwise, put it into greaterThanX
	 * 5. merge two list
	 * 
	 * */
        
    public static Node partitionAround(int x, Node node){
        Node beforeHead = null;
        Node beforeCurrent = null;
        Node afterHead = null;
        Node afterCurrent = null;
            
		while(node != null){
		        // This eliminate to create new Node.
			Node current = node.next;
			node.next = null;
			
			if(x > node.data){
		        if(beforeHead == null){
	                beforeHead = node;
		        }
		        else{
	                beforeCurrent.next = node;
		        }
		        beforeCurrent = node;
			}
			else{
		        if(afterHead == null){
	                afterHead = node;
		        }
		        else{
	                afterCurrent.next = node;
		        }
		        afterCurrent = node;
			}
                        
            node = current;
        }
                
        if(beforeHead == null){
            node = afterHead;
        }else if(afterHead == null){
            node = beforeHead;
        }else{
            node = beforeHead;
            beforeCurrent.next = afterHead;
        }
        
        return node;
        }
        /* Time complexity:  O(n) comparison */
		        
    public static void main(String [] args){
		                
        int[] data = new int[]{5, 3, 6, 4, 9, 8, 2, 1, 0, 7};
        SimpleLinkedList sll = new SimpleLinkedList();

        Node node;
        Node head = sll.buildSimpleLinkedList(data);
        sll.print(head);
        node = partitionAround(3, head);
        //sll.print(head);
        sll.print(node);
        
        node = partitionAround(6, sll.buildSimpleLinkedList(data));
        sll.print(node);
        
        node = partitionAround(10, sll.buildSimpleLinkedList(data));
        sll.print(node);
    }
}	
