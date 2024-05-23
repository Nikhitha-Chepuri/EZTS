package Hospital;

public class patient extends doctor{
	private String Disease;
	private int BedNo;
	public patient(String name, int age, String gender, String speciality, String disease, int bedNo) {
		super(name, age, gender, speciality);
		Disease = disease;
		BedNo = bedNo;
	}
	@Override
	public String toString() {
		return "patient [Disease = " + Disease + ", BedNo = " + BedNo + ", toString() = " + super.toString() + "]";
	}
	
	void patientout() {
	super.doctorout();
	System.out.println("Disease = "+Disease);
	System.out.println("BedNo = "+BedNo);

}
}
