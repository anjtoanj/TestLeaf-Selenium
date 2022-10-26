package week1.day1;

public class SecondCode {
	public void phoneNum() {
		System.out.println("hi");
	}
	public int getPhoneNumber() {
		return 87874435;
		
	}
	public String getPhoneColor() {
		return "Blue";
		
	}
	public static void main(String[] args) {
		// object creation
       SecondCode obj = new SecondCode();
       
        obj.phoneNum();
        
        int phoneNumber = obj.getPhoneNumber();
        System.out.println(phoneNumber);
        
        String phoneColor = obj.getPhoneColor();
        System.out.println(phoneColor);
	}
}
