import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        if (checkAnagram(firstString, secondString))
            System.out.println("The two strings are Anagram");
        else
            System.out.println("The two strings are NOT Anagram");

    }

    public static boolean checkAnagram(String firstString, String secondString) {

        //clean the strings
        firstString = firstString.replaceAll("\\s", "");
        secondString = secondString.replaceAll("\\s", "");

        if (firstString.length() != secondString.length()) {
            return false;
        } else {
            char[] firstArr = firstString.toLowerCase().toCharArray();
            char[] secondArr = secondString.toLowerCase().toCharArray();

            Arrays.sort(firstArr);
            Arrays.sort(secondArr);

            return Arrays.equals(firstArr, secondArr);

        }

    }
}