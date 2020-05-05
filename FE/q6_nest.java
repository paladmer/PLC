import java.util.*; 

/** Merizka Palad
 * PLC_Final Exam Q6nested**/
public class q6_nest {
	  public static void main(String[] args) {
		 
		  int max = 0, mid =0, min =0; 
		   Scanner console = new Scanner (System.in);
		   
		  System.out.println("Enter an integer value for first:");
		   Integer first = console.nextInt(); 
		  
		  System.out.println("Enter an integer value for second:");
		   Integer second = console.nextInt(); 
		  
		  System.out.println("Enter an integer value for third:");
		   Integer third = console.nextInt(); 
		
		  
           if (first > second) { //
	            if (first > third) {
	            		 if (second > third) {
		                    max = first;
		                    mid = second;
		                    min = third;
		                } else {
		                	max = first;
		                    mid = third;
		                    min = second;
		                }
	            } else {
	            	mid = first;
	                min = second;
	                max = third;
	            }
	        } else { //end
	            
	        	if (second < third) {
	        	    max = third;
	                min = first;
	                mid = second;
	             
	            } else {
		                if (first < third) {
		                	mid = third;
		                    min = first;
		                    max = second;
		                } else {
		                    min = third;
		                    mid = first;
		                    max = second;
		                }
	            }
	        } //end of nested if
		  
		  
		  System.out.println("The Max: " + max);
		   System.out.println("The Mid: " + mid);
		  System.out.println("The Min: " + min);

		  
	  } // end of main String args
} // end of q6 nest class
