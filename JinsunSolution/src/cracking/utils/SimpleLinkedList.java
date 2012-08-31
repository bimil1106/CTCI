package cracking.utils;

public class SimpleLinkedList {

    public class Node{
            public int data;
            public Node next;
            
            public Node(int data){
                    this.data = data;
            }
    }
    
    private Node mHead;
    private Node mCurrent;

    public SimpleLinkedList(){
            mCurrent = mHead;
    }

    public boolean isEmpty(){
            return mHead == null;
    }
    
    public Node createNewNode(int data){
            return new Node(data);
    }
    
    public void add(int data){
            Node newNode = createNewNode(data);
            
            // case 1: no node in the list
            if(isEmpty()){
                    mHead = newNode;
            }else{
                    //case 2: more than one node in the list
                    mCurrent.next = newNode;                        
            }
            mCurrent = newNode;
    }
    
    public Node buildSimpleLinkedList(int[] data){
            mHead = null;
            mCurrent = null;
            
            for(int d: data){
                    add(d);
            }
            return mHead;
    }
    
    public void print(){
            System.out.print("[");
            Node current = mHead;
            while(current != null){
                    System.out.print(" " + current.data + " ");
                    current = current.next;
            }
            System.out.print("]");
            System.out.println();
    }
    
    public void print(Node node){
            System.out.print("[");
            Node current = node;
            while(current != null){
                    System.out.print(" " + current.data + " ");
                    current = current.next;
            }
            System.out.print("]");
            System.out.println();
    }
}

