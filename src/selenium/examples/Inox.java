package selenium.examples;

public class Inox extends Imax {
    public void parking() {
    	System.out.println("Inox Parking is available");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inox I = new Inox();
		I.parking();
		I.ticketbooking();
		I.FoodCourt();

	}

}
