package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {

    @Test
    void validateInput_should_return_all_valid() {
        DataValidator dv = new DataValidator();
        String[] expectedArray = {"Valid","Valid","Valid","Valid"};
        assertArrayEquals(expectedArray, dv.validateInput("Jimmy", "James", "55555", "TK-4210"));
    }

    @Test
    void validateInput_should_return_all_incorrect() {
        DataValidator dv = new DataValidator();
        String[] expectedArray = {"\"J\" is not a valid first name. It is too short.","\"J\" is not a valid last name. It is too short.",
                "The ZIP code must be numeric.","A12-ab12 is not a valid ID."};
        assertArrayEquals(expectedArray, dv.validateInput("J", "J", "abcde", "A12-ab12"));
    }

    @Test
    void validateInput_should_return_all_empty() {
        DataValidator dv = new DataValidator();
        String[] expectedArray = {"The first name must be filled in","The last name must be filled in",
                "The ZIP code must be filled in.","The employee ID must be filled in."};
        assertArrayEquals(expectedArray, dv.validateInput("", "", "", ""));
    }

    @Test
    void validateInput_should_return_zip_too_short() {
        DataValidator dv = new DataValidator();
        String[] expectedArray = {"Valid","Valid","The ZIP code must be a 5-digit number.","Valid"};
        assertArrayEquals(expectedArray, dv.validateInput("Jimmy", "James", "555", "TK-4210"));
    }


}