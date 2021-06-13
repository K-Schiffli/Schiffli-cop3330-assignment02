package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WinnerPickerTest {

    @Test
    void pickWinner_should_always_return_a_real_person() {

        WinnerPicker wp = new WinnerPicker();
        List<String> namesList = new ArrayList<> ();
        namesList.add("Homer");
        namesList.add("Bart");
        namesList.add("Maggie");
        namesList.add("Lisa");
        namesList.add("Moe");

        String winner;
        boolean errorFlag = false;
        for (int i = 0; i < 100; i++)
        {
            winner = wp.pickWinner(namesList);
            if (!namesList.contains(winner)) errorFlag = true;
            assertFalse(errorFlag);
        }

    }
}