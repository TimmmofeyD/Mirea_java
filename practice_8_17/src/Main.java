public class Main {
    public static void recursion(int max) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Max value: " + max);
        } else if (n > max) {
            recursion(n);
        } else {
            recursion(max);
        }
    }

    public static void main(String[] args) {
        recursion(-1030302032);

    }
}