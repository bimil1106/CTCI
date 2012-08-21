package cracking.chapter3;

import java.util.Stack;

public class Q3_6 {
	/* 3.6
	 * Write a program to sort a stack in ascending order
	 * (with biggest items on top). You may use additional stacks
	 * to hold items, but you may not copy the elements into 
	 * any other data structure (such as an array).
	 * The stack supports the following operations:
	 * push, pop, peek, and isEmpty 
	 * 
	 */
	        
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

}
