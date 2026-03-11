package com;
import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        Calculator cal = new Calculator();
        System.out.println("Addition: " + cal.add(num1, num2));
        System.out.println("Subtraction: " + cal.subtract(num1, num2));
        System.out.println("Multiplication: " + cal.multiply(num1, num2));
        System.out.println("Division: " + cal.divide(num1, num2));
        sc.close();
    }
}