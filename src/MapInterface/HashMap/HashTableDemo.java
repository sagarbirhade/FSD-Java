package MapInterface.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(101, "Hrushi");
        m.put(102, "Sagar");
        m.put(99, "Bhushan");
        m.put(909, "Mayur");
        m.put(76, "Sandip");
        m.put(25, null);
        m.put(null, "Riddesh");
        System.out.println(m);

        m.remove(76, "Sandip");
        System.out.println(m);

        m.replace(99, "Sagar");
        System.out.println(m);

        m.replace(101, "Hrushi", "Chetan");
        System.out.println(m);

        Iterator itr = m.values().iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        for(Map.Entry<Integer, String> mp: m.entrySet()){
            System.out.print(mp.getKey()+" "+mp.getValue());
        }
    }
}
