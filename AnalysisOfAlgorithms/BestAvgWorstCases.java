package AnalysisOfAlgorithms;

/*
int getSum (int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += arr[i];
    
    return sum;
}
    
Time Taken = C1n + C2
Order of Growth = n

int getSum (int arr[], int n) {
    if (n % 2 == 0)
        return 0;
    
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += arr[i];

    return sum;
}

Time Taken = C1n + C2 or C1
Order of Growth = n or C

Here we can't generalize the order of growth here as it behaves differently for different inputs.
So we divide it in 3 cases : 
1. Best : Constant
            C1
2. Average : Linear (Under the assumption that even and odd cases are equally likely)
            (C1n + C2 + C1)/2 => n
3. Worst : Linear
            n

In practical scenarios we always consider worst case as it will define how efficient an algorithm is.
 */

public class BestAvgWorstCases {

}
