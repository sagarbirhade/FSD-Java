package Methods;

public class Static_Block {
    static{
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }


    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static{
        System.out.println("Static block 3");
    }

}
