package AnalysisOfAlgorithms;

/*
Theta Notation

f(n) = Theta(g(n)) iff there exists constants C1, C2 (where C1 > 0 and C2 > 0) and n0 (where n0 >= 0) such that C1g(n) <= f(n) <= C2g(n) for all n >= n0.

Example : f(n) = 2n + 3 : Theta(n)
C1 = 2, C2 = 3

n <= 2n + 3 <= 3n       n0 = 3
n >= 0      n >= 3

Direct method :

1000(n)2 + 100n log n + 2n : Theta((n)2)
200(n)3 + 30n + 5 : Theta((n)3)
2000n + 2log n : Theta(n)

Facts about Theta notation : 

1. If f(n) = Theta(g(n))
then f(n) = O(g(n)) and f(n) = Omega(g(n))
and g(n) = O(f(n)) and g(n) = Omega(f(n))

2. Represents exact bound

3. {100, (10)5, log 2000, ...........} => Theta(1)
{100n, 2n + log n, 5n + 3, ..........} => Theta(n)
{2(n)2, ((n)2)/4 + 5n log n, ........} => Theta((n)2)
 */

public class ThetaNotation {
    
}
