// question 8 Rewrite it using no goto or breaks. 
#include <stdio.h>
#include <stdlib.h>

int main()
{
   int i ; int j; 
   j = -3; 
   for (i = 0; i < 3; i++) { 
    
       switch (j + 2) { 
      
           case 3: 
           case 2: j--; 
                 exit(0); 
           case 0: j += 2;
                 exit(0); 
           default: j = 0; 

           
       } 
           if (j > 0) exit(0);  
           j = 3 - i; 
         
   }

} 

/** Original  C  Code Segment: 
   j = -3; 
   for (i = 0; i < 3; i++) { 
      switch (j + 2) { 
           case 3: 
           case 2: j--; 
                 exit(0); 
           case 0: j += 2;
                 exit(0); 
           default: j = 0; 
       } 
           if (j > 0) exit(0);  
           j = 3 - i; 
   }

} 
**/
