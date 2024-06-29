package String;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a test string";
        ImmutableString immutableString = new ImmutableString(myString);


        String value = immutableString.getValue();
        System.out.println(value);

        ImmutableString newString = immutableString.concat(" - appended text");
        System.out.println(immutableString.getValue()); // Output: This is a test string (original remains unchanged)
        System.out.println(newString.getValue());
    }
}
