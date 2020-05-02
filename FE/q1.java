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
		  System.out.println("Enter your selection letter:  ");
		  String select = console.nextLine(); 
		  
		  /** A) Floating-Point Literals choice **/
		  if (select.equalsIgnoreCase("A")) {
			
			  
			  
		  /** B) Integer Literals choice **/
		  } else if (select.equalsIgnoreCase("B")) {
			  		
			  		System.out.println("Enter an integer literal: ");
			  		String int_lit = console.nextLine(); 		
			    
			  		Pattern pattern = Pattern.compile (".*[0-9].*");
			  		
			  	

			  		boolean output = !pattern.matcher(int_lit).matches() ; 

			  		if (output = false) {
			  			System.out.println("Invalid Int Literal :" + int_lit);
			  		} else {
			  			System.out.println("Valid Int Literal :"  + int_lit);
			  		}
			  		
			  		
			  		//Pattern pattern = Pattern.compile("[0-9]*");
			  		
			  		
			  		//try {
				
					  /// ^-?\\d*(\\.\\d+)?$
			  		
			  	/**	boolean isNumber = true; 
			  		
			  		isNumber = int_lit.matches("");
			  		//-?\\d*(\\.\\d+)?$
			  		//-?\\\\d+(\\\\.\\\\d+)?
			  		if (isNumber) {
			  			System.out.println("Valid Int Literal! :"+ int_lit);
			  			
			  		} else {
			  			 System.out.println("Invalid Int Literal! :"+ int_lit);
			  		} 
			  		
				/**	  if (Pattern.matches("[a-Z]+", int_lit ) == false) {
						  System.out.println("Valid Int Literal! :"+ int_lit);
					  } else {
						  System.out.println("Invalid Int Literal! :"+ int_lit);
					  }
			  //		} catch (java.util.regex.PatternSyntaxException error) {
			  			
			  			 System.out.println("After Catch");
			  //		} **/ 
					  
					  
					  
					  
					  /** Checks whether the input is a valid int literal or not**/
					 
					/*  try {		 
						  int change = Integer.parseInt(int_lit);
						  System.out.println("Valid Int Literal! "+ int_lit );
						  
					  } catch (NumberFormatException error) {
						  System.out.println("Invalid Int Literal! " + int_lit);
					  } */ 
					  /****/
					  
					  
			
			  
		  /** C) String Literals choice **/
		  } else if(select.equalsIgnoreCase("C")) {
		
			  
			  
		  /** D) Variable Names  choice **/
		  } else if (select.equalsIgnoreCase("D")) { 
			  

			  
			  
	      /** Error Selection Output Message  **/
		  } else {
			  System.out.println("Error. You did not exactly select A,B,C,D,a,b,c, or d.");   
		  }
		  
		  
		  
		  
		  /** Floating points in Java can come with an f. 
		   * EXAMPLE: float a = 2.356f , no more than 6 or 7 precision
		   * points. They can also have 
		   * 
		   *  12.12345 is a float.
		   *  12.123456789 is a double. 15-16 points of precision
		   * 
		   *  variable names are just strings followed by an = sign?
		   *  
		   *  **/
		 
		  
		
		  
		  float cat = 100; 
		  float cats2 = 100f; 
		  float cats3 = 100F; 
		  float cats4 = 100l; 
		  float cats5 = 100L;

		  float something= 99.9f;
		  float something2= 99.99999999999999999999999f;
	//invalid	  float something3= 99.9;
		  
		  System.out.println("Enter a floating point: ");
		  String float_lit = console.nextLine();
		  
		  // if the last letter is not an f or F, that's invalid
		  // The last letters has to be an f,l,L
		  

		  String lastCharacter = "";
		  lastCharacter = float_lit.substring(float_lit.length()-1); 
		  
		  if (lastCharacter.equals("f")|lastCharacter.equals("F")|lastCharacter.equals("l")|lastCharacter.equals("L")) {
			  System.out.println("The last character is valid and is either f, F, l , or L "); 
		  }
		  
		  
		  
		  try {
			 float change = Float.parseFloat(float_lit);
			  System.out.println("Valid Float Literal! " + float_lit);  
		  } catch (NumberFormatException error){
			  System.out.println("Invalid Float Literal! " + float_lit);
		  }
		  
		 
		   
		  
		  
		  /** Checks whether the input is a valid string literal or not**/
		  System.out.println("Enter a  string literal: ");
		  String string_lit = console.nextLine(); 
				  
		  // Below shows a list of invalids in terms to a string literal/variable name
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
			"strictfp", "assert", "_", "goto", "const" 
		 
		 } ; 
		  
		  
		  
		 
		 String check ="false"; 
		 String answer="";  // to hold the Final Answer of valid or Not
		 
		 /* This checks whether the string literal put in is valid or not
		  * if the string literal equals a keyword, the check becomes True indicating
		  * that the question "string literal equals a array keyword?" is true thus,
		  * it is invalid */
		 
		 for (int i = 0; i<= array_keywords.length-1 ; i++) {
			 if (string_lit.equals(array_keywords[i])){
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
		 
		 System.out.println("Your input : [" + string_lit +"] is " +answer);
	      
	    }
	  
	  
	  
	  /*	  
	   // It can't be java keywords & it needs to be letters only & no spaces
	  System.out.println("Enter a variable name: ");
	  String var_name = console.nextLine(); 
	 
	  
	   */
	  
	  
	  
	  
}
