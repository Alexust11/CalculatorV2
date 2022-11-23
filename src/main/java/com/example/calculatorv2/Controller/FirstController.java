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
                 return num1 + "+ " + num2 + " = " +calcService.plus(num1,num2) ;
    }

}
