package com.example.calculatorv2;

import com.example.calculatorv2.Service.CalcServiceImpl;
import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorImplParamTest {
    private final CalcServiceImpl calcService = new CalcServiceImpl();

    static Stream<Arguments> paramPlus() {
        return Stream.of(Arguments.of(2, 5, 7), Arguments.of(3, 6, 9));
    }

    static Stream<Arguments> paramMinus() {
        return Stream.of(Arguments.of(2, 5, -3), Arguments.of(6, 5, 1));
    }
    static Stream<Arguments> paramMultiply() {
        return Stream.of(Arguments.of(2, 5, 10), Arguments.of(6, 5, 30));
    }
    static Stream<Arguments> paramDivide() {
        return Stream.of(Arguments.of(5, 5, 1), Arguments.of(10, 5, 2));
    }
    static Stream<Arguments> paramTestByZero() {
        return Stream.of(Arguments.of(5, 1));
    }
    @ParameterizedTest
    @MethodSource("paramPlus")
    void plusTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(calcService.plus(num1,num2),result);
    }
    @ParameterizedTest
    @MethodSource("paramMinus")
    void minusTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(calcService.minus(num1,num2),result);
    }
    @ParameterizedTest
    @MethodSource("paramMultiply")
    void MultiplyTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(calcService.multiply(num1,num2),result);
    }
    @ParameterizedTest
    @MethodSource("paramDivide")
    void DivideTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(calcService.divide(num1,num2),result);
    }
    @ParameterizedTest
    @MethodSource("paramTestByZero")
    void testByZero(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        } else System.out.println("деление возможно");
    }

}

