package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitterTest {

    StringSplitter ss = new StringSplitter();

    @Test
    void removeOdds_should_remove_all_the_odds() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("2");
        expected.add("4");
        expected.add("6");
        expected.add("8");

        assertEquals(expected, ss.filterEvenNumbers("1 2 3 4 5 6 7 8 9"));
    }

    @Test
    void removeOdds_should_return_correctly_for_all_evens() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("2");
        expected.add("4");
        expected.add("6");
        expected.add("8");
        expected.add("10");

        assertEquals(expected, ss.filterEvenNumbers("2 4 6 8 10"));
    }

    @Test
    void removeOdds_should_return_correctly_for_all_odds() {
        ArrayList<String> expected = new ArrayList<String>();

        assertEquals(expected, ss.filterEvenNumbers("1 3 5 7 9"));
    }
}