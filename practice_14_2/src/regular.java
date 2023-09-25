import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regular {
    public boolean regax(String input) {
        Pattern regular = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = regular.matcher(input);
        return m.matches();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        regular reg = new regular();
        System.out.println("Введите строку: ");
        String s1 = in.nextLine();
        System.out.println(reg.regax(s1));
    }
}