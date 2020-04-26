#include<stdio.h>
int main(){ 
    int a=10;
    int b=5;
    int c=1;
    
    // same concept as a>b>c since in math, you read from left to right and evaluate the 
    // first expression of is (a>b)? if that is right, then look at (b>c). Is (b>)
    if(a>b){ 
        printf("true A is greater than B: %d > %d \n",a,b); 
            if(b>c){
                printf("true B is greater than C: %d > %d \n",b,c); 
            } else {
                 printf("False B is not greater than C: %d > %d \n",b,c); 
            }
    } else { 
        printf("false A is not greater than B: %d > %d >%d \n",a,b,c);
    }
    
      // alternative way
    if(a>b && b>c){ 
        printf("true,%d > %d > %d \n",a,b,c); // means A>B>C 
    } else { 
        printf("false%d > %d >%d \n",a,b,c);
    }
    
    
    // but if you wrote it verbatim 
    if (a>b>c){
        printf("Verbatim Version: true,%d > %d > %d \n",a,b,c); // means A>B>C 
    } else {
        printf("Verbatim Version: false,%d > %d > %d \n",a,b,c); 
    }
    
}
