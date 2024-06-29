package String;

public class CountAndRemoveSpaces {

    public static void main(String[] args) {
        String str = "This is a string with spaces";

        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaceCount++;
            }
        }

        StringBuilder noSpaceStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                noSpaceStr.append(c);
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("Number of white spaces: " + spaceCount);
        System.out.println("String without spaces: " + noSpaceStr);
    }
}

