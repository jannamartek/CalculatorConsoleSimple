package com.itacademy.janna.homework1;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Calculator simple = new Calculator();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Welcome to the console calculator !");
        System.out.println("Available operations: ");
        System.out.println("Addition(+), Subtraction(-), Multiplication(*), Division(/),");
        System.out.println();

        while (true) {
            System.out.println("Enter the first number: ");
            double numberOne = simple.getNumber();
            char operation = simple.getOperand();
            System.out.println("Enter the second number: ");
            double numberTwo = simple.getNumber();
            double answer = simple.calculate(numberOne, numberTwo, operation);
            System.out.println("Answer: " + answer);

            System.out.println("Do you wish to continue? (Y/N)");
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("N")) {
                System.out.println("Bye Bye!");
                break;
            } else if (!userChoice.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

}

