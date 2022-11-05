package week2.day4.Assignment2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit method in AxisBank class");
		
	}
	public static void main(String[] args) {
		AxisBank AB =new AxisBank();
		AB.deposit();
		AB.saving();
		AB.fixed();		
	}
}
