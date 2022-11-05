package week2.day4.Assignment3;


public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Get student ID:"+id);
	}
    public void getStudentInfo(String name) {
    	System.out.println("Get student Name: "+name);
		
	}
    public void getStudentInfo(String email, Long phonenumber) {
    	System.out.println("Get student Email: "+email+" and Phone Number: "+phonenumber);
	}
    
    public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(123232);
		std.getStudentInfo("Anju");
		std.getStudentInfo("anju@gamil.com", 2342423432434L);
	}
}
