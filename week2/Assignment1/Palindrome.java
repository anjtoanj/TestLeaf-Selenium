package week2.Assignment1;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String svalue = "madam";
		String rev ="";
		
		char[] str =svalue.toCharArray();
		for(int i=svalue.length()-1; i>=0;i--) {
		  //  System.out.println(str[1]);
			rev= rev+str[i];
		//	System.out.println(rev);
		}
		if (svalue.equals(rev)) {System.out.println("The string: " +svalue+" is palindrome");}
	}

}
