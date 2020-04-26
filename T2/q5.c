
#include <stdio.h>

int fun(int *k) {
    *k += 4;                    // *10 +=4 
    return 3 * (*k) - 1;     // 3*(10 + 4)-1
}

void main() {
    
    int i = 10, j = 10, sum1, sum2;
    sum1 = (i / 2) + fun(&i);  // 
    printf("sum1= %d\n", sum1);
    
    sum2 = fun(&j) + (j / 2); // 
    printf("sum2= %d\n",sum2);
}


