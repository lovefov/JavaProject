package fanxing;

/**
 * 泛型类
 * @param <T> K V E dou ke yi
 */
public class MyStudent<T> {
    private  T javase;

    public MyStudent() {
    }

    public MyStudent(T javase) {
        this.javase = javase;
    }

    public T getJavase() {
        return javase;
    }

    public void setJavase(T javase) {
        this.javase = javase;
    }

}
