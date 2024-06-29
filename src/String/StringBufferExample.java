package String;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Meghraj");
        System.out.println(sb);



        sb.append("Narkhede");
        System.out.println(sb);

        sb.append("BCA");
        System.out.println(sb.capacity() );
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        sb.setCharAt(1,'A');
        System.out.println(sb);


        StringBuffer sb1 = new StringBuffer(100);
        System.out.println("before Insertion: "+sb1.capacity());
        sb1.append("qsdasdasdsafsafafadf");
        System.out.println("after Insertion : "+sb1.capacity());

        StringBuffer sb2 = new StringBuffer("ABCD");
        System.out.println(sb2.capacity());
        sb2.append("12345678912345678");
        System.out.println(sb2.capacity());

        System.out.println("\n\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("         Tushar        Patil         ");
        sb3.trimToSize();
        System.out.println(sb3);
        System.out.println(sb3.length());

        sb3.ensureCapacity(20);
        System.out.println();



        // reversing using String Buffer
        String b = "abcd";
        StringBuffer sp = new StringBuffer(b);
        sp.reverse();
        System.out.println(sp);



    }
}
