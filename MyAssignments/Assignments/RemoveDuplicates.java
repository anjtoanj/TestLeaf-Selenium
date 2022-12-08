package week3.day4.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
//DONE	
		
//		// The pseudocode has steps to implement using arrays.
//		But, now do the same set of programs using Collections - using Set. 
//		https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day2/assignments/mandatory/RemoveDuplicates.java
		
		
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Use collections in Set 	 
		 * e) Displaying the String without duplicate words	
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
//		for(int i=0;i<words.length;i++) {
//		   System.out.println(words[i]);}
		Set<String> set1 = new LinkedHashSet<String>();
		for (String each : words) {
			set1.add(each);			
		}
		System.out.println(set1);
	}
}