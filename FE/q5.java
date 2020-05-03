/** Merizka Palad
 * PLC_Final Exam Q5**/

import java.util.*; 
public class q5 {
	public static void main(String[] args) {
		
		int i; int j; int n = 3; 
		
		
		
		int[][] x = {{0, 0, 0,}, 		// x[0][0] x[0][1] x[0][2] x[0][3]	This is Row 0
					 {1, 1, 0,},   		// x[1][0] x[1][1] x[1][2] x[1][3]	This is Row 1
					 {213, 567, 12,}};  // x[2][0] x[2][1] x[2][2] x[2][3]	This is Row 2  
		

		for( i = 0; i <= n; i++) {
			for(j = 0; j < n;) {
				if(x[i][j] == 0) {
					j++;
				} else {
					break;
				}
			}
			if(j == n) {
				System.out.print("Where is the [first all zero row] located at?\n"
									+ "It is at Row: " 	+ (i));
				break;
			} else {
				
			}
		
		}
		 
	}
}
