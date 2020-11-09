
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.*;

public class TestsForJavaMath {
    @Test // 1
    public void testMinLong() {
        assertEquals(1234567890L, Math.min(1234567890L, 2345678901L));
        assertEquals(1234567890L, Math.min(2345678901L, 1234567890L));
    }

    @Test // 2
    public void testMinFloat() {
        assertEquals(17.5f, Math.min(17.5f, 278.32f));
        assertEquals(17.5f, Math.min(278.32f, 17.5f));
    }

    @Test // 3
    public void testMinInt() {
        assertEquals(12345, Math.min(12345, 23456));
        assertEquals(12345, Math.min(23456, 12345));
    }

    @Test // 4
    public void testMinDouble() {
        assertEquals(12345.67890, Math.min(12345.67890, 23456.78901));
        assertEquals(12345.67890, Math.min(23456.78901, 12345.67890));
    }

    @Test // 5
    public void testMaxInt() {
        assertEquals(12345, Math.max(12345, 2345));
        assertEquals(12345, Math.max(2345, 12345));
    }

    @Test // 6
    public void testMaxDouble() {
        assertEquals(12345.67890, Math.max(12345.67890, 3456.78901));
        assertEquals(12345.67890, Math.max(3456.78901, 12345.67890));
    }

    @Test // 7
    public void testMaxFloat() {
        assertEquals(17.5f, Math.max(17.5f, 8.32f));
        assertEquals(17.5f, Math.max(8.32f, 17.5f));
    }

    @Test // 8
    public void testMaxLong() {
        assertEquals(1234567890L, Math.max(1234567890L, 345678901L));
        assertEquals(1234567890L, Math.max(345678901L, 1234567890L));
    }

    @Test // 9
    public void testExponents() {
        assertEquals(150.0625, Math.pow(3.5, 4));
        assertEquals(1.0, Math.pow(3.3, 0));
        assertEquals(1.0, Math.pow(3.3, -0));
        assertEquals(3.3, Math.pow(3.3, 1));
        assertEquals(NaN, Math.pow(3.3, NaN));
    }

    @Test // 10
    public void testAddOneInt() {
        assertEquals(1, Math.incrementExact(0));
        assertEquals(2147483647, Math.incrementExact(2147483646));
        assertEquals(-2147483647, Math.incrementExact(-2147483648));
        assertThrows(ArithmeticException.class, () -> Math.incrementExact(2147483647));
    }

    @Test // 11
    public void testAddOneLong() {
        assertEquals(1L, Math.incrementExact(0L));
        assertEquals(9223372036854775807L, Math.incrementExact(9223372036854775806L));
        assertEquals(-9223372036854775807L, Math.incrementExact(-9223372036854775808L));
        assertThrows(ArithmeticException.class, () -> Math.incrementExact(9223372036854775807L));
    }

    @Test // 12
    public void testSubtractOneInt() {
        assertEquals(-1, Math.decrementExact(0));
        assertEquals(2147483646, Math.decrementExact(2147483647));
        assertEquals(-2147483648, Math.decrementExact(-2147483647));
        assertThrows(ArithmeticException.class, () -> Math.decrementExact(-2147483648));
    }

    @Test // 13
    public void testSubtractOneLong() {
        assertEquals(-1L, Math.decrementExact(0L));
        assertEquals(9223372036854775806L, Math.decrementExact(9223372036854775807L));
        assertEquals(-9223372036854775808L, Math.decrementExact(-9223372036854775807L));
        assertThrows(ArithmeticException.class, () -> Math.decrementExact(-9223372036854775808L));
    }

    @Test // 14
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16.0));
        assertEquals(125.98, Math.sqrt(15870.9604));
        assertEquals(NaN, Math.sqrt(NaN)); // test "not a number"
        assertEquals(NaN, Math.sqrt(-25.0)); // test negative values
        assertEquals(NaN, Math.sqrt(NEGATIVE_INFINITY)); // test negative infinity
        assertEquals(POSITIVE_INFINITY, Math.sqrt(POSITIVE_INFINITY)); // test positive infinity
        assertEquals(0, Math.sqrt(0));
        assertEquals(-0, Math.sqrt(-0));
    }

    @Test // 15
    public void testCubicRoot() {
        assertEquals(4.0, Math.cbrt(64.0));
        assertEquals(-4.0, Math.cbrt(-64.0));
        assertEquals(125.98, Math.cbrt(1999423.591192));
        assertEquals(-125.98, Math.cbrt(-1999423.591192));
        assertEquals(NaN, Math.cbrt(NaN)); // test "not a number"
        assertEquals(NEGATIVE_INFINITY, Math.cbrt(NEGATIVE_INFINITY)); // test negative infinity
        assertEquals(POSITIVE_INFINITY, Math.cbrt(POSITIVE_INFINITY)); // test positive infinity
        assertEquals(0, Math.cbrt(0));
        assertEquals(-0, Math.cbrt(-0));
    }

    @Test // bonus
    public void testRandom() {
        double randomDouble = Math.random();
        assertTrue(randomDouble >= 0 && randomDouble < 1);
    }
}
