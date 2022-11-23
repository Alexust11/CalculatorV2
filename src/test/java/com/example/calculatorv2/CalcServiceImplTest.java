package com.example.calculatorv2;

import com.example.calculatorv2.Service.CalcService;
import com.example.calculatorv2.Service.CalcServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcServiceImplTest {
    private final CalcServiceImpl calcService=new CalcServiceImpl();
    private Integer num1;
    private Integer num2;
    @BeforeEach
    void setNum() {
        num1=5;
        num2=5;
    }
    @Test
    void plusTest() {
        assertEquals(num1+num2,calcService.plus(num1,num2));
    }
    @Test
    void minusTest() {
        assertEquals(num1-num2,calcService.minus(num1,num2));
    }
    @Test
    void multiplyTest() {
        assertEquals(num1*num2,calcService.multiply(num1,num2));
    }
    @Test
    void divideTest() {
        assertEquals(num1/num2,calcService.divide(num1,num2));
    }

}
