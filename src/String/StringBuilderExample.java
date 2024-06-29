package String;

public class StringBuilderExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for(int i = 0; i < 10000000 ;i++){
            sb.append("Programming with bhushan is easy");
        }
        System.out.println("StringBuffer");
        System.out.println(System.currentTimeMillis() - startTime+" ms");

       long startTime1 = System.currentTimeMillis();
        StringBuilder si = new StringBuilder("Java");
        for(int i = 0; i < 10000000 ;i++){
            si.append("Programming with bhushan is easy");
        }
        System.out.println("StringBuilder");
        System.out.println(System.currentTimeMillis() - startTime1+" ms");


        System.out.println();
        long startTime2 = System.currentTimeMillis();
        String name = "Java";
        for(int i = 0; i < 10000000 ;i++){
            name.concat("Programming with bhushan is easy");
        }
        System.out.println("String");
        System.out.println(System.currentTimeMillis() - startTime2+" ms");



    }
}
