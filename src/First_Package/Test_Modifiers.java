package First_Package;

public class Test_Modifiers {
    public int c = 10;
    protected  double d = 20;
    private int e  = 50;
    int f = 80;

    public static void main(String[] args) {
        Test_Modifiers t1 = new Test_Modifiers();
        System.out.println(t1.c);
        System.out.println(t1.d);
        System.out.println(t1.e);
        System.out.println(t1.f);
    }

    protected void display(){
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
