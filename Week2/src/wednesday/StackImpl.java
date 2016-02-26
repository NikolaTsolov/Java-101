package wednesday;

public class StackImpl implements Stack  {

	protected int maxLen = 2;
	protected int[] stack = new int[maxLen];
	protected int iterator = 0;
	
	public StackImpl() {
	};

	@Override
	public void push(int element) {
		if (iterator >= maxLen) {
			maxLen *= 2;
			int[] tempStack = new int[maxLen];

			for (int i = 0; i < stack.length; i++) {
				tempStack[i] = stack[i];
			}

			stack = tempStack;
		}

		stack[iterator++] = element;
	}

	@Override
	public int pop() {
		if(iterator > 0) {
			return stack[--iterator];
		}
		else {
			System.err.printf("The stack is empty! \n");
			return 0;
		}
		
	}

	@Override
	public int lenght() {
		return iterator;
	}

	@Override
	public void clear() {
		stack = new int[maxLen];
		iterator = 0;
	}

	@Override
	public boolean isEmpty() {
		return iterator == 0;
	}
	
	public static void main(String[] args) {
		StackImpl stack = new StackImpl();
		stack.push(3);
		stack.push(5);
		stack.push(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		stack.clear();
		System.out.println(stack.isEmpty());
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
