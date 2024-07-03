package MultiThreading;

public class MyThread implements Runnable{
    String task;
    MyThread(String task){
        this.task = task;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.print(task+" "+(i+1));
            System.out.println();
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.getMessage();
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread("if you passed 3rd year then can take admission in 4th year");
        Thread t = new Thread(mt);

//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.getMessage();
//            e.printStackTrace();
//
//        }

        MyThread mt2 = new MyThread("You can take admission");
        Thread t2 = new Thread(mt2);

        MyThread mt3 = new MyThread("Hello how are you");
        Thread t3 = new Thread(mt3);

        t.start();
        t2.start();
        t3.start();
        int count = Thread.activeCount();
        System.out.println("\nActive threads: "+count);
    }
}
