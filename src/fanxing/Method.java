package fanxing;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public class Method {
    public static <T> void test(T t) {
        System.out.println(t);
    }
    public static void main(String[] args) {

    }
    public static <T extends List> void test(T t) {
        System.out.println(t);
        t.add("aaa");

    }
    public static <T extends Closeable> void test(T... a) {
        for (T temp : a) {
            try {
                if (temp != null) {
                    temp.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
