public class NoOfDigitsInFactorial {

    int noOfDigitsInFactorial(int num) {
        long res = 1;
        
        for (long i = num; i > 0; i--) {
            res *= i;
        }
        
        int noOfDigits = 0;
        
        while (res != 0) {
            res = res / 10;
            noOfDigits++;
        }
        
        return noOfDigits;
    }

    int noOfDigitsInFactorialOptimized(int num) {
        if (num < 0)
            return 0;
        
        if (num <= 1)
            return 1;
            
        double noOfDigits = 0;
        
        for (int i = 2; i <= num; i++)
            noOfDigits += Math.log10(i);
            
        return (int) (Math.floor(noOfDigits)) + 1;
    }
    
    public static void main(String[] args) {
        NoOfDigitsInFactorial noOfDigitsInFactorial = new NoOfDigitsInFactorial();

        int num = 5;

        System.out.println(noOfDigitsInFactorial.noOfDigitsInFactorial(num));
        System.out.println(noOfDigitsInFactorial.noOfDigitsInFactorialOptimized(num));
    }
}
