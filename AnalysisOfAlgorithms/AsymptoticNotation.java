package AnalysisOfAlgorithms;

/*
 1. Big O : Exact or Upper bound 
 1. Theta : Exact
 1. Omega : Exact or Lower bound

 In most of the cases we use Big O notation as it cover exact and and upper bounds both, we do not take lower bounds i.e Omega as it will take more time in worst case.

 int search(int arr[], int n, int x) {
    for (int i = 0; i < n; i++)
        if (arr[i] == x)
            return i;
    return -1;
}
 
In this function, if the element is found at the first iteration, Order will be C, if it is found in between then it will be linear and if the element is not found at all then also linear.

In this case we cannot take Theta notation as it does not have exact order.
Since we generally take upper bounds in consideration so it will be O(n) and not Omega(n).
 */

public class AsymptoticNotation {

    int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        AsymptoticNotation a = new AsymptoticNotation();
        int[] arr = { 1, 2, 3, 4 };
        int index = a.search(arr, 4, 5);

        System.out.println(index);
    }
    
}
