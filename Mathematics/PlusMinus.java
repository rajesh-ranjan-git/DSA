public class PlusMinus {

    void plusMinus(int[] plusMinusArr) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < 6; i++) {
            if (plusMinusArr[i] > 0) {
                positiveCounter++;
            } else if (plusMinusArr[i] < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }
        System.out.format("%.6f", ((double) positiveCounter / 6));
        System.out.println();
        System.out.format("%.6f", ((double) negativeCounter / 6));
        System.out.println();
        System.out.format("%.6f" ,((double)zeroCounter / 6));
    }

    public static void main(String[] args) {
        PlusMinus plusMinus = new PlusMinus();

        int[] plusMinusArr = { -4, 3, -9, 0, 4, 1 };
        
        plusMinus.plusMinus(plusMinusArr);
    }
    
}
