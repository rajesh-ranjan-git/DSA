public class PowerSetUsingBitwise {

    void powerSetUsingBitwise(String str) {

        int n = str.length();
        int pSize = (1 << n);

        System.out.print(str[0]);

        for (int i = 0; i < pSize; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str[j]);
                }
            }

            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        PowerSetUsingBitwise powerSetUsingBitwise = new PowerSetUsingBitwise();

        String str = "abc";
        powerSetUsingBitwise.powerSetUsingBitwise(str);
    }
}
