package cracking.chapter3;

import java.util.ArrayList;
import java.util.Stack;

/* 3.3
 * Implement a data structure SetOfStacks.
 * SetOfStacks should be composed of several stacks and should 
 * create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave
 * identically to a single stack (that is, pop() should return
 * the same values as it would if there were just a single stack
 * 
 * Implement a function popAt(int index) which performs a pop
 * operation on a specific sub-stack
 * 
 * */

public class Q3_3 {
	        
	        public class SetOfStacks {
	                
	                ArrayList<Stack<Integer>> list = new ArrayList<Stack<Integer>>();
	                Stack<Integer> stack;
	                
	                int capacity = 5;
	                int listIndex = 0;
	                int stackIndex = 0;
	                
	                public SetOfStacks(int capacity){
	                        this.capacity = capacity;
	                        createNewStack();
	                }
	                
	                public void createNewStack(){
	                        stack = new Stack<Integer>();
	                        list.add(stack);
	                        listIndex = list.size() - 1;
	                }
	                
	                public void push(int data){
	                        if(stack.size() >= capacity){
	                                createNewStack();
	                        }
	                        
	                        stack.push(data);
	                }
	                
	                public int pop(){
	                        
	                        if(stack.empty()) return -1;
	                        
	                        stack = list.get(listIndex);
	                        int data = stack.pop();
	                        if(stack.size() == 0 && listIndex > 0){
	                                list.remove(listIndex);
	                                stack = list.get(--listIndex);
	                        }
	                        
	                        return data; 
	                }
	                
	                /* not completed */
	                public int popAt(int index){
	                        
	                        if(stack.empty()) return -1;
	                        int localStackIdx = index % capacity;
	                        int localListIdx = index / capacity;
	                        
	                        Stack<Integer> stackLocal = list.get(localListIdx);
	                        
	                        int data = stackLocal.pop();
	                        //rearrage();
	                        
	                        return data;
	                        
	                }
	        }

}
