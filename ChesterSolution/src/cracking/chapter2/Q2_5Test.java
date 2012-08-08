package cracking.chapter2;

import org.junit.Test;

public class Q2_5Test {
	static MyLinkedList d1=new MyLinkedList(9);
	static { d1.add(2).add(9); }
	static MyLinkedList d2=new MyLinkedList(2);
	static { d2.add(7); }
	
	void printDigit(MyLinkedList d) {
		if (d.next!=null)
			printDigit(d.next);
		System.out.print(d.value);
		return;		
	}
	
	@Test
	public void testAddReverse() {
		System.out.print("d1=");
		printDigit(d1);
		System.out.print("\nd2=");
		printDigit(d2);
		MyLinkedList answer = Q2_5.addReverse(d1, d2);
		System.out.print("\nanswer=");
		printDigit(answer);
	}

	@Test
	public void testAddForward() {
		MyLinkedList answer = Q2_5.addForward(d1, d2);
		System.out.print("Answer : ");
		while (answer.next!=null) {
			System.out.print(answer.value+" -> ");
			answer = answer.next;
		}
		System.out.println(answer.value);
	}

}
