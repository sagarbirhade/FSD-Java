package Encapsulation;

public class Student {
    private int roll;
    private String name;
    private double marks;
    private long contact;

    public Student(){

    }

    public Student(int roll, String name, double marks, long contact) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.contact = contact;
    }
    public Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;

    }




    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", contact=" + contact +
                '}';
    }
}
