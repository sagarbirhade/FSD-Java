package Encapsulation;

public class Student_Main {
    public static void main(String[] args) {
        Student sandip  = new Student(105,"sandip",70.3,123456);
        System.out.println(sandip.toString());

        Student s1 = new Student();
        System.out.println(s1.toString());

        Student bhushan = new Student(87,"Bhushan",98.56);
        System.out.println(bhushan.toString());


    }
}
