package wednesday;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DoublyLinkedList implements MyList {

	private int N;
	private Node pre;
	private Node post;
	
	public DoublyLinkedList() {
		pre = new Node();
		post = new Node();
		pre.next = post;
		post.previous = pre;
		N=0;
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
	public int removeFirst() throws NoSuchElementException {
		if(!isEmpty()) {
			Node first = pre.next;
			int el = first.element;
			first.next.previous = pre;
			pre.next = first.next;
			first = null;
			N--;
			return el;
		} else {
			throw new NoSuchElementException();
		}
		
	}
	
	@Override
	public int removeLast() throws NoSuchElementException {
		if(!isEmpty()) {
			Node last = post.previous;
			int el = last.element;
			last.previous.next = post;
			post.previous = last.previous;
			last = null;
			N--;
			return el;
		} else {
			throw new NoSuchElementException();
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
	public int getHead() throws NoSuchElementException {
		if(!this.isEmpty()) {
			return pre.next.element;
		}
		
		else {
			throw new NoSuchElementException();
		}
		
		
	}

	@Override
	public int getTail() throws NoSuchElementException {
		if(!this.isEmpty()) {
			return post.previous.element;
		} else {
			throw new NoSuchElementException();
		}
		
	}
	
	@Override
	public void clear() {
		int size = N;
		for (int i = 0; i < size; i++) {
			this.removeFirst();
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Is empty - " + list.isEmpty());
		System.out.println("Size - " + list.size());
		System.out.println("Head - " + list.getHead());
		System.out.println("Index 1 - " + list.get(1));
		System.out.println("Tail - " + list.getTail());
		System.out.println("RemoveFirst - " + list.removeFirst());
		System.out.println("Tail after remove - " + list.getTail());
		System.out.println("Head after remove - " + list.getHead());
		System.out.println("RemoveLast - " + list.removeLast());
		System.out.println("RemoveLast - " + list.removeLast());
		System.out.println("Clearing ");
		list.clear();
		System.out.println("Is empty - " + list.isEmpty());
		System.out.println("Size - " + list.size());
		LinkedList<Integer> l = new LinkedList<>();
	}	
}
