package proskyjavacourse2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskyjavacourse2.Service.FirstService;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final FirstService firstService;

    public FirstController(FirstService firstService) {
        this.firstService = firstService;
    }

    @GetMapping
    public String showHelloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String calcSum(@RequestParam String num1, String num2) {
        return firstService.getSum(num1, num2);
    }


    @GetMapping("/minus")
    public String calcSub(@RequestParam String num1, String num2) {
        return firstService.getSubtraction(num1, num2);
    }


    @GetMapping("/multiply")
    public String calcMul(@RequestParam String num1, String num2) {
        return firstService.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String calcDiv(@RequestParam String num1, String num2) {
        return firstService.getDivision(num1, num2);
    }

}
