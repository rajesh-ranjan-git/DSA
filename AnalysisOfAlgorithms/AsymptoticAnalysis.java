package AnalysisOfAlgorithms;
/* 
 1. The idea is to measure order of growth.
 2. Does not depend upon machine, programming language or test cases etc.
 3. No need to implement, we can analyze algorithm by just looking at it

int sum2(int num) {
    return num * (num + 1) / 2;     // most efficient - 3 mathematical operations = C1
}
    Time taken : C1 - constant time
    
int sum1(int num) {
    int temp = 0;
    for (int i = 1; i <= num; i++) {    // 3 individual operations (temp = 0, return temp and i = 1) = C3
        temp = temp + i;                // then loops doing n operations = C2n
    }
    return temp;
}
    Time taken : C2n + C3 // linear time


int sum3(int num) { // never executes
    int temp = 0;
    for (int i = 1; i <= num; i++) {    // 2 individual operations = C6
      for (int j = 1; j <= i; i++)      // 1 operation n times (1st loop)
                                        // 1 operation (n)2 times (2nd loop)
        temp++;
    }
    return temp;
}
    Time taken : C4(n)2 + C5n + C6 // quadratic time

    Any mathematical operation is assumed to be taking the same time (a constant time)
 */

public class AsymptoticAnalysis {

}
