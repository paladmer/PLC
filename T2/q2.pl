

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
        
 #Static aka lexical scoping.
 #my is only visible in current subrountine.
 sub static_func{  
                 # my indicates static scoping.  
                 my $dogs= 300;  
                 return function1();  
                } 
        

    
print dynamic_func()." dogs availible (Dynamic Scope)\n"; 
print static_func()." dogs availible (Static Scope)\n"; 
