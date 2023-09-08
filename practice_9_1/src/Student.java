public class Student implements Comparable<Student> {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }


    public int compareTo(Student otherStudent) {
        // Сравниваем объекты Student на основе iDNumber
        return Integer.compare(this.getId(), otherStudent.getId());
    }

    public static void main(String[] args) {

    }
}
