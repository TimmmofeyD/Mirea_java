import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter you string: ");
        String string = in.nextLine();

        System.out.println("Enter first index: ");
        int index_1 = in.nextInt();

        System.out.println("Enter second index: ");
        int index_2 = in.nextInt();

        System.out.println("Final string: ");
        System.out.println(string.substring(index_1, index_2));

    }
}