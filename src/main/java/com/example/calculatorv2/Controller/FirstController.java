package com.example.calculatorv2.Controller;

import com.example.calculatorv2.Service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class FirstController {
    private final CalcService calcService;

    public FirstController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

     @GetMapping("/plus")

    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "+ " + num2 + " = " + calcService.plus(num1, num2);
    }
    @GetMapping("/minus")

    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "- " + num2 + " = " +calcService.minus(num1,num2) ;
    }
    @GetMapping("/multiply")

    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "* " + num2 + " = " +calcService.multiply(num1,num2) ;
    }

    @GetMapping("/divide")

    public String divide (@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("деление на ноль");
        } else return num1 + "/ " + num2 + " = " +calcService.divide(num1,num2) ;
    }
}
