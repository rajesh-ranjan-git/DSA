public class SumOfDigits {
    
    int getSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println(sumOfDigits.getSumOfDigits(789));
    }
}
