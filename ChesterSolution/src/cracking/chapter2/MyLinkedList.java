package cracking.chapter2;

class MyLinkedList {
	int value;
	MyLinkedList next;
	MyLinkedList() {}
	MyLinkedList(int value) { this.value = value; }
	MyLinkedList add(int value) {
		MyLinkedList ll=new MyLinkedList(value);
		this.next=ll;
		return ll;
	}
}
