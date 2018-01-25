package fanxing;


public class MyStudentApp {
    public static void main(String[] args) {
        MyStudent<Integer> student=new MyStudent<>();
        student.setJavase(80);
        Integer score = student.getJavase();
        System.out.println(score);
    }
}
