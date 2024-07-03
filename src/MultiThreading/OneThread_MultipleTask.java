package MultiThreading;

public class OneThread_MultipleTask extends FirstThread implements  Runnable {

    int a = 10;
    int b = 20;
 
    @Override
    public void run() {
        addition();
        substraction();
        multiplication();
    }

    void substraction(){
        System.out.println("Substraction: "+(a - b));
    }

    void addition(){
        System.out.println("Addition: "+(a + b));
    }

    void multiplication(){
        System.out.println("Multiplication: "+(a * b));
    }

    public static void main(String[] args) {
        System.out.println("main() method running");
        OneThread_MultipleTask o1 = new OneThread_MultipleTask();
        Thread t1 = new Thread(o1);
        t1.start();
    }
}
