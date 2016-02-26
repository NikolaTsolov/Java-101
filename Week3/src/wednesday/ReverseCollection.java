package wednesday;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayDeque;

public class ReverseCollection {

	@SuppressWarnings("null")
	public static <T> void reverse(Collection<T> collection) {
		Collection<T> tmp = new ArrayDeque<>();		
		int size = collection.size() - 1;
		for (int i = 0; i <collection.size(); i++) {
			int currentPosition = 0;
			Iterator<T> iterC = collection.iterator();
			while(iterC.hasNext()) {
				currentPosition += 1;
				System.out.println(iterC.next() + " " + size + " " + currentPosition);
				if(currentPosition == size) {
					//System.out.println(iterC.next() + " " + size);
					tmp.add(iterC.next());
				}
				currentPosition++;
			}
			//System.out.println(size);
			if(size == 0) {
				break;
			}
			size--;
		}
		collection.clear();
		collection.addAll(tmp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i< 10; i++) {
			arr.add(i);
		}
		reverse(arr);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}

}
