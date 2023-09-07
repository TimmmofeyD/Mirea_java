import java.util.Objects;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Author a1 = new Author("", "", '-');
        System.out.println(a1.toString());

        System.out.println("Вы хотите добавить нового пользовотеля?\nВведите Y - да, N - нет");
        String check = in.nextLine();

        if (!Objects.equals(check, "Y")) {
            System.out.println("Ладно, тогда до скорой встречи");
        }else{
            System.out.println("Хорошо, давайте введем данные)");

            System.out.println("Введите ФИО:");
            String name = in.nextLine();
            a1.setName(name);

            System.out.println("Введите почту:");
            String email = in.nextLine();
            a1.setEmail(email);

            System.out.println("Введите гендер (даже если вы вертолет):");
            char gender = in.next().charAt(0);
            a1.setGender(gender);
        }
        System.out.println("Имя: "+a1.getName());
        System.out.println("Почта: "+a1.getEmail());
        System.out.println("Гендер: "+a1.getGender());
    }
}
