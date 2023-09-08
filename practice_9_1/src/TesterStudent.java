public class TesterStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student(4, "S_1"),
                new Student(3, "S_2"),
                new Student(1, "S_3"),
                new Student(2, "S_4")
        };
        System.out.println(printID(students));

        selectionSort(students);

        System.out.println(printID(students));
    }

    private static String printID(Student[] array) {
        System.out.println("ID of Students");
        StringBuilder s = new StringBuilder();
        for (Student student : array) {
            s.append(student.getId()).append(" ");
        }
        return s.toString();
    }

    public static void selectionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
