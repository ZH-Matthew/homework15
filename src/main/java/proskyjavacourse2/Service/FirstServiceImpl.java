package proskyjavacourse2.Service;

import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {


    @Override
    public String getSum(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int sum = x + y;
        return x + " + " + y + " = " + sum;
    }

    @Override
    public String getSubtraction(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int sub = x - y;
        return x + " - " + y + " = " + sub;
    }

    @Override
    public String getMultiplication(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int mul = x * y;
        return x + " * " + y + " = " + mul;
    }

    @Override
    public String getDivision(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        if (y == 0) {
            throw new RuntimeException("division by zero");
        } else {
            int div = x / y;
            return x + " / " + y + " = " + div;
        }
    }

}
