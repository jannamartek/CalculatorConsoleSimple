package com.itacademy.janna.homework1;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    Scanner scanner = new Scanner(System.in);

    public double getNumber() {
        double number;
        scanner.useLocale(Locale.US);
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Error enter the number. Please, try again.");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public char getOperand() {
        System.out.println("Enter operator (+, -, *, /):");
        char operand;
        scanner.useLocale(Locale.US);
        if (scanner.hasNext()) {
            operand = scanner.next().charAt(0);
        } else {
            scanner.next();
            operand = getOperand();
        }
        return operand;
    }

    public double calculate(double numberOne, double numberTwo, char operation) {
        double answer;
        switch (operation) {
            case '+' -> answer = numberOne + numberTwo;
            case '-' -> answer = numberOne - numberTwo;
            case '*' -> answer = numberOne * numberTwo;
            case '/' -> answer = numberOne / numberTwo;
            default -> {
                System.out.println("Error enter");
                answer = calculate(numberOne, numberTwo, getOperand());
            }
        }
        return answer;
    }
}


