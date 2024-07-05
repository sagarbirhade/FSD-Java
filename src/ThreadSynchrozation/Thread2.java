package ThreadSynchrozation;

public class Thread2 extends Thread{
    Table t;
    @Override
    public void run() {
        t.printTable(12);
    }
    Thread2(Table t){
        this.t = t;
    }
}
