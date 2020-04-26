#include <time.h>
#include <stdlib.h>
#include <stdio.h>

// three functions that declare a large array 
// 1. statically
// 2. large array on stack
// 3. one that creates from heap 


	void test_stackFunc(void){
		 int ArrayC[100];
	}
	
	void test_staticFunc(void){ 
		static int ArrayA[100];
	}

	void test_heapFunc(void){
		 int *c = (int *) malloc (100 *sizeof(int)); 
	}

main(void){
    struct timespec firsttime, secondtime;
	
	
	//** Stat
    clock_gettime(CLOCK_REALTIME, &firsttime);
	int timesToDo = 1000000; // at least lol
	long ns_Result = secondtime.tv_nsec - firsttime.tv_nsec ; 
    for(int m = 0; m < timesToDo; m++){
        test_staticFunc();
    }
    clock_gettime(CLOCK_REALTIME, &secondtime);
    printf("[test_staticFunc] Time Taken: %ld ns to call it 1000,000 times: \n", secondtime.tv_nsec - firsttime.tv_nsec);

	// ** Stack
    clock_gettime(CLOCK_REALTIME, &firsttime);
    for(int x = 0; x < timesToDo; x++){
        test_stackFunc();
    }
    clock_gettime(CLOCK_REALTIME, &secondtime);
    printf("[test_stackFunc] Time Taken:  %ld ns to call it 1000,000 times: \n", secondtime.tv_nsec - firsttime.tv_nsec);

	// ** Heap
    clock_gettime(CLOCK_REALTIME, &firsttime);
    for(int p = 0; p < timesToDo; p++){
        test_heapFunc();
    }
    clock_gettime(CLOCK_REALTIME, &secondtime);
    printf("[test_heapFunc] Time Taken: %ld ns to call it 1000,000 times: \n", secondtime.tv_nsec - firsttime.tv_nsec);
}
