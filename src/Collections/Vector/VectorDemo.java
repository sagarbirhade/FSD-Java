package Collections.Vector;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

    /*
    1. preserve insertion order
    2. duplicates allowed
    3. null insertion allowed
    4. homogeneous as well as heterogeneous data
    4. Vector class also implements serilizable, clinable and random access interface
    5. ost methods are synchronized
     */


    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("abc");
        v.add(124);
        v.add('H');
        v.add(true);
        v.add(null);
        System.out.println(v);

        Vector<Integer> v1 = new Vector<Integer>(20);
        System.out.println(v1.capacity());
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        v1.add(60);
        v1.add(70);
        v1.add(80);
        v1.add(90);
        v1.add(100);
        System.out.println(v1);
        System.out.println(v1.capacity());
        v1.add(200);


//        Vector<String> v2 = new Vector<String>(20);
//        System.out.println(v2.capacity());

        Vector<Integer> v5 = new Vector<>(15,5);
        System.out.println("capactiy before: "+v5.capacity());
        v5.add(10);
        v5.add(20);
        v5.add(30);
        v5.add(40);
        v5.add(50);
        v5.add(60);
        v5.add(70);
        v5.add(80);
        v5.add(90);
        v5.add(100);
        System.out.println("Capacity After: "+v5.capacity());

    }
}
