

#include <iostream>

using namespace std;

int main() 
{ 
    // Defines enum gender 
    enum gender { Male, 
                  Female }; 
    enum strength {
        diamond = 100,
        human =50,
        crystalgems=300,
    };
  
    gender genderSelect = Female; 
  
    switch (genderSelect) { 
    case Male: 
        cout << "Gender is Male \n"; 
        printf("Value [Male]:  %d\n" , Male);
        
        break; 
    case Female: 
        cout << "Gender is Female"; 
        printf("Value [Female]:  %d\n" , Female);
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
