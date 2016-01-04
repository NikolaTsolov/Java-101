package wednesday;

public class StackWithoutClones extends StackImpl implements Stack {
	
	private boolean contains(int element) {
		for (int i = 0; i < stack.length; i++) {
			if(element == stack[i]) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void push(int element) {
		if(contains(element)) {
			System.err.printf("The element is already in the stack! \n");
		} else {
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
	}
	
	public static void main(String[] args) {
		StackImpl stack = new StackWithoutClones();
		stack.push(1);
		stack.push(6);
		stack.push(6);
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		stack.clear();
		System.out.println(stack.isEmpty());
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
