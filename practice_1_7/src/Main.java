import java.math.BigInteger;
import java.util.Scanner;
class factoriall{
    public static BigInteger factorialmath(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("fact: " + factoriall.factorialmath(number));
    }
}
