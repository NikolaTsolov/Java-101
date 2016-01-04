package wednesday;

public class DoublyLinkedList implements List {

	int N;
	Node pre;
	Node post;
	
	public DoublyLinkedList() {
		pre = new Node();
		post = new Node();
		pre.next = post;
		post.previous = pre;
	}
	
	private class Node {
		private int element;
		private Node next;
		private Node previous;
	}

	@Override
	public void add(int element) {
		Node last = post.previous;
		Node x = new Node();
		x.element = element;
		x.next = post;
		x.previous = last;
		post.previous = x;
		last.next = x;
		N++;
		
	}
	
	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public void remove() {
		if(isEmpty()) {
			System.err.println("The list is empty you can't remove");
		} else {
			Node last = post.previous;
			last.previous.next = post;
			post.previous = last.previous;
			last = null;
			N--;
		}
		
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public int get(int elementIndex) {
		if(elementIndex > N) {
			System.err.println("Index out of range");
			return 0;
		} else {
			Node el = post.previous;
			for(int i = N-1; i > elementIndex; i--) {
				el = el.previous;
			}
			
			return el.element;
		}
	}

	@Override
	public int getHead() {
		return get(0);
	}

	@Override
	public int getTail() {
		// TODO Auto-generated method stub
		return get(N-1);
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(0);
		list.add(4);
		list.add(5);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.getHead());
		System.out.println(list.get(1));
		System.out.println(list.getTail());
		list.remove();
		System.out.println(list.getTail());
		list.remove();
		System.out.println(list.getTail());
		list.remove();
		list.remove();

	}
	
}
