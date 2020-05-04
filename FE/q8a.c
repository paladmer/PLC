// question 8 Rewrite it using no goto or breaks.
// Merizka Palad Final Exam
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
   int i ; int j; bool flag = false; 
   j = -3; 
   for (i = 0; i < 3; i++) { 
    
       switch (j + 2) { 
      
           case 3: 
           case 2: j--;
                  flag = true;
                  if (flag == true){
                     continue; 
                  }
                  
                 
           case 0: j += 2;
                  flag = true;
                  if (flag == true){
                     continue; 
                  } 
           default: j = 0; 

           
       } 
           if (j > 0) 
                  flag = true;
                  if (flag == true){
                     continue; 
                  }
           j = 3 - i; 
         //  printf("%d \n", j );
         
   }

} 

/** Original  C  Code Segment: 
   j = -3; 
   for (i = 0; i < 3; i++) { 
      switch (j + 2) { 
           case 3: 
           case 2: j--; 
                 break; 
           case 0: j += 2;
                 break; 
           default: j = 0; 
       } 
           if (j > 0) break;  
           j = 3 - i; 
   }

} 
**/
