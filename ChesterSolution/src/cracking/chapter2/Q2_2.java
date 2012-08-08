package cracking.chapter2;

public class Q2_2 {
	static int kthLast(MyLinkedList ll, int k) {
		MyLinkedList following = ll;
		for (int i=0; i<k; i++) {
			if (ll==null)
				return Integer.MIN_VALUE;
			ll = ll.next;
		}
		while (ll!=null) {
			ll = ll.next;
			following = following.next;
		}
		
		return following.value;		
	}
}
