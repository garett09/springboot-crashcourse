import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoIntegers(){
        int actual = calculator.add(5,10);
        assertEquals(15,actual);
    }

    @Test
    void shouldAddTwoLong(){
        long actual = calculator.add(100000000000000L,9000000000000000L);
        assertEquals(9100000000000000L,actual);
    }

    @Test
    void shouldAddTwoShort(){
        short actual = (short) calculator.add(5000,10000);
        assertEquals(15000,actual);
    }

    @Test
    void shouldAddTwoFloat(){
        float actual = calculator.add(1000f,500f);
        assertEquals(1500f,actual);


    }

    @Test
    void shouldAddTwoDouble(){
        double actual= calculator.add(1000d,5000d);
        assertEquals(6000d,actual,0.01);


    }

    @Test
    void shouldSubtractTwoIntegers() {
        int actual = calculator.subtract(15, 5);
        assertEquals(10, actual);
    }

    @Test
    void shouldSubtractTwoLong() {
        long actual = calculator.subtract(9000000000000000L, 100000000000000L);
        assertEquals(8900000000000000L, actual);
    }

    @Test
    void shouldSubtractTwoShort() {
        short actual = (short) calculator.subtract(20000, 5000);
        assertEquals(15000, actual);
    }

    @Test
    void shouldSubtractTwoFloat() {
        float actual = calculator.subtract(1500f, 500f);
        assertEquals(1000f, actual);
    }

    @Test
    void shouldSubtractTwoDouble() {
        double actual = calculator.subtract(5000d, 1000d);
        assertEquals(4000d, actual, 0.01);
    }

    @Test
    void shouldMultiplyTwoIntegers() {
        int actual = calculator.multiply(5, 10);
        assertEquals(50, actual);
    }

    @Test
    void shouldMultiplyTwoLong() {
        long actual = calculator.multiply(1000000L, 10000L);
        assertEquals(10000000000L, actual);
    }

    @Test
    void shouldMultiplyTwoShort() {
        short actual = (short) calculator.multiply(100, 200);
        assertEquals(20000, actual);
    }

    @Test
    void shouldMultiplyTwoFloat() {
        float actual = calculator.multiply(12.5f, 4f);
        assertEquals(50f, actual);
    }

    @Test
    void shouldMultiplyTwoDouble() {
        double actual = calculator.multiply(12.5d, 4d);
        assertEquals(50d, actual, 0.01);
    }

    @Test
    void shouldDivideTwoIntegers() {
        int actual = calculator.divide(10, 2);
        assertEquals(5, actual);
    }

    @Test
    void shouldThrowExceptionWhenDivideIntByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void shouldDivideTwoLong() {
        long actual = calculator.divide(10000000000L, 1000000L);
        assertEquals(10000L, actual);
    }

    @Test
    void shouldThrowExceptionWhenDivideLongByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(100L, 0L));
    }

    // Short Division
    @Test
    void shouldDivideTwoShort() {
        short actual = (short) calculator.divide(20000, 100);
        assertEquals(200, actual);
    }

    @Test
    void shouldDivideTwoFloat() {
        float actual = calculator.divide(50f, 3f);
        assertEquals(16.6667f, actual, 0.0001f);
    }

    @Test
    void shouldHandleFloatDivideByZero() {
        float actual = calculator.divide(50f, 0f);
        assertTrue(Float.isInfinite(actual));
    }

    @Test
    void shouldDivideTwoDouble() {
        double actual = calculator.divide(50d, 3d);
        assertEquals(16.6667d, actual, 0.0001d);
    }

    @Test
    void shouldHandleDoubleDivideByZero() {
        double actual = calculator.divide(50d, 0d);
        assertTrue(Double.isInfinite(actual));
    }


}

