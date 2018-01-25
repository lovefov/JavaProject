package fanxing;

public class StuApp {
    public static void main(String[] args) {
        Student stu = new Student(80);
        Object javase = stu.getJavase();
        if (javase instanceof Integer){
            Integer javaseScore = (Integer) javase;
        }
        stu = new Student("good!");
        javase = stu.getJavase();
        if (javase instanceof String) {
            String javaseScore = (String) javase;
        }
    }

}
