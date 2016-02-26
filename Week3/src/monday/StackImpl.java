package monday;

import java.lang.reflect.Array;


public class StackImpl <T> implements Stack<T>{
	    
	@SuppressWarnings("unchecked")
	protected T[] stack = (T[]) new  Object[2];
	protected int maxLen = 2;
	protected int iterator = 0;
	
	public StackImpl() {
	};
	
	@Override
	public void push(T element) {
		if (iterator >= maxLen) {
			maxLen *= 2;
			@SuppressWarnings("unchecked")
			T[] tempStack = (T[]) new  Object[maxLen];

			for (int i = 0; i < stack.length; i++) {
				tempStack[i] = stack[i];
			}

			stack = tempStack;
		}

		stack[iterator++] = element;
	}

	@Override
	public T pop() {
		if(iterator > 0) {
			return stack[--iterator];
		}
		else {
			System.out.printf("The stack is empty! \n");
			return null;
		}
		
	}

	@Override
	public int lenght() {
		return iterator;
	}

	@Override
	public void clear() {
		
	    this.stack = (T[]) new  Object[maxLen];
		iterator = 0;
	}

	@Override
	public boolean isEmpty() {
		return iterator == 0;
	}
	
	public static void main(String[] args) {
		StackImpl<Double> stack = new StackImpl<>();
		stack.push(3.5);
		stack.push(5.3);
		stack.push(10.1);
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		stack.clear();
		System.out.println(stack.isEmpty());
		stack.push(4.1);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		StackImpl<String> stack2 = new StackImpl<>();
		stack2.push("I made it");
		stack2.push("And now i push");
		stack2.push("This is poped first");
		System.out.println(stack2.pop());
		
	}
}
