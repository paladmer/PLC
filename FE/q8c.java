/** Merizka Palad
 * PLC_Final Exam Q8c**/
import java.util.*;
public class q8c {

	public static void main(String[] args) {
		int j = -3;
			 
		for (int i = 0; i < 3; i++) { 
		      if((j + 2 == 3)||(j + 2== 2)) {
		      		j--; // case 2
		      		break; 
		      }else if (j+2 ==0){
		      	    j+=2; // case 0
		      	    break;
		      } else {
		      	    j=0;  // case default
		      }
			  
		      
		      if(j > 0) {
				break;
			  }
			   j = 3 - i;
			}
	}
}
