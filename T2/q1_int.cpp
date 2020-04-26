

#include <iostream>

using namespace std;

int main() 
{ 
    
     //individual variables // there isn't really a group for them anymore in the int version.
    int Male = 0 ;
    int Female  = 1 ;
    int diamond = 100; 
    int human = 50; 
    int crystalgems = 300; 
                  

    
  
  // a difference
int genderSelect = 1; 

    switch (genderSelect) { 
    case 0: 
        cout << "Gender is Male \n"; 
        printf("Value [Male]:  %d\n",genderSelect);
        break; 
    case 1:
        cout << "Gender is Female"; 
        printf("Value [Female]:  %d\n",genderSelect);
        break; 
    default: 
        cout << "Value can be Male or Female \n"; 
    } 

    if (crystalgems>diamond) {
     
         printf("Value [crystalgems]:  %d\n" , crystalgems);
         printf("Value [diamond]:  %d\n" , diamond);
         printf("RESULT: We are the Crystal gems. Our strength is %d\n" , crystalgems);
         
        } else {
       
         printf("Value [crystalgems]:  %d\n" , crystalgems);
         printf("Value [diamond]:  %d\n" , diamond);
         printf("RESULT: We are the Diamonds. Our strength is %d\n" , diamond);
        }
    
    if (crystalgems == (diamond+200)){
      
         printf("Value [crystalgems]:  %d\n" , crystalgems);
         printf("Value [diamond+200]:  %d\n" , diamond+200);
         printf("Result: Crystal Gems and Diamonds now have the same value #equality.\n");
    } else {
     
        printf("Value [crystalgems]:  %d\n" , crystalgems);
        printf("Value [diamond+200]:  %d\n" , diamond+200);
        printf("Result: We are not the same.\n");
    }
    
    if (diamond<=(human+crystalgems) ) {
       
         printf("Value [crystalgems+human]:  %d\n" , crystalgems+human);
         printf("Value [diamond]:  %d\n" , diamond);
         printf("Result: Steven,Garnet,Amethyst and Pearl are a greater team than the evil diamonds.\n");
    } else {
        
         printf("Value [crystalgems+human]:  %d\n" , crystalgems+human);
         printf("Value [diamond]:  %d\n" , diamond);
         printf("Result: Oh no. The Evil diamonds are better than us\n");
    }

    printf("The size for the enum variable = %d bytes", sizeof(Male));

    
    return 0; 
} 
