public class TwoOddOccurring {

    void twoOddOccurring(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;

            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j])
                    counter++;

            if (counter % 2 != 0)
                System.out.println(arr[i]);
        }
    }
    
    void twoOddOccurringUsingXOR(int[] arr) {

        int x = arr[0];

        for (int i = 1; i < arr.length; i++)
            x ^= arr[i];

        int k = (x & (~(x - 1)));

        int res1 = 0, res2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & k) != 0)
                res1 ^= arr[i];
            else
                res2 ^= arr[i];
        }

        System.out.println(res1);
        System.out.println(res2);
    }
    
    public static void main(String[] args) {
        TwoOddOccurring twoOddOccurring = new TwoOddOccurring();

        int[] arr = new int[10];

        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 4;
        arr[6] = 4;
        arr[7] = 6;
        arr[8] = 7;
        arr[9] = 7;

        twoOddOccurring.twoOddOccurring(arr);
        twoOddOccurring.twoOddOccurringUsingXOR(arr);
    }
}
