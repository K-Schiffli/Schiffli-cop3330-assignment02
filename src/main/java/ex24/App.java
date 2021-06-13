package ex24;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String firstWord = getWord("first");
        String secondWord = getWord("second");

        AnagramDetector ad = new AnagramDetector();
        boolean isAnagram = ad.detectAnagram(firstWord, secondWord);

        String output = createOutput(isAnagram, firstWord, secondWord);
        printOutput(output);

    }
    public static String getWord(String number)
    {
        System.out.printf( "Please enter the %s word: ", number);
        return in.nextLine();
    }

    public static String createOutput (boolean isAnagram, String firstWord, String secondWord)
    {
        if (isAnagram) {
            return "\"" + firstWord + "\" and \" " + secondWord + "\" are anagrams";
        }
        else return "\"" + firstWord + "\" and \" " + secondWord + "\" are not anagrams";
    }

    public static void printOutput (String output)
    {
        System.out.println(output);
    }
}


