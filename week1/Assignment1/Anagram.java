package week2.Assignment1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.equals(text2))
		{System.out.println("Both strings are same");}
		else 
		{System.out.println("Both strings are different");}
		
		char[] char1=text1.toCharArray();
		char[] char2=text2.toCharArray();
		
		 Arrays.sort(char1);
		 Arrays.sort(char2);

		 
		boolean res=  Arrays.equals(char1, char2);
		if (res) 
		{System.out.println(text1 +" "+ text2 +" are anagram");}
		else 
		{System.out.println(text1 +" "+ text2 +" are not anagram");}
		}
	 }
	
	

