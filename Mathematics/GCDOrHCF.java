public class GCDOrHCF {

    int gcdOrHCF(int num1, int num2) {
        if (num1 == 0 || num2 == 0)
            return 0;

        if (num1 == num2)
            return num1;

        if (num1 % num2 == 0)
            return num2;
        else if (num2 % num1 == 0)
            return num1;

        int gcd = 1;
        int minValue = Math.min(num1, num2);

        for (int i = 2; i < minValue / 2; i++) {
            if (num1 % i == 0)
                if (num2 % i == 0)
                    gcd = i;
        }

        return gcd;
    }
    
    int gcdUsingEuclidAlgorithm(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }

        return num1;
    }

    int gcdUsingOptimizedEuclidAlgorithm(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcdUsingOptimizedEuclidAlgorithm(num2, num1 % num2);
        }
    }
    
    public static void main(String[] args) {
        GCDOrHCF gcdOrHCF = new GCDOrHCF();
        int inputNum1 = 1260;
        int inputNum2 = 730;

        System.out.println("Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of " + inputNum1 + " & " + inputNum2 + " is : " + gcdOrHCF.gcdOrHCF(inputNum1, inputNum2));
        System.out.println("Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of " + inputNum1 + " & " + inputNum2 + " using Euclid's Algorithm is : " + gcdOrHCF.gcdUsingEuclidAlgorithm(inputNum1, inputNum2));
        System.out.println("Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of " + inputNum1 + " & " + inputNum2 + " using Euclid's Algorithm efficiently is : " + gcdOrHCF.gcdUsingEuclidAlgorithm(inputNum1, inputNum2));
    }
}
