import java.util.Arrays;

public class SieveOfEratosthenes {

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

    void sieveOfEratosthenes(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    void sieveOfEratosthenesOptimized(int num) {
        boolean[] isPrimeArr = new boolean[num + 1];
        Arrays.fill(isPrimeArr, true);

        for (int i = 2; i * i <= num; i++) {
            if (isPrimeArr[i]) {
                for (int j = 2 * i; j <= num; j += i) {
                    isPrimeArr[j] = false;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (isPrimeArr[i])
                System.out.println(i);
        }
    }

    void sieveOfEratosthenesMoreOptimized(int num) {
        boolean[] isPrimeArr = new boolean[num + 1];
        Arrays.fill(isPrimeArr, true);

        for (int i = 2; i <= num; i++) {
            if (isPrimeArr[i]) {
                System.out.println(i);
                for (int j = i * i; j <= num; j += i) {
                    isPrimeArr[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();

        int num = 25;

        sieveOfEratosthenes.sieveOfEratosthenes(num);
        sieveOfEratosthenes.sieveOfEratosthenesOptimized(num);
        sieveOfEratosthenes.sieveOfEratosthenesMoreOptimized(num);
    }
}
