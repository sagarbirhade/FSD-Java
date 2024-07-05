package Collections.Vector;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {

        Vector v = new Stack();
        v.add("abc");
        v.add('A');
        v.add(1234);
        v.add("abc");
        v.add(null);
        v.add(123.23);

        System.out.println(v);

        v.remove(3);
        System.out.println(v);

        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        System.out.println(s);
        s.push(30);
        System.out.println(s);
        s.pop();
        System.out.println(s);

        s.add(50);
        System.out.println(s);

        s.remove( 0);
        System.out.println(s);

        s.addFirst(12);
        System.out.println(s);

        s.addLast(886);
        System.out.println(s);
    }
}
