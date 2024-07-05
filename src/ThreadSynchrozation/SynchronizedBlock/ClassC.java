package ThreadSynchrozation.SynchronizedBlock;


public class ClassC extends Thread{
    Table t;
    @Override
    public void run() {
        t.printTable("C");
    }

    ClassC(Table t){
        this.t = t;
    }
}