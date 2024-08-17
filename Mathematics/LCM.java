public class LCM {

    int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }
    
    int lcmByGDC(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }

    int lcmByDivision(int num1, int num2) {
        int res = Math.max(num1, num2);
        
        while (true) {
            if (res % num1 == 0 && res % num2 == 0) {
                break;
            }
            res++;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        LCM lcm = new LCM();

        int num1 = 4;
        int num2 = 6;
        System.out.println("LCM of " + num1 + " & " + num2 + " by Euclid Algorithm method is : " + lcm.lcmByGDC(num1, num2));
        System.out.println("LCM of " + num1 + " & " + num2 + " by Division method is : " + lcm.lcmByDivision(num1, num2));
    }
}
