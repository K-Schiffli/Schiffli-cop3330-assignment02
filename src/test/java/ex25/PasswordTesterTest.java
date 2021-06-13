package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTesterTest {

    @Test
    void Test_Very_Weak_Password() {
        new PasswordTester();
        assertEquals(1, PasswordTester.testPassword("12345"));
    }

    @Test
    void Test_Weak_Password() {
        new PasswordTester();
        assertEquals(2, PasswordTester.testPassword("letters"));
    }

    @Test
    void Test_moderate_Password() {
        new PasswordTester();
        assertEquals(3, PasswordTester.testPassword("abc123"));
    }

    @Test
    void Test_strong_Password() {
        new PasswordTester();
        assertEquals(4, PasswordTester.testPassword("L0ngPa55w0rd"));
    }

    @Test
    void Test_very_strong_Password() {
        new PasswordTester();
        assertEquals(5, PasswordTester.testPassword("Str0ngP@$$W0rd"));
    }

    @Test
    void Test_short_letters_and_numbers_Password() {
        new PasswordTester();
        assertEquals(3, PasswordTester.testPassword("sh0rt"));
    }

    @Test
    void Test_short_letters_and_symbols_Password() {
        new PasswordTester();
        assertEquals(3, PasswordTester.testPassword("p@ss"));
    }

    @Test
    void Test_short_numbers_and_symbols_Password() {
        new PasswordTester();
        assertEquals(3, PasswordTester.testPassword("123!@#"));
    }

    @Test
    void Test_long_numbers_and_symbols_Password() {
        new PasswordTester();
        assertEquals(3, PasswordTester.testPassword("123!@#456$%^"));
    }

    @Test
    void Test_long_letters_and_symbols_Password() {
        new PasswordTester();
        assertEquals(3, PasswordTester.testPassword("newP@$$word"));
    }

    @Test
    void Test_short_symbols_Password() {
        new PasswordTester();
        assertEquals(2, PasswordTester.testPassword("!@#$%^"));
    }

    @Test
    void Test_long_symbols_Password() {
        new PasswordTester();
        assertEquals(2, PasswordTester.testPassword("!@#$%^&*"));
    }
}