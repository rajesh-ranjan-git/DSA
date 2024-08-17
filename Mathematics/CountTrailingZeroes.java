public class CountTrailingZeroes {
    
    long getFactorial(long num) {
        if (num == 0)
            return 1;

        return num * getFactorial(num - 1);
    }

    int getTrailingZeroes(long num) {
        long fact = getFactorial(num);
        int counter = 0;

        while (fact % 10 == 0) {
            counter++;
            fact /= 10;
        }

        return counter;
    }

    // Since the above method will cause overflow after sometime and may misbehave, we need to find more optimized solution for this one.

    int getTrailingZeroesEfficiently(int num) {
        int res = 0;
        for (int i = 5; i <= num; i *= 5)
            res += num / i;

        return res;
    }

    public static void main(String[] args) {
        CountTrailingZeroes countTrailingZeroes = new CountTrailingZeroes();
        long inputNum = 20;
        int inputNum1 = 1024;
        
        System.out.println("Trailing zeroes in factorial of " + inputNum + " : " + countTrailingZeroes.getTrailingZeroes(inputNum));
        System.out.println("Efficient way for trailing zeroes in factorial of " + inputNum + " : " + countTrailingZeroes.getTrailingZeroesEfficiently(inputNum1));
    }
}
