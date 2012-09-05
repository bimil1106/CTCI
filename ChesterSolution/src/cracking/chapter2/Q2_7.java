package cracking.chapter2;

public class Q2_7 {
	static MyLinkedList forward;

	static boolean isPalindrome(MyLinkedList head) {
		forward = head;
		return recursive(head);
	}


	static boolean recursive(MyLinkedList cur) {
	    if (cur == null) {
	    	return true;
	    }
		System.out.println(String.format("recursive(%d) - Enter!", cur.value));
	    if (!recursive(cur.next))
	    	return false;
	    if (forward != null) {
	    	System.out.println(String.format("inorder=%d, cur=%d", forward.value, cur.value));
	        if (cur.value != forward.value)
	        	return false;
		    forward = forward.next;
	    }
	    return true;
	}
}
