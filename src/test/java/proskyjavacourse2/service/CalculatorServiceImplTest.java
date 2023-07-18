package proskyjavacourse2.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static proskyjavacourse2.service.CalculatorServiceImplTestConst.*;

class CalculatorServiceImplTest {

    CalculatorServiceImpl service = new CalculatorServiceImpl();


    @Test
    void sum() {
        assertEquals(sum, service.getSum(num1, num2));
        assertEquals(sum2, service.getSum(num3, num4));
    }

    @Test
    void subtraction() {
        assertEquals(sub, service.getSubtraction(num1, num2));
        assertEquals(sub2, service.getSubtraction(num3, num4));
    }

    @Test
    void multiplication() {
        assertEquals(multi, service.getMultiplication(num1, num2));
        assertEquals(multi2, service.getMultiplication(num3, num4));
    }

    @Test
    void division() {
        assertEquals(div, service.getDivision(num1, num2));
        assertEquals(div2, service.getDivision(num3, num4));
    }

    @Test
    void divIllegalException() {
        double divNum1 = 5;
        double divNum2 = 0;
        assertThrows(IllegalArgumentException.class, () -> service.getDivision(divNum1, divNum2));

    }
}