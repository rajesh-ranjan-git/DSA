package AnalysisOfAlgorithms;

/*

Direct way :
1. Ignore the lower order terms
2. Ignore leading term constant

2(n)2 + 5n + 6 => O(n)2
3n + 10n log n + 3 => O(n log n)
10(n)3 + 40n + 10 => O(n)3

Mathematical definition of Big O notation : 
We say f(n) = O(g(n)), if there exist constants c and n0 such that f(n) <= Cg(n) for all n >= n0.

Example : f(n) = 2n + 3 can be written as O(n) [g(n) = n]
lets take C = 3 -> Why did we take 3, generally we take constant of higher term and add 1 to it
2n + 3 <= 3n
3 <= n
we get n0 = 3

More examples of Big O notation : 

{100, log 2000, (10)4, ................} => O(1) // When we know the exact order then we use theta notation only
U {n/4, 2n + 3, n/100 + log n, n + 10000, log n + 10, ..............} => O(n)
U {(n)2 + n, 2(n)2, (n)2, (n)2 + 1000n, (n)2 + n log n, (n)2/1000, ..........} => O((n)2)

Big O notation works for multiple variables also : 

100(n)2 + 1000m + n : O((n)2 + m)
1000(m)2 + 200mn + 30m + 20n : O((m)2 + mn)

Applications of Big O notation : Used when we have upper bound.

    boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return false;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
        
In this program the order is O((n)1/2).
 */

public class BigONotation {

    boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return false;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        BigONotation b = new BigONotation();
        System.out.println(b.isPrime(17));
    }

}
