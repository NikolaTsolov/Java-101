package wednesday;

import java.util.NoSuchElementException;

public class MrListStack {
	
	public static Stack stack = new Stack() {
		
		private DoublyLinkedList list = new DoublyLinkedList();
		
		@Override
		public void push(int element) {
			list.add(element);
			
		}
		
		@Override
		public int pop() {
			return list.removeLast();			
		}
		
		@Override
		public int lenght() {
			return list.size();
		}
		
		@Override
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		@Override
		public void clear() {
			list.clear();			
		}
	};
	
	public static Stack getListStack() {
		return stack;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = MrListStack.getListStack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.clear();
		System.out.println(stack.isEmpty());
		System.out.println(stack.lenght());
		try {
			System.out.println(stack.pop());
		} catch (NoSuchElementException e) {
			System.out.println("Cannot pop when the stack is empty");
		}
	}

}
