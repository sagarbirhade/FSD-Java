package Collections.Queue;

import java.util.*;

public class QueueDemo {
    /*
    1. it follows FIFO policy
    2. Elements are accessed or removed through head only
    3. Elements can be added at tail only
    4. null insertion NA
     */

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(50);
        q.add(50);
        q.add(100);
        q.add(5);
        q.add(100);
        q.add(10);
        q.add(null);
        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.add(90));
        System.out.println(q);
        System.out.println("Peek: "+q.peek()); //  peek method shoes Head element
        System.out.println("Poll: "+q.poll()); // remove as well as print
        System.out.println(q);

        System.out.println();
        System.out.println("Priority Queue");
        PriorityQueue pq = new PriorityQueue();
        pq.add(15);
        pq.add(100);
        pq.add(12);
        pq.add(34);
        pq.add(78);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);

        Iterator itr  = pq.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        PriorityQueue q1 = new PriorityQueue();
        q1.add(10);
        q1.add(31);
        q1.add(34);
        q1.add(1);
        System.out.println(q1);
        PriorityQueue q2 = new PriorityQueue();
        q2.add(19);
        q2.add(39);
        q2.add(36);
        q2.add(19);
        System.out.println(q2);
        PriorityQueue q3 = new PriorityQueue();
        q3.addAll(q1);
        q3.addAll(q2);
        System.out.println(q3);

        pq.addAll(q3);
        System.out.println(pq);

    }
}
