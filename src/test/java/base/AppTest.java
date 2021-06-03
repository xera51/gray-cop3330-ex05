/*
 *  UCF COP3330 Summer 2021 Exercise 5 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_is_properly_formatted() {
        App myApp = new App();
        int testNum1 = 10;
        int testNum2 = 5;

        String expectedOutput = String.format("10 + 5 = 15%n10 - 5 = 5%n10 * 5 = 50%n10 / 5 = 2%n");
        String actualOutput = myApp.generateOutputString(testNum1, testNum2);

        assertEquals(expectedOutput, actualOutput);
    }
}