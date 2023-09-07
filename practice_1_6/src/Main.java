// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = 10; // number of values we want in a series
        double result = 0.0;
        System.out.println("Гармонический ряд: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }
    }
}
