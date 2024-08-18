public class CelciusToFahrenheit {

    double celciusToFahrenheit(int num) {
        return (double) num * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        CelciusToFahrenheit celciusToFahrenheit = new CelciusToFahrenheit();

        int num = 32;

        System.out.println(celciusToFahrenheit.celciusToFahrenheit(num));
    }
}