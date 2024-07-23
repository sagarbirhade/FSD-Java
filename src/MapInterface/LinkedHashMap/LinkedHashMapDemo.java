package MapInterface.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        /*
        1. Linedhashmap = linked + hashmap
        2. it implements hashtable
        3. it contains only unique values
        4. linked hashmap is non syncronized
        5. it allows only one null key, but values can have multiple null
        6. inital capacity is 16 and load factor is 0.75
        7. it maintains insertion order
        8. acquire more memory than HashMap
        9. performace is slower than HashMap

         */

        Map<Integer, String> m = new LinkedHashMap<Integer, String>();
        m.put(101, "Sagar");
        m.put(106, "Bhushan Bhau");
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.remove(101));

        System.out.println();
        LinkedHashMap<Integer , String> lh = new LinkedHashMap<Integer , String>(m);
        lh.put(101, null);
        lh.put(102, "Aakash");
        lh.put(103, "Sagar");
        lh.put(104, "102");
        lh.put(null, null);
        lh.put(null, "Hrushi");
        lh.put(null, "Hrushi");
        lh.put(103, "Sagar");
        lh.put(103, "hahah");
        System.out.println(lh);
        System.out.println(lh.size());
        for(Map.Entry<Integer, String> ml: lh.entrySet()){
            System.out.println(ml.getKey()+" "+ml.getValue());
        }
        System.out.println();



    }
}
