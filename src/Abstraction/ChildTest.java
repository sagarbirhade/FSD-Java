package Abstraction;

public class ChildTest extends Test {
    public static void main(String[] args) {
        ChildTest ct = new ChildTest();
       ct.display();
        show();
//    Test t1 = new super.Test();
       ct.printDetails();
    }


    @Override
    void printDetails(){
        System.out.println("Abstract Method");
    }

}
