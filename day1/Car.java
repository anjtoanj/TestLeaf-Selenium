package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("This is driverCar method");
	}
	public void applyBreak() {
		System.out.println("This is applyBreak method");
	}
	public void soundHorn() {
		System.out.println("This is soundHorn method");
	}
	public void isPuncture() {
		System.out.println("This is isPuncture method");
	}  
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.driveCar();
		obj.applyBreak();
		obj.soundHorn();
		obj.isPuncture();
		
		
	}
}
