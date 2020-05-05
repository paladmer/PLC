// the no nest one
import java.util.Scanner; 

/** Merizka Palad
 * PLC_Final Exam Q no nest**/
public class q6_other {
	  public static void main(String[] args) {
		 
		  int max = 0, mid =0, min =0; 
		   Scanner console = new Scanner (System.in);
		   
		  System.out.println("Enter an integer value for first:");
		   Integer first = console.nextInt(); 
		  
		  System.out.println("Enter an integer value for second:");
		   Integer second = console.nextInt(); 
		  
		  System.out.println("Enter an integer value for third:");
		   Integer third = console.nextInt(); 
		
		  
		   if((first > second)&& (first > third) && (second > third)){
			   
		    	 	max = first;
		    	 	min = third;
		            mid = second;
		            
		    } else if ((first > second) && (first > third) && (third > second)){
		    	
			        	max = first;
			        	min = second;
			            mid = third;
		          
            } else if ((second > third) && (second > first) && (third > first)){
            				max = second;
				            min = first;
				            mid = third;
				           
		            
            } else if ((second > first) && (second > first) && (third < first)){
            					max = second;
					            min = third;
					            mid = first;
					           
		            
            } else if ((third > first) && (third > second) && (first > second)){
            							max = third;
            							mid = first;
							            min = second;
							           
							            
		            
            } else{
            	 max = third;
            	 mid = second;
				 min = first;
				
				
		    }
		  
		  
		  System.out.println("The Max: " + max);
		   System.out.println("The Mid: " + mid);
		  System.out.println("The Min: " + min);

		  
	  } // end of main String args
} // end of q6 nest class
