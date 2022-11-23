package com.example.calculatorv2.Service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{


    @Override
    public int plus(Integer num1, Integer num2) {
        return num1+num2;
    }
}
