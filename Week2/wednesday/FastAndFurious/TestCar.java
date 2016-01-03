package wednesday;

public class TestCar {

	public static void main(String[] args) {
		Wolkswagen wolks = new Wolkswagen(50000);
		System.out.println(wolks.getMileage());
		System.out.println(wolks.isEcoFriendly(true));
		System.out.println(wolks.isEcoFriendly(false));
		Audi audi = new Audi(100000);
		System.out.println(audi.isEcoFriendly(false));
		System.out.println(audi.getMileage());
		Skoda skoda = new Skoda();
		System.out.println(skoda.isEcoFriendly(false));

	}

}
