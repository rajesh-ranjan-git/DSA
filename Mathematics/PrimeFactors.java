public class PrimeFactors {

    boolean prime(int num) {

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
    
    void primeFactors(int num) {

        if (num <= 1) {
            System.out.println(num);
            return;
        }

        if (prime(num)) {
            System.out.println(num);
            return;
        }

        for (int i = 2; i < num; i++) {
            if (prime(i)) {
                int x = i;
                while (num % x == 0) {
                    System.out.println(i);
                    x *= i;
                }
            }
        }
    }
    
    void primeFactorsOptimized(int num) {
        
        if (num <= 1) {
            System.out.println(num);
            return;
        }

        if (prime(num)) {
            System.out.println(num);
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
        
    }

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();

        int num = 450;

        System.out.println("The prime factorization of " + num + " are :");
        primeFactors.primeFactors(num);

        System.out.println("The prime factorization of " + num + " using optimized method are :");
        primeFactors.primeFactorsOptimized(num);
    }
}
