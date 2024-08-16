package AnalysisOfAlgorithms;

/*
A function f(n) is said to be growing faster that g(n) if
lim(n->infinity) g(n)/f(n) = 0 // f(n) and g(n) represent time taken

or lim(n->infinity) f(n)/g(n) = infinity // n >= 0 (size of input so must be greater than 0) f(n), g(n) >= infinity (represents time taken so must be greater than 0)

DIrect way to fins and compare growth
1. Ignore lower order terms
2. Ignore leading term constant

Eg. f(n) = 2(n)2 + n + 6, order of growth : (n)2 - quadratic
    g(n) = 100n + 3, order of growth : n - linear

How do we compare terms ?

c < log (log (n)) < log n < (n)1/3 < (n)1/2 < n < (n)2 < (n)3 < (n)4 < (2)n < (n)n

Q1. f(n) = C1log n + C2 => log n
    g(n) = C3n + C4log (log (n)) + C5 => n
Ans. g(n) - takes more time

Q2. f(n) = C1(n)2 + C2n + C3 => (n)2 => n
    g(n) = C4n log n + C5n + C6 => n log n => log n
Ans. f(n) - takes more time
*/

public class OrderOfGrowth {
    
}
