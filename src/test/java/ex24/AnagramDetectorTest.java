/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    public void Anagrams_Should_Return_True()
    {
        AnagramDetector ad = new AnagramDetector();
        assertTrue( ad.detectAnagram("note", "tone") );
    }

    @Test
    public void Other_Anagrams_Should_Return_True()
    {
        AnagramDetector ad = new AnagramDetector();
        assertTrue( ad.detectAnagram("fido", "difo") );
    }

    @Test
    public void Non_Anagrams_Should_Return_False()
    {
        AnagramDetector ad = new AnagramDetector();
        assertFalse( ad.detectAnagram("mom", "dad") );
    }

    @Test
    public void Different_Case_Anagrams_Should_Return_True()
    {
        AnagramDetector ad = new AnagramDetector();
        assertTrue( ad.detectAnagram("TACO", "coat") );
    }
}