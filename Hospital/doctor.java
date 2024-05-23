package Hospital;

public class doctor extends person {
	private String speciality;

	public doctor(String name, int age, String gender, String speciality) {
		super(name, age, gender);
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "doctor [speciality = " + speciality + ", toString() = " + super.toString() + "]";
	}
	void doctorout() {
	super.personout();
	System.out.println("speciality = "+speciality);
}
}
