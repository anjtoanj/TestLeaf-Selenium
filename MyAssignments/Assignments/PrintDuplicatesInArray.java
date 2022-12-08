package week3.day4.Assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
//DONE		
		//The pseudocode has steps to implement using arrays.
		//But, now do the same set of programs using Collections - using Set. 
		//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day2/classroom/arrays/PrintDuplicatesInArray.javaTODO Auto-generated method stub
        int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> s =new HashSet<Integer>();
		System.out.println("Duplicate Integers are ");
		for (Integer each : arr) {
			if(!s.add(each)) {
				System.out.println(each);
			}
		}	

	}

}
