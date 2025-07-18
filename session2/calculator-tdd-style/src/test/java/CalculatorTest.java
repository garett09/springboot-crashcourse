import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeEach
    void setUp() {
        Calculator calculator = new Calculator();
    }



    @Test
    void shouldBeTurnedOff() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldBeTurnedOn() {
        Calculator calculator = new Calculator();
        calculator.turnOn();
        assertTrue(calculator.isOn());

}

    @Test
    void shouldTurnOff(){
        Calculator calculator = new Calculator();
        calculator.turnOff();
        assertFalse(calculator.isOn());
    }
    @Test
    void shouldTurnOffWhenTurnedOn() {
        Calculator calculator = new Calculator();
        calculator.turnOn();
        assertFalse(calculator.isOff());
        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    @Test
    void shouldCalculateSumWithTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 10);
        assertEquals(15, result);
    }

    @Test
    void shouldCalculateQuotientWithTwoFloats() {
        Calculator calculator = new Calculator();
        float result = calculator.divide(10.0f, 2.0f);
        assertEquals(5.0f, result, 0.001);

    }

    @Test
    void shouldCalculateDifferenceWithTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.difference(10, 5);
        assertEquals(5, result);
    }

    @Test
    void shouldCalculateProductWithTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 10);
        assertEquals(50, result);
    }
}

