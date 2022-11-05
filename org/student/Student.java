package org.student;
import org.department.Department;

public class Student extends Department{
    public void studentName() {
    	System.out.println("Student Name");
    }
    public void studentDept() {
    	System.out.println("Student Department");
    }
    public void studentId() {
    	System.out.println("Stdent Id");
    }
    
	public static void main(String[] args) {
		
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentId();
		std.studentName();
		std.studentDept();

	}

}
