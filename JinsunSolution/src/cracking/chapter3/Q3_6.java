package cracking.chapter3;

import java.util.Stack;

/* 
 * 3.6
 * Write a program to sort a stack in ascending order (with biggest items on top). 
 * You may use additional stacks to hold items, 
 * but you may not copy the elements into any other data structure (such as an array).
 * The stack supports the following operations: push, pop, peek, and isEmpty 
 * 
 */

public class Q3_6 {
	        
    public static Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> result = new Stack<Integer>();
        
        while(!s.empty()){
            int temp = s.pop();
            
            while(!result.empty() && temp < result.peek()){
                s.push(result.pop());
            }
            result.push(temp);
        }
        
        return result;
    }
    
    public static void main(String[] args){
    	Stack<Integer> s = new Stack<Integer>();
    	s.push(10);
    	s.push(50);
    	s.push(30);
    	s.push(20);
    	s.push(90);
    	s.push(80);
    	s.push(40);
    	s.push(70);
    	System.out.println("Stack s: " + s);
    	System.out.println("Sorted Stack: " + Q3_6.sort(s));
    	System.out.println("Stack s after calling sort(): " + s);
    }

}
