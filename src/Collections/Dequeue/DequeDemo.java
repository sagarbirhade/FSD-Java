package Collections.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
    /*
    1. it implements FIFO/ FILO policy
    2. null insertion NA
    3. elements can retrive, and , access from both ends
    4. homogeneous as well as heterogeneous insertion is possible
     */

    public static void main(String[] args) {
        Deque dp = new ArrayDeque();
        dp.add(50);
        dp.add("abc");
        dp.add('A');
        dp.add(50);
        System.out.println(dp);

        System.out.println();
        System.out.println(dp.offer(100));
        System.out.println(dp);
        dp.addFirst("Shirpur");
        System.out.println(dp);
        dp.addLast("Shirpur");
        System.out.println(dp);

        // Dynamic Deque by inserting one Deque vales to another Deque
        System.out.println();
        ArrayDeque<Integer> ai = new ArrayDeque<Integer>();
        ai.add(12);
        ai.add(34);
        ai.add(1);
        ai.add(900);


        ArrayDeque<Object> ao = new ArrayDeque<Object>();
        ao.addAll(dp);
        ao.add(ai);
        System.out.println(ao);

        Iterator itr = ao.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        for(Object e: ao){
            System.out.print(e+" ");
        }


        System.out.println();
        System.out.println(ai);
        System.out.println("Peek: "+ai.peek());
        System.out.println("Pop: "+ai.poll());


    }
}
