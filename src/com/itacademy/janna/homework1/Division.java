package com.itacademy.janna.homework1;

/**
 * Класс Division реализует интерфейс Calculation и его метод calculate.
 * Метод calculate производит вычисление для операции деления.
 */

public class Division implements Calculation {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Division by 0 can't be done");
        } else
            return firstNumber / secondNumber;
    }
}
