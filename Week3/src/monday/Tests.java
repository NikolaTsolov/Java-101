package monday;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericBackpack<Integer> small_pack = new GenericBackpack<>();
		small_pack.set(20);
		System.out.println(small_pack.getWeight());
		Pair<Integer, String> pair = new Pair<>();
		pair.set_first(3);
		pair.set_second("haha");
		System.out.println(pair);
		Triple<Integer, Boolean, String> triple = new Triple<>();
		triple.set_first(5);
		triple.set_second(true);
		triple.set_third("dobre");
		System.out.println(triple);
	}
}
