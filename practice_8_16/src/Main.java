public class Main {
    public static void recursion(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Max value: " + max);
            System.out.println("Count of max value: " + count);
        } else if (n > max) {
            recursion(n, 1);
        } else if (n == max) {
            recursion(max, count + 1);
        }else{
            recursion(max, count);
        }
    }

    public static void main(String[] args) {
        recursion(0, 1);

    }
}