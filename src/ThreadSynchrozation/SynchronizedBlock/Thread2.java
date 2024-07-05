package ThreadSynchrozation.SynchronizedBlock;

public class Thread2 extends Thread{
    Table t;
    @Override
    public void run() {
        t.printTable("B");
    }
    Thread2(Table t){
        this.t = t;
    }
}
