package ThreadSynchrozation;

public class Table {

    void printTable(double n) {

       synchronized(this) {
           //int n;
           for (int i = 0; i <= 10; i++) {
               System.out.print(" " + n * i);

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
