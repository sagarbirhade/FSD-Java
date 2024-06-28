package Methods;

public class Static_Method_Example {
    void calVolumeofCube(double side){
        display();
    }
    static void display(){
        System.out.println("Display method");

    }
    public static void main(String[] args) {
        Static_Method_Example s1 = new Static_Method_Example();
        s1.calVolumeofCube(9.6);
        s1.display();
        display();



    }
}
