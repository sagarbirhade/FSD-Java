package String;

public class String_Examples {
    public static void main(String[] args) {
        String s = "india";
        String s1 = "Maharashtra";
        System.out.println(s.length());
        System.out.println(s.concat(s1));

        String s2 = new String("Shirpur");
        System.out.println(s2);
        s2 = "Pune";

        System.out.println(s2);
        System.out.println(s2.charAt(2));
        System.out.println(s2);
        System.out.println(s2.contains("P"));
        System.out.println(s2.contains("E"));
        System.out.println(s2.toUpperCase());
    }
}
