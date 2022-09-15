package com.itacademy.janna.homework1;

/**
 * Класс Multiplication реализует интерфейс Calculation и его метод calculate.
 * Метод calculate производит вычисление для операции умножения.
 */

public class Multiplication implements Calculation {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
