public class Prime {
    
    boolean primeNum(int num) {

        if (num == 2)
            return true;

        for (int i = 3; i < num; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    boolean primeNumOptimized(int num) {

        if (num == 2)
            return true;

        for (int i = 3; i * i < num; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    boolean primeNumMoreOptimized(int num) {

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

    public static void main(String[] args) {
        Prime prime = new Prime();

        int num = 10009;
        
        if (num == 0 || num == 1)
            System.out.println(num + " is a neither a Prime nor a Composite number.");

        if (prime.primeNum(num) == true)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is a Composite number.");

        if (prime.primeNumOptimized(num) == true)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is a Composite number.");

        if (prime.primeNumMoreOptimized(num) == true)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is a Composite number.");
    }
}
