package MultiThreading;

public class MultiThreads extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiThreads m1 = new MultiThreads();
        Thread.currentThread().setName("Umesh");
        System.out.println(10 / 0);
       // m1.setName("kaju");
        m1.run();

        MultiThreads m2 = new MultiThreads();
        m2.setName("raju");
        m2.run();

        MultiThreads m3 = new MultiThreads();
        m3.setName("hrushu");
        m3.run();
    }
}
