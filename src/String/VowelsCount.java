package String;

import java.util.Scanner;

class VowelsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.nextLine();
        int vowelCount = countVowels(text);
        int alphabetCount = countAlphabets(text);
        int spaceCount = countSpaces(text);

        System.out.println("The number of vowels in '" + text + "' is: " + vowelCount);
        System.out.println("The number of alphabets in '" + text + "' is: " + alphabetCount);
        System.out.println("The number of spaces in '" + text + "' is: " + spaceCount);
    }

    public static int countVowels(String text) {
        text = text.toLowerCase(); // Convert to lowercase for case-insensitive counting
        int vowelCount = 0;
        String vowels = "aeiou";
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int countAlphabets(String text) {
        int alphabetCount = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetCount++;
            }
        }
        return alphabetCount;
    }

    public static int countSpaces(String text) {
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}
