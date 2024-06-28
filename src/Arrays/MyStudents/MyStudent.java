package Arrays.MyStudents;
import Arrays.StudentDetails.Student;

import java.util.Scanner;
public class MyStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();

        Student1 std[] = new Student1[]{
                new Student1(12,"Bhushan",100,"Computer"),
                new Student1(30,"Hrushikesh",90,"Computer"),
                new Student1(34,"Mayur",90,"Computer"),
                new Student1(90,"Sagar",90,"Computer")

        };

        for(int i = 0; i < std.length; i++){
            System.out.println(std[i].roll+" "+std[i].name+" "+std[i].marks);
        }


    }
}
