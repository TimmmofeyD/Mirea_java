import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = 2;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("The program is waiting for the input of an integer value");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (Exception e1) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        Exception3 q = new Exception3();
        //  q.exceptionDemo();
        q.exceptionDemo1();
    }
}