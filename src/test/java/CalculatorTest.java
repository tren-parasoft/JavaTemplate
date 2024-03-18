import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(111, result);
    }

    @Test
    void testMinus() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(2, 1);
        assertEquals(8818, result);
    }
}