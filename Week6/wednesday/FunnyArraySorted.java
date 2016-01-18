package wednesday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunnyArraySorted {
	
	private int pivot;
	
	public FunnyArraySorted(Integer pivot) {
		this.pivot = pivot;
	}
	
	public void incrementP() {
		pivot++;
	}
		
		public void reverseSort (ArrayList<Integer> list) {
			
			class reverseComperator implements Comparator<Integer> {
				@Override
				public int compare(Integer o1, Integer o2) {
					if(o1 > o2) {
						return -1;
					} else if (o1 == o2) {
						return 0;
					}
					return 1;
				}
			}
			Collections.sort(list, new reverseComperator());

		}		
		
		public void pivotSubtractionSort(ArrayList<Integer> list) {
			class pivotSubComperator implements Comparator<Integer> {
				@Override
				public int compare(Integer o1, Integer o2) {
					incrementP();
					if(o1 - pivot < o2) {
						return -1;
					} else if (o1 - pivot == o2) {
						return 0;
					}
					return 1;
				}
			}
			Collections.sort(list, new pivotSubComperator());
		}
		
		public void pivotDivisionSort(ArrayList<Integer> list) {
			class pivotDivComperator implements Comparator<Integer> {
				@Override
				public int compare(Integer o1, Integer o2) {
					incrementP();
					if(o1 / pivot < o2) {
						return -1;
					} else if (o1 - pivot == o2) {
						return 0;
					}
					return 1;
				}
			}
			Collections.sort(list, new pivotDivComperator());
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		FunnyArraySorted sorter = new FunnyArraySorted(2);
		//sorter.reverseSort(list);
		//sorter.pivotSubtractionSort(list);
		sorter.pivotDivisionSort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		//sorter.reverseSort(list2);
		//sorter.pivotSubtractionSort(list2);
		sorter.pivotDivisionSort(list2);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
