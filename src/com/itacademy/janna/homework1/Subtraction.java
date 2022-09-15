package com.itacademy.janna.homework1;

/**
 * Класс Subtraction реализует интерфейс Calculation и его метод calculate.
 * Метод calculate производит вычисление для операции вычитания.
 */

public class Subtraction implements Calculation {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
