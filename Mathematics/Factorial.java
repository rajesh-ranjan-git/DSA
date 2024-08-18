public class Factorial {

    int factbyRrecursion = 1;
    
    int getFactorial(int num) {
        int fact = 1;

        if (num == 0)
            return 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    int getFactorialByRecursion(int num) {
        int temp = num;
        factbyRrecursion *= temp;

        if (num - 1 != 0) {
            getFactorialByRecursion(num - 1);
        }

        return factbyRrecursion;
    }
    
    int getFactorialByRecursion2(int num) {
        if (num == 0)
            return 1;

        return num * getFactorialByRecursion2(num - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int inputNum = 42;
        System.out.println("Factorial of the given input : " + inputNum + " is : " + factorial.getFactorial(inputNum));
        System.out.println("Factorial of the given input : " + inputNum + " by recursion is : " + factorial.getFactorialByRecursion(inputNum));
        System.out.println("Another method for Factorial of the given input : " + inputNum + " by recursion is : "
                + factorial.getFactorialByRecursion2(inputNum));
    }
}
