import java.util.*; 
import java.util.regex.*;  

/** Merizka Palad
 * PLC_Final Exam Q1**/

public class q1 {
	
	  public static void main(String[] args) {
		  
		  System.out.println("This is based on the programming language of Java.\n"
		  		+ "It's meant to check your input and recognize it as either a \n"
		  		+ "floating point literal, integer literal, string literal, or variable name. \n \n"
		  				   + "Select a method from below by choosing a letter.\n"
				  		   + "A) Floating-Point Literals \n"
		  				   + "B) Integer Literals \n"
		  				   + "C) String Literals \n"
		  				   + "D) Variable Names \n" );
		  
		  Scanner console = new Scanner (System.in);
		  

int attempts = 10; 
int begin; 
for (begin = 1 ; begin <=attempts ; begin++) { // Start of begin FOR Loop


		  System.out.println("**Enter your selection letter:**");
		  String select = console.nextLine(); 
		  
/**************************************************************************************************************/
		  /** A) Floating-Point Literals choice **/
		  if (select.equalsIgnoreCase("A")) { 
			  
		
	
			  System.out.println("Enter a floating point literal: ");
			  String float_lit = console.nextLine();
			  Pattern pattern = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+[fFlL]?"); // the Rule 
		 
			  
		  	  Matcher check = pattern.matcher(float_lit); // What is being checked against the rule
		  	  boolean result = check.matches(); // if the rule applies to it , then it returns true meaning valid input
				  	
		  	  	   if (result == true) {
		  	  		   
		  	  		   		
		  	  		   		// prints out the valid numbers like 100f	
		  	  		   		if (!float_lit.contains(".")) {
		  	  		   			System.out.println("Valid float point Literal: "  + float_lit); 
		  	  		   		}
				  		
		  	  		   		// Invalids such as 99.9
					  		if (float_lit.contains(".")&!(float_lit.endsWith("f")|float_lit.endsWith("L")| float_lit.endsWith("l")|float_lit.endsWith("F"))){
					  			System.out.println("Invalid float point Literal: "  +  float_lit);
					  		
					  		// Valid like 99.9f
					  		} else if (float_lit.contains(".")&(float_lit.endsWith("f")|float_lit.endsWith("L")| float_lit.endsWith("l")|float_lit.endsWith("F"))){
					  		  
					  			System.out.println("Valid float point Literal: "  +  float_lit);
					  		} else {
					  			
					  		}
					  		
					  		
					  		
				  	// Invalid such as ASDASDJA and such	
				  	} else {
			  			System.out.println("InValid float point Literal: "  + float_lit); 
			  		
			  		}
				  
			  

/**************************************************************************************************************/
		  /** B) Integer Literals choice **/
		  } else if (select.equalsIgnoreCase("B")) {
			  		
			  		System.out.println("Enter an integer literal: ");
			  		String int_lit = console.nextLine(); 		
			    
			  		Pattern pattern = Pattern.compile("-?[0-9]*"); // the Rule 
			  		
			  		Matcher check = pattern.matcher(int_lit); // What is being checked against the rule
			  		boolean result = check.matches(); // if the rule applies to it , then it returns true meaning valid input
			  	
			  		if (result == true) {
			  			System.out.println("Valid Int Literal: "  + int_lit);
			  		
			  		} else {
			  			System.out.println("InValid Int Literal: "  + int_lit); 
			  		}
		
/**************************************************************************************************************/			  
		  /** C) String Literals choice **/
		  } else if(select.equalsIgnoreCase("C")) {
		
		
			  /** Checks whether the input is a valid string literal or not**/
			  System.out.println("Please place [\"] in the beginning and [\"] at the end. ");
			  System.out.println("Enter a string literal: ");
			  String string_lit = console.nextLine(); 
			  
			  
			  String first_Character = Character.toString(string_lit.charAt(0));
			  int length = string_lit.length()-1; 
			  String last_Character = Character.toString(string_lit.charAt(length));
			  
			  if (first_Character.equals("\"") && (last_Character.equals("\""))) {
				  System.out.println ("Valid String Literal. Your input of: [" +string_lit+"] .");
				  
			  } else {
				  System.out.println("Invalid String Literal. Please place [\"] in the beginning and [\"] at the end. " );
			  }
			
			 
		
			  
/**************************************************************************************************************/ 
		  /** D) Variable Names  choice **/
		  } else if (select.equalsIgnoreCase("D")) { 
			  
		  System.out.println("Enter a variable name: ");
		  String var_name = console.nextLine(); 
			  
			  
		  
	  // Below shows a list of invalids in terms to a variable name AND OTHERS
	  String [] array_keywords = {
		// Primitive Types and Void
	    "boolean", "byte", "char", "short", 
		"int","long","float","double","void",
		
		// Modifiers
		"public","protected","private","abstract","static","final", "transient",
		"volatile",	"synchronized", "native", 
	
		//Declarations
		"class", "interface", "enum","extends", "implements","package","throws",
	
		// Control Flow
		"if","else","then", "try", "catch", "finally", "do", "while", "for",
		"continue","break", "switch", "case", "default", "throw", "return",
		
		//Misc
		"this", "new","super","import", "instanceof", "null", "true", "false",
		"strictfp", "assert", "_", "goto", "const",
		
		// others
		"@", "+", "!"
		
	 
	 } ; 
	    
	
	 
	 String check ="false"; 
	 String answer="";  // to hold the Final Answer of valid or Not
	 
	 /* This checks whether the string literal inputed is valid or not.
	  * If the variable literal equals a keyword, the check becomes True indicating
	  * that the question "Is the string literal an array keyword?" is YES. (or in this case "True).
	  * If TRUE/YES, then that means the variable name is invalid */
	 
	 for (int i = 0; i<= array_keywords.length-1 ; i++) {
		 if (var_name.equals(array_keywords[i])){
			 //System.out.println("Invalid String Literal :" + string_lit);
			 check ="true";
			 break;
		 } else {
			 
		 }
		 
	 }
	 
	 // If true, input is a keyword hence Invalid. Otherwise, it's Valid.
	 if (check.equals("true")) {
		 answer="invalid"; 
	 } else {
		 answer="valid";
	 }
	 
	 System.out.println("Your input : [" + var_name +"] is " +answer +" variable name"); 
			  
	
	
			  

/**************************************************************************************************************/
	      /** Error Selection Output Message  **/
	 } else {
			  System.out.println("Error. You did not exactly select A,B,C,D,a,b,c, or d.");   
	 }
		  
} // End of begin FOR LOOP 		  
		  
		  
		  
	      
	    }// End of Public Static Main Void ARgs
	  
	  
	  
	  
}// end of public class q1 
