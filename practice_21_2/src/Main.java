public class Main {

    public static <E> void sid(String s, E[] arr) {

        E[] a = arr;
        pr21_2_AnyTape<E> sid = new pr21_2_AnyTape<E>();
        sid.setArr(a);


    }


    public static void main(String[] args) {

        String[] s = {"Hello", "World", "!"};


        Integer[] intr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};


        Double[] ad = {1.2, 1.5, 6.7};

        intr[0] = 5;

        pr21_2_AnyTape<String> s1 = new pr21_2_AnyTape<String>();
        pr21_2_AnyTape<Integer> s2 = new pr21_2_AnyTape<Integer>();
        pr21_2_AnyTape<Double> s3 = new pr21_2_AnyTape<Double>();

        s1.setArr(s);
        s1.printer();
        s2.setArr(intr);
        s2.printer();
        s3.setArr(ad);
        s3.printer();


    }

}