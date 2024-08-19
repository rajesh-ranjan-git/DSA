public class BitwiseOperators {

    void bitwiseAND(int num1, int num2) {
        System.out.println(num1 & num2);
    }

    void bitwiseOR(int num1, int num2) {
        System.out.println(num1 | num2);
    }

    void bitwiseXOR(int num1, int num2) {
        System.out.println(num1 ^ num2);
    }

    void bitwiseLShift(int num1, int num2) {
        System.out.println(num1 << num2);
    }

    void bitwiseRShift(int num1, int num2) {
        System.out.println(num1 >> num2);
    }

    void bitwiseNOT(int num1) {
        System.out.println(~num1);
    }

    public static void main(String[] args) {
        BitwiseOperators bitwiseOperators = new BitwiseOperators();

        int num1 = 33;
        int num2 = 6;

        bitwiseOperators.bitwiseAND(num1, num2);
        bitwiseOperators.bitwiseOR(num1, num2);
        bitwiseOperators.bitwiseXOR(num1, num2);
        bitwiseOperators.bitwiseLShift(num1, num2);
        bitwiseOperators.bitwiseRShift(num1, num2);
        bitwiseOperators.bitwiseNOT(num1);
    }
}