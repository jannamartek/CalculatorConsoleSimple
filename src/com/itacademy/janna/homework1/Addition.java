package com.itacademy.janna.homework1;

/**
 * Класс Addition реализует интерфейс Calculation и его метод calculate.
 * Метод calculate производит вычисление для операции сложения.
 */

public class Addition implements Calculation {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
