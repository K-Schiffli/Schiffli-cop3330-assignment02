package ex33;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void Magic8Ball_should_always_return_a_valid_answer() {
        for (int i = 0; i < 100; i++) {

            Magic8Ball m8b = new Magic8Ball();
            List<String> answerList= new ArrayList<>();

            answerList.add("Yes");
            answerList.add("No");
            answerList.add("Maybe");
            answerList.add("Ask again later");


            String reply = m8b.askQuestion();

            boolean foundFlag = false;
            for (int j = 0; j < answerList.size(); j++)
            {
                if (reply.equals(answerList.get(j))) {
                    foundFlag = true;
                    break;
                }
            }
            assertTrue(foundFlag);
        }
    }
}