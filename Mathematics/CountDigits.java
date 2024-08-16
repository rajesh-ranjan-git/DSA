public class CountDigits {

    int getCountOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.getCountOfDigits(789));
    }
}