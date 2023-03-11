

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy galaxy = new Galaxy("s9", 99, "Verizon", "Ring!");
		IPhone iphone = new IPhone("14", 100, "T-Mobile", "Ring! Ring!");
		// Ringable ringable = new Ringable();
		
		galaxy.displayInfo();
		System.out.println(galaxy.ring());
		Ringable.ring();
		System.out.println(galaxy.unlock());
		
		iphone.displayInfo();
		System.out.println(iphone.ring());
		System.out.println(iphone.unlock());
	}
}
