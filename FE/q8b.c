// question 8b Rewrite it using if and goto in C
/** Merizka Palad
 * PLC_Final Exam Q8B**/
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
 int j ; int i ; 

    c3:  ; // case 3 
         
    c2: //case 2
        j--;
        goto Exit;      
    
    c0: //case 3
        j+=2;
        goto Exit; 

    cd: //case default
        j = 0;
 
   for (i = 0; i < 3; i++) { 
      if((j + 2== 2)||(j + 2 == 3))
        goto c2;
        
      else if (j + 2 == 0)
        goto c0;
        
      else 
        goto cd;
   
      if (j > 0) 
        goto Exit;
      else 
       j= 3-i; 
  
   }
   
   Exit: ; 
 
} 
