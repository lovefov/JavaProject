package fanxing3;

import java.util.ArrayList;
import java.util.List;

/**
 * ? -->通配符表示类型不确定 ,用于声明变量|形参上
 */
public class WildcardsTest {
    public static void main(String[] args) {
        List<?> list=new ArrayList<Integer>();
    }
}
