public class PowerOf2 {

    boolean powerOf2(int num) {
        if (num == 0)
            return false;

        while (num % 2 == 0)
            num /= 2;

        if (num == 1)
            return true;
        else
            return false;
    }
    
    boolean powerOf2UsingBrianCunninghamAlgorithm(int num) {
        int counter = 0;

        while (num > 0) {
            num = num & (num - 1);
            counter++;
        }

        if (counter == 1)
            return true;
        else
            return false;
    }

    boolean powerOf2UsingBrianCunninghamAlgorithmOptimized(int num) {
        if (num == 0)
            return false;

        return ((num & (num - 1)) == 0);
    }

    /* boolean powerOf2UsingBrianCunninghamAlgorithmSingleLine(int num) {
        if (num == 0)
            return false;

        return (num && ((num & (num - 1)) == 0)); // This is not working in java.
    } */
    
    public static void main(String[] args) {
        PowerOf2 powerOf2 = new PowerOf2();

        int num = 255;

        System.out.println(powerOf2.powerOf2(num));
        System.out.println(powerOf2.powerOf2UsingBrianCunninghamAlgorithm(num));
        System.out.println(powerOf2.powerOf2UsingBrianCunninghamAlgorithmOptimized(num));
        // System.out.println(powerOf2.powerOf2UsingBrianCunninghamAlgorithmSingleLine(num));
    }
}
