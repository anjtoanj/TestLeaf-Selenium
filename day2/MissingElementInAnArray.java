package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
						
						
			Arrays.sort(arr);
			int var = 15;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				if (arr[i]!=i) {
					System.out.println("Array variable ("+arr[i] + ") is not equal to the iterator variable("+i+")");
					break;
				}
			}

	}

}
