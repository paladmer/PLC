

#Dynamic
$dogs = 200; 
      
sub function1{  
               return $dogs;  
             } 
        
sub dynamic_func{  
                 # Local indicates to use dynamic scoping.  
                 local $dogs= 100;  
                 return function1();  
                } 
        
 #Static
 
    
    
print dynamic_func()." dogs availible (Dynamic Scope)\n"; 
