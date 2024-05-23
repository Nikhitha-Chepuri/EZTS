package Hospital;

public class person {
	private String Name;
	private int Age;
	private String Gender;
	public person(String name, int age, String gender) {

		Name = name;
		Age = age;
		Gender = gender;
	}
	@Override
	public String toString() {
		return "person [Name = " + Name + ", Age = " + Age + ", Gender = " + Gender + "]";
	}

	void personout()
	{
		System.out.println("Name = "+ Name);
		System.out.println("Age = "+ Age);
		System.out.println("Gender = "+ Gender);
	}
}
