package Vehicle;

public class bus extends car {
	private int seatingCapacity;

	public bus(int model, int engine, String color, String type, String fuelType, int seatingCapacity) {
		super(model, engine, color, type, fuelType);
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "bus [seatingCapacity=" + seatingCapacity + ", toString()=" + super.toString() + "]";
	}

	void busout() {
		super.carout();
		System.out.println("type ="+seatingCapacity);
	}
	
}
