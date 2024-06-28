package Codes;

public class Area {
    public double circle(double r){
        return 3.14 * r * r;
    }
    public double square(double side){
        return side * side;
    }
    public double rectangle(double length, double breadth){
        return length * breadth;

    }
    public double triangle(double base, double height){
        return 0.5 * base * height;

    }

    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.println("Area of Triangle: "+a1.triangle(12.4,234.5));
        System.out.println("Area of Square: "+a1.square(12.5));
        System.out.println("Area of Circle: "+a1.circle(2));

    }
}
