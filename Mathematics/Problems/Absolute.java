public class Absolute {

    int absolute(int num) {
        if (num < 0)
            return -(num);
        else
            return num;
    }
    
    public static void main(String[] args) {
        Absolute absolute = new Absolute();

        int num = -32;

        System.out.println(absolute.absolute(num));
    }
}
