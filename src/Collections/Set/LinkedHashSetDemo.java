package Collections.Set;

import java.util.*;

public class LinkedHashSetDemo {
    /*
    1. null insertion allowed
    2. duplicates NA
    3. slower that HashSet
    4. it is nonsynchronised
    5. efficient for insertion and deletion operation
    6.  linkedhashset = linkedlist + hashset
     */

    public static void main(String[] args) {

        Set<Integer> lset = new LinkedHashSet<Integer>();
        lset.add(100);
        lset.add(50);
        lset.add(70);
        lset.add(20);
        lset.add(90);
        lset.add(150);
        System.out.println(lset);
        System.out.println(lset.size());


        LinkedHashSet<String> lset1 = new LinkedHashSet<String>();
        lset1.add("maharashtra");
        lset1.add(null);
        lset1.add("abc");
        lset1.add("Shirpur");
        lset1.add("maharasthra");
        lset1.add(null);
        System.out.println(lset1);

        HashSet hs = new HashSet();
        hs.add(null);
        hs.add('A');

        LinkedList l1 = new LinkedList();
        l1.add(9898);
        l1.add(9898);

        ArrayList al1 = new ArrayList();
        al1.add(6767);
        al1.add(6767);


        LinkedHashSet<Object> lset2 = new LinkedHashSet<Object>();
        lset2.add(lset1);
        lset2.add(lset);
        lset2.add(hs);
        lset2.add(l1);
        lset2.add(al1);
        System.out.println(lset2);

        Iterator itr = lset2.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        for(Object i: lset2){
            System.out.print(i);
        }
    }
}
