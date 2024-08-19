public class CountSetBits {

    int countSetBits(int num) {
        int counter = 0;

        while (num > 0) {
            if ((num & 1) != 0)
                counter++;

            num /= 2;
        }

        return counter;
    }

    int countSetBitsUsingBrianCunninghamAlgorithm(int num) {
        return 1;
    }
    
    public static void main(String[] args) {
        CountSetBits countSetBits = new CountSetBits();

        int num = 15;

        System.out.println(countSetBits.countSetBits(num));
    }
}
