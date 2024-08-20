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

    int countSetBits2(int num) {
        int counter = 0;

        while (num > 0) {
            counter += (num & 1);

            num /= 2;
        }

        return counter;
    }

    int countSetBitsUsingBrianCunninghamAlgorithm(int num) {
        int counter = 0;

        while (num > 0) {
            num = num & (num - 1);
            counter++;
        }

        return counter;
    }

    int[] tbl = new int[256];

    void initialize() {
        tbl[0] = 0;
        for (int i = 1; i < 256; i++)
            tbl[i] = tbl[i & (i - 1)] + 1;
    }
    
    int countSetBitsWithTableApproach(int num) {
        return tbl[num & 255] + tbl[(num >> 8) & 255] + tbl[(num >> 16) & 255] + tbl[(num >> 24)];
    }
    
    public static void main(String[] args) {
        CountSetBits countSetBits = new CountSetBits();

        int num = 15;

        System.out.println(countSetBits.countSetBits(num));
        System.out.println(countSetBits.countSetBits2(num));
        System.out.println(countSetBits.countSetBitsUsingBrianCunninghamAlgorithm(num));
        System.out.println(countSetBits.countSetBitsWithTableApproach(num));
    }
}
