package Vehicle;

public class car extends bike {
	private String fuelType;


	public car(int model, int engine, String color, String type, String fuelType) {
		super(model, engine, color, type);
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "car [fuelType=" + fuelType + ", toString()=" + super.toString() + "]";
	}

	void carout() {
		super.bikeout();
		System.out.println("Type ="+fuelType);
	}
		
}
