public class ComputationPower {

    int powerOfNum(int num, int power) {
        int powerOfNum = num;
        for (int i = 2; i <= power; i++) {
            powerOfNum *= num;
        }
        return powerOfNum;
    }
    
    int powerOfNumOptimized(int num, int power) {

        if (power == 0)
            return 1;

        int powerOfNum = powerOfNumOptimized(num, power / 2);
        
        powerOfNum *= powerOfNum;

        if (power % 2 == 0)
            return powerOfNum;
        else
            return powerOfNum * num;
    }
    
    public static void main(String[] args) {
        ComputationPower computationPower = new ComputationPower();

        int num = 2;
        int power = 8;

        // System.out.println(computationPower.powerOfNum(num, power));
        System.out.println(computationPower.powerOfNumOptimized(num, power));
    }
}
