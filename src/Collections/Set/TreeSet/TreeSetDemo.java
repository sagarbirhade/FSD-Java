package Collections.Set.TreeSet;

import com.sun.source.tree.Tree;

import java.util.*;

public class TreeSetDemo {
    /*
    1. duplicates are not allowed
    2. access and retrival is fast
    3. null insertion NA
    4. TreeSet automatically sorted data in ascending order
    5. Internally it implements TreeMap
    6. Trees are non synchronized it means non thread safe
    7. Only homogeneous data allowed  ---- this is main point
    8. TreeSet is faster than ArrayList and LinkedList in searching and retrival operation
    9. TreeSet is slower than ArrayList and LinkedList in insertion and deletion operation
     */

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("India");
        ts.add("India");
        ts.add("South Africa");
        ts.add("Germany");
        ts.add("Australia");
        System.out.println(ts);
        System.out.println(ts.ceiling("Germany"));
        System.out.println(ts.floor("India"));
        System.out.println(ts);

        // TreeSet by using Set
        SortedSet<Character> ss  = new TreeSet<Character>();
        ss.add('Z');
        ss.add('B');
        ss.add('H');
        ss.add('G');
        ss.add('L');
        System.out.println(ss);
        System.out.println(ss.reversed());

        for(Object o: ss){
            System.out.print(o);
        }

        System.out.println();

        // integer Set with TreeSet
        Set<Integer> s1 = new TreeSet<Integer>();
        s1.add(45);
        s1.add(12);
        s1.add(90);
        s1.add(34);
        s1.add(56);
        System.out.println(s1);

        TreeSet ts2 = new TreeSet();
        ts2.add(10);
        ts2.add(90);
        ts2.add(50);
        ts2.add(55);
        ts2.add(150);
        ts2.add(5);
        ts2.add(200);
        ts2.add(123);
        System.out.println();
        System.out.println(ts2);
        System.out.println("Ceiling: "+ts2.ceiling(56));
        System.out.println("Floor: "+ts2.floor(9));
        System.out.println("Lower: "+ts2.lower(50));
        System.out.println("Higher: "+ts2.higher(50));
        System.out.println("First Element: "+ts2.first());
        System.out.println("Last Element: "+ts2.last());
        System.out.println("HeadSet true: "+ts2.headSet(55, false));
        System.out.println("HeadSet false: "+ts2.headSet(55, true));
        System.out.println("TailSet: "+ts2.tailSet(90, true));
        System.out.println("Sunset: "+ts2.subSet(90, 160));

        System.out.println();
        // Array List Sorting using TreeSet
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(89);
        al.add(34);
        al.add(90);
        System.out.println(al);
        TreeSet ts3 = new TreeSet(al);
        System.out.println(ts3);


        System.out.println();
        int arr[] = {34,12,67,34};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        TreeSet ts4 = new TreeSet();
        for(int i = 0; i < arr.length; i++){
            ts4.add(arr[i]);
        }
        System.out.println(ts4);

        Iterator itr = ts4.descendingIterator();
        while(itr.hasNext()){
            System.out.printf(itr.next()+" ");
        }

        // Syncronizing the TreeSet
        Set synTreeSet = Collections.synchronizedSet(ts4);
        System.out.println(synTreeSet);

    }
}
