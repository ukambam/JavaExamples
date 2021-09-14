package selenium.examples;

public class Imax extends Theater {

	public void FoodCourt() {
		System.out.println("Food Court is available");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imax I = new Imax();
		I.parking();
		I.ticketbooking();
		I.FoodCourt();

	}

}
