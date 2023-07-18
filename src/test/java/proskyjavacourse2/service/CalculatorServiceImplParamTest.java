package proskyjavacourse2.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static proskyjavacourse2.service.CalculatorServiceImplTestConst.*;

class CalculatorServiceImplParamTest {
    private static final CalculatorServiceImpl out = new CalculatorServiceImpl();


    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(sum, sum2, out.getSum(num1, num2), out.getSum(num3, num4)),
                Arguments.of(sub, sub2, out.getSubtraction(num1, num2), out.getSubtraction(num3, num4)),
                Arguments.of(multi, multi2, out.getMultiplication(num1, num2), out.getMultiplication(num3, num4)),
                Arguments.of(div, div2, out.getDivision(num1, num2), out.getDivision(num3, num4))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void checkParamsTest(String expected1, String expected2, String actual1, String actual2) {
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

}