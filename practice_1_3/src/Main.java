import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");

        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size

        System.out.println("Insert array elements:");

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++)
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры

        System.out.print ("Inserted array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }

        System.out.println();

        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += array[i];
        }

        double average;
        average = (double) sum / array.length;

        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);

        int j = 0;
        int sum_while = 0;

        do{
            sum_while += array[j];
            j++;
        } while(j!=size);

        System.out.println("Sum with do while" + sum_while);

        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);

        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);
        }
        // Здесь находим максимум
        public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1; i < inputArray.length; i++){
            if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
            }
        }

        return maxValue;
    }
    // здесь находим минимум
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

