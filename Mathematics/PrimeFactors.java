public class PrimeFactors {

    boolean prime(int num) {

        if (num == 2 || num == 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }
    
    void primeFactors(int num) {

        if (prime(num)) {
            System.out.println(num);
            return;
        }
        
        if (num == 0 || num == 1 || num == 2 || num == 3) {
            System.out.println(num);
            return;
        }

        while (num % 2 == 0) {
            System.out.println(2);
            num /= 2;
        }

        while (num % 3 == 0) {
            System.out.println(3);
            num /= 3;
        }

        for (int i = 5; i * i < num; i++) {
            while (prime(i)) {
                System.out.println(i);
                num /= i;
            }
        }

        System.out.println(num);
    }

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();

        int num = 10008;

        System.out.println("The prime factorization of " + num + " are :");
        primeFactors.primeFactors(num);
    }
}
