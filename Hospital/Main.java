package Hospital;

public class Main {

	public static void main(String[] args) {
		
		person hospital = new person("anu",43,"Female");
		System.out.println(hospital.toString());
		
		hospital.personout();
		
		doctor d = new doctor("Madhu",34,"Male","ENT");
		System.out.println(d.toString());
		
		d.doctorout();
		
		patient p = new patient("Ram",54,"Male","ENT","Sinus",305);
		System.out.println(p.toString());
		
		p.patientout();
		
		nurse n = new nurse("Manasa",54,"Female","RMP","Fever",305,3);
		System.out.println(n.toString());
		
		n.nurseout();
	}
}
