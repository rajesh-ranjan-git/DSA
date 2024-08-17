public class AllDivisorsOfNum {

    boolean isPrime(int num) {

        if (num == 2 || num == 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }
    
    void allDivisorsOfNum(int num) {

        if (isPrime(num))
            System.out.println(num);
        else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0)
                    System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        AllDivisorsOfNum allDivisorsOfNum = new AllDivisorsOfNum();

        int num = 47;

        System.out.println("All divisors of " + num + " are : \n1");
        allDivisorsOfNum.allDivisorsOfNum(num);
    }
}
