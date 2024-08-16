public class Palindrome {

    int getReversedNum(int num) {
        int reversedNum = 0;

        if (num == 0 || num / 10 == 0)
            return num;

        while (num != 0) {
            if (reversedNum != 0) {
                reversedNum = (reversedNum * 10) + num % 10;
            } else {
                reversedNum += num % 10;
            }
            num /= 10;
        }

        return reversedNum;
    }
    
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int inputNum = 78987;
        int reversedNum = palindrome.getReversedNum(inputNum);

        if (reversedNum == inputNum) {
            System.out.println("The provided input number : " + inputNum + " is Palindrome.");
        } else {
            System.out.println("The provided input number : " + inputNum + " is not Palindrome.");
        }
    }
}
