public class ComputationPower {

    void powerOfNum (int num, int power) {
        int powerOfNum = num;
        for (int i = 2; i <= power; i++) {
            powerOfNum *= num;
        }
        System.out.println(powerOfNum);
    }
    public static void main(String[] args) {
        ComputationPower computationPower = new ComputationPower();

        int num = 2;
        int power = 8;

        computationPower.powerOfNum(num, power);
    }
}
