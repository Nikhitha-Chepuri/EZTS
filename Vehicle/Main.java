package Vehicle;

public class Main {

	public static void main(String[] args) {
		
		Master vehicle = new Master(2010,999,"red");
		System.out.println(vehicle.toString());
		
		vehicle.Masterout();
		
		bike b = new bike(2010,99,"Blue","Sports");
		System.out.println(b.toString());
		
		b.bikeout();
		
		car c = new car(2011,998,"Orange","Sports","EV");
		System.out.println(c.toString());
		
		c.carout();
		
		bus bb = new bus(2012,997,"Green","Standard","Desiel",60);
		System.out.println(bb.toString());
		
		bb.busout();
		
	}
}
