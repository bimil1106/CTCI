package cracking.chapter3.q3_1;
/*
 * Q3.1
 * Describe how you could use a single array to implement three stacks
 */
public class ThreeStack<T> {
	Object[] array;
	int[] top = {0, 1, 2};
	
	public ThreeStack(int size) {
		array = new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public T pop(int stackIndex) {
		Object result = null;
		if (top[stackIndex] > (stackIndex*3)) {
			top[stackIndex] -= 3;
			result = array[top[stackIndex]];
		}
		return (T)result;	
	}
	
	public void push(T value, int stackIndex) {
		array[top[stackIndex]] = value;
		top[stackIndex] += 3;
	}
}
