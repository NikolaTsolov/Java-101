package monday;

public interface Stack <T> {
	
	void push(T element);
	
	T pop();
	
	int lenght();
	
	void clear();
	
	boolean isEmpty();

}
