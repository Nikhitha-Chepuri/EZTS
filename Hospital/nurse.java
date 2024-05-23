package Hospital;

public class nurse extends patient{
	private int FloorNo;

	public nurse(String name, int age, String gender, String speciality, String disease, int bedNo, int floorNo) {
		super(name, age, gender, speciality, disease, bedNo);
		FloorNo = floorNo;
	}

	@Override
	public String toString() {
		return "nurse [FloorNo = " + FloorNo + ", toString() = " + super.toString() + "]";
	}


	void nurseout()
	{
		super.patientout();
		System.out.println("FloorNo = "+FloorNo);
	}

}
