package Collections.ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(50);
        a1.add("Sagar");
        a1.add('a');
        a1.add(true);
        a1.add(null);
        a1.add(true);
        a1.add(null);

        System.out.println(a1);


        List a12 = new ArrayList();
        a12.add(50);
        a12.add("Sagar");
        a12.add('a');
        a12.add(true);
        a12.add(null);
        System.out.println(a12);



        ArrayList a3 = new ArrayList();
        a3.add(a1);
        a3.add(a12);
        System.out.println(a3);


        Collection<Object> c = new ArrayList<Object>();
        c.add(a1);
        c.add(a12);
        System.out.println(c);

        Collection<Object> list = Collections.synchronizedCollection(c);
        System.out.println("Syncronized list: "+list);

        // Constructors of ArrayList
        ArrayList a = new ArrayList();
        ArrayList a5 = new ArrayList(50);
        ArrayList a2 = new ArrayList(a);


        ArrayList<Integer> g1 = new ArrayList<>();


//        Integer<Integer> itr = a12.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

    }


}
