package ThreadSynchrozation;

public class Thread1 extends Thread{
    Table t;
    @Override
    public void run() {
        t.printTable(Double.parseDouble("A"));
    }

    Thread1(Table t){
        this.t = t;
    }
}
