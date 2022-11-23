package com.example.calculatorv2;
import com.example.calculatorv2.Service.CalcServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class CalcServiceImplTest {
    private final CalcServiceImpl calcService=new CalcServiceImpl();
    private Integer num1;
    private Integer num2;
    @BeforeEach
    void setNum() {
        num1=5;
        num2=0;
    }
    @Test
    void plusTest() {
        Assertions.assertEquals(num1+num2,calcService.plus(num1,num2));
    }
    @Test
    void minusTest() {Assertions.assertEquals(num1-num2,calcService.minus(num1,num2));
    }
    @Test
    void multiplyTest() {
        Assertions.assertEquals(num1*num2,calcService.multiply(num1,num2));
    }
    @Test
    void divideTest() {
        Assertions.assertEquals(num1/num2,calcService.divide(num1,num2));
    }
    @Test
    void testByZero() {
        if (num2 == 0) {
            throw new IllegalArgumentException("деление на ноль");
        } else System.out.println("Деление возможно");
    }
}
