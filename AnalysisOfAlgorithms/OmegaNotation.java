package AnalysisOfAlgorithms;

/*
 
f(n) = Omega(g(n)) iff there exists constant C (where C > 0) and n0 (where n0 >= 0) such that (g(n)) <= f(n) for all n >= n0.

Mainly used when we have a lower bound.

f(n) = 2n + 3 = Omega(n)
C = 1
n <= 2n + 3
-3 <= n
n0 = 0 as if n is valid for -3 it will be valid for 0 as well and we do not consider negative values.

This was direct method.

Lets look at mathematical way.

{(n)2, 2(n)2 + 5, 1000(n)2, 2(n)3 + n, ..........} => Omega(n2)
U {2n + 3, 100n + log n, ..............} => Omega(n)
U {5000, (10)5, log 2000, ..............} => Omega(1)

 */

public class OmegaNotation {
    
}
