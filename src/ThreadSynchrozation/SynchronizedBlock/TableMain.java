package ThreadSynchrozation.SynchronizedBlock;

public class TableMain {
    public static void main(String[] args) {
        Table t = new Table();

        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        ClassC c = new ClassC(t);

        t2.start();
        c.start();
        t1.start();


    }
}
