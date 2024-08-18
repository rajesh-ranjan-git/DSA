public class IterativePower {

    int iterativePower(int num, int power) {

        int powerOfNum = 1;

        while (power > 0) {
            if (power % 2 != 0) {
                powerOfNum *= num;
            }

            power /= 2;
            num *= num;
        }
        return powerOfNum;
    }
    
    public static void main(String[] args) {
        IterativePower iterativePower = new IterativePower();

        int num = 4;
        int power = 5;

        System.out.println(iterativePower.iterativePower(num, power));
    }
}
