public class OneOddOccurring {

    int oneOddOccurring(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    counter++;
            }

            if (counter % 2 != 0)
                return arr[i];
        }

        return 0;
    }

    int oneOddOccurringUsingXOR(int[] arr) {

        int res = arr[0];

        for (int i = 1; i < arr.length; i++)
            res ^= arr[i];

        return res;
    }

    public static void main(String[] args) {
        OneOddOccurring oneOddOccurring = new OneOddOccurring();

        int[] arr = new int[5];

        arr[0] = 7;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 7;
        arr[4] = 7;

        System.out.println(oneOddOccurring.oneOddOccurring(arr));
        System.out.println(oneOddOccurring.oneOddOccurringUsingXOR(arr));
    }
    
}
