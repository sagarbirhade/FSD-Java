package Collections.LinkedList;

import com.sun.security.jgss.GSSUtil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    /* 1. Duplicate data are allowed
        2. Null insertion is allowed
        3. Homogeneous as well as heterogeneous data allow to store
        4. LL is non synchronized (non thread safe)
     */

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(50);
        l1.add("Shirpur");
        l1.add('H');
        l1.add(30.3);
        l1.add(false);
        l1.add(50);
        l1.add(null);
        l1.add(1234567890);
        System.out.println(l1);

        // remove element
        l1.remove();
        System.out.println(l1);

        // adding at first position
        l1.addFirst("Rcpit");
        System.out.println(l1);

        // adding at last position
        l1.addLast("Rcpit");
        System.out.println(l1);

        // removing first and last element
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);


       // l1.clear();  // clears all the linked list elements
       // System.out.println(l1);

        System.out.println(l1.clone());
        System.out.println(l1.contains("Shirpur"));
        System.out.println(l1.reversed());

        for (Object o : l1) {
            System.out.println(o);
        }

        Iterator itr = l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



        System.out.println("Peek: "+l1.peek());
        System.out.println(l1);

        System.out.println("poll: "+l1.poll());
        System.out.println(l1);

        ListIterator litr = l1.listIterator();


        System.out.println("------------Forward Iteration--------------");
        while(litr.hasNext()){
            System.out.print(litr.next()+" ");
        }

        System.out.println("\n------------Backward Iteration--------------");
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }

        System.out.println("\n------------Forward Iteration--------------\n");
        while(litr.hasPrevious()){
            System.out.print(litr.previousIndex()+" ");
        }
    }
}

