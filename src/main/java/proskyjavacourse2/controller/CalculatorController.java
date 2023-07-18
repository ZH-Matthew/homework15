package proskyjavacourse2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskyjavacourse2.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService firstService;

    public CalculatorController(CalculatorService firstService) {
        this.firstService = firstService;
    }

    @GetMapping
    public String showHelloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String calcSum(@RequestParam int num1, @RequestParam int num2) {
        return firstService.getSum(num1, num2);
    }


    @GetMapping("/minus")
    public String calcSub(@RequestParam int num1, @RequestParam int num2) {
        return firstService.getSubtraction(num1, num2);
    }


    @GetMapping("/multiply")
    public String calcMul(@RequestParam int num1,@RequestParam int num2) {
        return firstService.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String calcDiv(@RequestParam double num1, @RequestParam double num2) {
        return firstService.getDivision(num1, num2);
    }

}
