import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {
    Functions func = new Functions();

    @Test
    void testDividersOne() {
        assertEquals(4, func.dividersNumber(10));
    }

    @Test
    void testDividersTwo() {
        assertNotEquals(6, func.dividersNumber(10));
    }

    @Test
    void testMaxOfThreeOne() {
        assertEquals(6, func.maxOfThree(6, 2, 3));
    }

    @Test
    void testMaxOfThreeTwo() {
        assertEquals(8, func.maxOfThree(6, 8, 3));
    }

    @Test
    void testMaxOfThreeThree() {
        assertEquals(698, func.maxOfThree(6, 8, 698));
    }

    @Test
    void testMaxOfThreeFour() {
        assertNotEquals(8, func.maxOfThree(12, 8, 6));
    }

    @Test
    void testMaxOfThreeFive() {
        assertNotEquals(9, func.maxOfThree(15, 9, 6));
    }

    @Test
    void testMaxOfThreeSix() {
        assertNotEquals(66, func.maxOfThree(3413, 66, 6));
    }

    @Test
    void testFizzBuzzOne() {
        assertEquals("Fizz", func.fizzBuzz(6));
    }

    @Test
    void testFizzBuzzTwo() {
        assertEquals("Buzz", func.fizzBuzz(10));
    }

    @Test
    void testFizzBuzzThree() {
        assertEquals("FizzBuzz", func.fizzBuzz(15));
    }

    @Test
    void testFizzBuzzFour() {
        assertNotEquals("Buzz", func.fizzBuzz(9));
    }

    @Test
    void testFizzBuzzFive() {
        assertNotEquals("Fizz", func.fizzBuzz(10));
    }

    @Test
    void testFizzBuzzSix() {
        assertNotEquals("FizzBuzz", func.fizzBuzz(14));
    }

    @Test
    void testIsVowelOne() {
        assertTrue(func.isVowel('e'));
    }

    @Test
    void testIsVowelTwo() {
        assertTrue(func.isVowel('A'));
    }

    @Test
    void testIsVowelThree() {
        assertFalse(func.isVowel('c'));
    }

    @Test
    void testIsVowelFour() {
        assertFalse(func.isVowel('X'));
    }

}