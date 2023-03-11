package Ringable;

public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
	public String ring() {
        // your code here
		return "Ring-a-ling!";
		
	}
    @Override public String unlock() {
	    // your code here
		return "Uses fingerprint recognition.";
	}
    @Override public void displayInfo() {
	    // your code here
    	System.out.println("Samsung Galaxy");
	}
}