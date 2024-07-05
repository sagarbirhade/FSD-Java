package ThreadSynchrozation.SynchronizedBlock;

public class Table {

    void printTable(String n) {

       synchronized(this) {
           //int n;
           for (int i = 0; i <= 10; i++) {
               System.out.print("Student of Class "+n);

               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.getMessage();
               }

           }
           System.out.println();
       }
   }
}
