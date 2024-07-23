package MapInterface.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    /*
    1. TreeMap contains unique elements
    2. non synchronized  --> non thread safe
    3. only one null values but multiple null values
     */

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(24, "Sandip");
        tm.put(109, null);
        tm.put(105, "Shubham");
        tm.put(24,"Hrushi");
        System.out.println(tm);
    }
}
