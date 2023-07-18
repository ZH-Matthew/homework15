package proskyjavacourse2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String getSum(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String getSubtraction(int num1, int num2) {
        int sub = num1 - num2;
        return num1 + " - " + num2 + " = " + sub;
    }

    @Override
    public String getMultiplication(int num1, int num2) {
        int mul = num1 * num2;
        return num1 + " * " + num2 + " = " + mul;
    }

    @Override
    public String getDivision(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка! На ноль делить нельзя!");
        } else {
            double div = num1 / num2;
            return num1 + " / " + num2 + " = " + div;
        }
    }

}
