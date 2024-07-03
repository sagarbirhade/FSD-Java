package MultiThreading;

public class MyNewThread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        MyNewThread m1 = new MyNewThread();
        Thread t1 = new Thread(m1, "MyThread");
        t1.setPriority(5);



        System.out.println("Priority: "+t1.getPriority());
        System.out.println("Thread Name: "+t1.getName());
        t1.start();

    }
}
