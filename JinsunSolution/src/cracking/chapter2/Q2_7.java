package cracking.chapter2;

import java.util.Stack;

public class Q2_7 {
    public class Node{        
        int data;
        Node next = null;
        
        public Node(int data, Node next){
                this.data = data;
                this.next  = next;
        }
}

public static boolean isPalindrome(Node head){
        
        if(head == null){
                throw new NullPointerException();
        }
        
        Node fast = null;
        Node slow = null;
        Stack<Integer> palindrome = new Stack<Integer>();
        
        fast = slow = head;
        
        while(fast != null && fast.next != null){
                palindrome.push(slow.data);
                fast = fast.next.next;
                slow = slow.next;
        }
        
        //odd
        if(fast == null){
                slow = slow.next;
        }
        
        //even
        if(fast.next == null){
                palindrome.push(slow.data);
                slow = slow.next;
        }

        while(slow != null){
                if (palindrome.pop() != slow.data){
                        return false;
                }
                slow = slow.next;
        }

        return true;
}

}
