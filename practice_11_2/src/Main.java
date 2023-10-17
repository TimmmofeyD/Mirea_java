import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String currentTime = new SimpleDateFormat("HH:mm").format(new Date());
        String timeToCompare = "13:41";
        boolean x = currentTime.equals(timeToCompare);
        System.out.println(x);
    }
}