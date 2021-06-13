package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generatePassword_should_generate_valid_passwords_every_time() {
        PasswordGenerator pg = new PasswordGenerator();

        int letterCount = 0;
        int numberCount = 0;
        int sCharCount = 0;
        boolean ratioFlag = false;
        boolean numbersFlag = false;
        boolean sCharFlag = false;
        boolean lengthFlag = false;

        for (int i = 0; i < 1000; i++)
        {
            String password = pg.generatePassword(8,2,2);
            char[] passwordArr = password.toCharArray();
            for (char c : passwordArr) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                    letterCount++;
                if ((c >= '0' && c <= '9'))
                    numberCount ++;
                if ((c >= '!' && c <= '/') || (c >= ':' && c <= '@'))
                    sCharCount ++;
            }

            if (letterCount < numberCount) ratioFlag = true;
            if (sCharCount < 2) sCharFlag = true;
            if (numberCount < 2) numbersFlag = true;
            if (passwordArr.length < 8) lengthFlag = true;
        }

        assertFalse(ratioFlag);
        assertFalse(sCharFlag);
        assertFalse(numbersFlag);
        assertFalse(lengthFlag);
    }
}