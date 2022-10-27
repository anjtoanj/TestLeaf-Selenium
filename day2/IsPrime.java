package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int n =100;
		System.out.println("The prime numbers are : 1 ");
	    for(int i=2; i<=n;i++)
	    {
	     int count =1;
	     for(int j=2; j<n;j++) {
	    	 if(i%j==0) { count++;}
	     }
	     if(count<=2) { 
	     System.out.println(i);}
	  }

	}

}
