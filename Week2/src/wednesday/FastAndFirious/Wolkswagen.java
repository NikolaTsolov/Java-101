package wednesday.FastAndFirious;

public class Wolkswagen extends GermanCars {
	
	public Wolkswagen(int mileage) {
		super(mileage);
	}

	@Override
	public boolean isEcoFriendly(boolean testing) {
		return testing == true;
	}
}
