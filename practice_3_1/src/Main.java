import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        while (size <= 0) {
            System.out.println("Размер массива не может быть <= 0.Попробуйте снова: ");
            size = in.nextInt();
        }
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextDouble();
        }
        System.out.println("Массив созданный классом Random: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив созданный классом Random: " + Arrays.toString(arr));

        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        System.out.println("Массив созданный методом random: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив созданный методом random: " + Arrays.toString(arr));

    }
}