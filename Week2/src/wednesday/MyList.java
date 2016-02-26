package wednesday;

public interface MyList {

	void add(int element);
	
	boolean isEmpty();
	
	int removeFirst();
	
	int removeLast();
	
	int size();
	
	int get(int elementIndex);
	
	int getHead();
	
	int getTail();
	
	void clear();
	
}
