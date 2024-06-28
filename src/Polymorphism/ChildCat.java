package Polymorphism;

public class ChildCat extends Cat{
    ChildCat(){
        super();
        System.out.println("ChildCat class constructor");
    }

    public static void main(String[] args) {
        ChildCat c1 = new ChildCat();

    }
}
