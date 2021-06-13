package ex24;

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetector {

    public boolean detectAnagram(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase(Locale.ROOT);
        secondWord = secondWord.toLowerCase(Locale.ROOT);

        char[] firstWordArr = firstWord.toCharArray();
        char[] secondWordArr = secondWord.toCharArray();
        Arrays.sort(firstWordArr);
        Arrays.sort(secondWordArr);

        if(firstWordArr.length != secondWordArr.length)
        {
            return false;
        }
        return Arrays.equals(firstWordArr, secondWordArr);
    }
}
