package ThreadSynchrozation.SynchronizedBlock;

public class Thread1 extends Thread{
    Table t;
    @Override
    public void run() {
        t.printTable("A");
    }

    Thread1(Table t){
        this.t = t;
    }
}
