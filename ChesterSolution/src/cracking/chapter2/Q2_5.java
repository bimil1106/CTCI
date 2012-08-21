package cracking.chapter2;

/*
 * 2.5  You have two numbers represented by a linked list, where each node
 * contains a single digit.  The digits are stored in reverse order, such that
 * the 1's digit is at the  head of the list.  Write a function that adds the two
 * numbers and returns the sum as a linked list.
 * 
 *  EXAMP{LE
 *  
 *  Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 *  
 *  Output: 8 -> 0 -> 8
 */
public class Q2_5 {
	static MyLinkedList addReverse(MyLinkedList d1, MyLinkedList d2) {
		MyLinkedList result = new MyLinkedList();
		int overflow = 0;
		int sum=0;
		MyLinkedList cursor = result;
		while (d1!=null || d2!=null) {
			if (d1!=null && d2!=null) {
				sum = d1.value + d2.value + overflow;
				d1 = d1.next;
				d2 = d2.next;
			} else if (d2==null) {
				sum = d1.value + overflow;
				d1 = d1.next;
			} else if (d1==null) {
				sum = d2.value + overflow;
				d2 = d2.next;
			}
			cursor.value = sum % 10;
			overflow = sum / 10;
			if (d1!=null || d2!=null) {
				cursor.next = new MyLinkedList();
				cursor = cursor.next;
			}
		}
		if (overflow!=0)
			cursor.next = new MyLinkedList(overflow);
		return result;
	}
	
	static MyLinkedList addForward(MyLinkedList d1, MyLinkedList d2) {
		int value1 = getDigit(d1, 0);
		int value2 = getDigit(d2, 0);
		int sum = value1 + value2;
		System.out.println("d1="+value1);
		System.out.println("d2="+value2);
		System.out.println("sum="+sum);
		return buildLinkedList(sum, null);
	}
	
	static int getDigit(MyLinkedList node, int d) {
		if (node.next==null)
			return d*10+node.value;
		return getDigit(node.next, d*10+node.value);
	}

	static MyLinkedList buildLinkedList(int sum, MyLinkedList next) {
		MyLinkedList list = new MyLinkedList(sum%10);
		list.next = next;
		if (sum<10)
			return list;
		else
			return buildLinkedList(sum/10, list);
	}

}
