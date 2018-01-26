package fanxing2;

/**
 * 泛型接口与泛型类同理
 */

public interface Comparator<T> {
      void test(T t);


}
class InterC0<A> implements  Comparator{
    @Override
    public void test(Object o) {

    }

}
class InterC1<T,A,B,C> implements Comparator<T>{
    A weight;
    B height;
    C age;
    @Override
    public void test(T t) {

    }
}
class InterC2<A> implements Comparator<String>{
    @Override
    public void test(String s) {

    }
    A name;
}
class InterC3<T,A> implements Comparator<T>{
    @Override
    public void test(T t) {

    }
    A gender;
}
