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


}

