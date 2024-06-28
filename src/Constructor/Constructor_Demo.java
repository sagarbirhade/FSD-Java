package Constructor;

public class Constructor_Demo {
    Constructor_Demo(){
        System.out.println("User defined constructor");
    }
    Constructor_Demo(int a){
        System.out.println("parameterixed comnstructor"+a);
    }
    Constructor_Demo(int a, int b){
        System.out.println(a+b);
    }
    Constructor_Demo(int d, double b){
        System.out.println(d+b);
    }
    public static void main(String[] args) {

    }
}
