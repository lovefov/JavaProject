package fanxing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     *
     * @param args 呵呵呵呵
     */

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> list= new ArrayList<>();
        list.add("lalala");
        list.add("hehehe)");
        list.add("hehe");
        list.add("heheihihih");
        list.add("wakakakaka");
        list.add("jiajaijia");
        list.add("hahahahahahah");
        list.add("jhehehehahahah");
        String str=list.get(0);
        System.out.println(str);
        int[] a=new int[100];
        a[0]=1;
        a[1]=1;
        a[2]=1;
        a[3]=1;
        System.out.println(a.length);
        for (int x:a
             ) {
            System.out.println(x);
        }
        /*
          foreach 你给迭代器一个中元素起个通用的名字然后对他做相应的操作  map比这个强一百倍..
         */

    }
}
