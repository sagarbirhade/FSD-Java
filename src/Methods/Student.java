package Methods;

public class Student {
    public static void main(String[] args) {
        Student bhushan = new Student();
        bhushan.register();
        bhushan.learning();


    }
    void register(){
        System.out.println("Student registered");
    }
    void learning(){
        System.out.println("Student is learning");
    }
}
