package Methods;

public class Student_Static_Example {
    int roll;
    String name;
    double marks;
    static String college_name = "RCPIT";

    Student_Static_Example(int roll, String name, double marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student Information " +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks+
                "College Name: "+college_name;
    }

    public static void main(String[] args) {
        Student_Static_Example hrushi = new Student_Static_Example(12,"Hrushikesh Deshmukh", 100);
        System.out.println(hrushi.toString());

    }
}
