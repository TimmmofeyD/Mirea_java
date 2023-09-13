public class Main {
    public static void main(String[] args) {
        //1
        Double a = Double.valueOf(2.5);
        Double b = Double.valueOf(3.2);
        Double c = Double.valueOf(4.8);
        //2
        String s = "9.9";
        double d = Double.parseDouble(s);

        //3
        byte e = a.byteValue();
        short f = a.shortValue();
        int g = a.intValue();
        long h = a.longValue();
        float i = a.floatValue();
        double j = a.doubleValue();
        boolean k;
        if (a == 0) k = false;
        else k = true;
        char l = (char) d;

        //4
        System.out.println(a);

        //5
        double n = 5.6;
        String m = Double.toString(3.14);
        n = Double.parseDouble(m);
    }
}