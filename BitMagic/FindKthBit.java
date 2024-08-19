public class FindKthBit {

    boolean findKthBitUsingRShift(int num, int k) {
        return num >> k - 1 % 2 != 0;
    }

    boolean findKthBitUsingAND(int num, int k) {

        int kVal = 1;

        for (int i = 0; i < (k - 1); i++)
            kVal *= 2;

        return (num & kVal) != 0;
    }
    
    boolean findKthBitUsingAND2(int num, int k) {

        for (int i = 0; i < (k - 1); i++)
            num /= 2;

        return (num & 1) != 0;
    }
    
    boolean findKthBitUsingANDOptimized(int num, int k) {

        int kVal = 1 << k - 1;

        return (num & kVal) != 0;
    }
    
    boolean findKthBitUsingANDOptimized2(int num, int k) {
        return ((num >> (k - 1)) & 1) != 0;
    }
    
    public static void main(String[] args) {
        FindKthBit findKthBit = new FindKthBit();

        int num = 5;
        int k = 3;

        System.out.println(findKthBit.findKthBitUsingRShift(num, k));
        System.out.println(findKthBit.findKthBitUsingAND(num, k));
        System.out.println(findKthBit.findKthBitUsingAND2(num, k));
        System.out.println(findKthBit.findKthBitUsingANDOptimized(num, k));
        System.out.println(findKthBit.findKthBitUsingANDOptimized2(num, k));
    }
}
