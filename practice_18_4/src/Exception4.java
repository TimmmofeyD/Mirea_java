import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = 2;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("The program is waiting for the input of an integer value");
        } finally {
            System.out.println("This piece of the program will be output anyway");
        }
    }

    public static void main(String[] args) {
        Exception4 q = new Exception4();
        q.exceptionDemo();
    }
}