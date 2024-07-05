package Collections.Vector;

import java.util.*;

public class VectorDemo2 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>(5);
        l1.add(12);
        l1.add(13);
        l1.add(1);
        l1.add(45);
        l1.add(21);

        List<String> l2 = new LinkedList<String>();
        l2.add("Sagar");
        l2.add("Bhushan");
        l2.add("Hrushikesh");
        l2.add("Mayur");
        l2.add("Sandip");

        System.out.println(l1);
        System.out.println(l2);



        Vector<Object> o1 = new Vector<Object>(l1);
        System.out.println(o1);
        o1.add(12);
        o1.remove(0);
        o1.addAll(l2);
        o1.addFirst(12);
        o1.addLast("Sagar");
        o1.removeFirst();
        System.out.println(o1.reversed());


        Iterator itr = o1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }


        System.out.println();
        System.out.println();
        for(Object i: o1){
            System.out.print(i+" ");
        }


    }
}
