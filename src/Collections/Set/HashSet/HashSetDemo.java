package Collections.Set.HashSet;

import java.util.*;

public class HashSetDemo {

    /*
    1. implements hashtable
    2. insertion order not preserved
    3. heterogeneous data allowed
    4. null insertion is allowed
    5. implements serilizable, clonable, random access onterface
    6. HashSet is not synchronized
     */

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(null);
        hs.add("abc");
        hs.add(null);
        hs.add("abc");
        hs.add(10);
        hs.add(50.60);
        hs.add('A');
        System.out.println(hs);

        System.out.println(hs.size());

        Set<Integer> hs1 = new HashSet<Integer>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(20);
        hs1.add(50);
        hs1.add(10);
        System.out.println(hs1);

        // Synchronizing the HashSet
        Set syncHashSet = Collections.synchronizedSet(hs1);
        System.out.println(syncHashSet);

        hs1.remove(50);
        System.out.println(hs1);

        boolean ans = hs1.equals(hs);
        System.out.println(ans);


        for(Object i: hs1){
            System.out.print(i+" ");
        }
        System.out.println();
        Iterator itr = hs1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
