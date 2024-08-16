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

    public static void main(String[] args) {
        CountTrailingZeroes countTrailingZeroes = new CountTrailingZeroes();
        long inputNum = 20;
        
        System.out.println("Trailing zeroes in factorial of " + inputNum + " : " + countTrailingZeroes.getTrailingZeroes(inputNum));
    }
}
