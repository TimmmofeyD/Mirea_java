
public class Main {
    public static void recursion(int n, int k) {
        for (int i = 1; (i <= k) && (n > 0); i++) {
            System.out.println(k);
            n--;
        }
        if (n > 0) {
            recursion(n, ++k);
        }

    }

    public static void main(String[] args) {
        recursion(10, 1);
    }
}
