package com.epam.ryabtsev;

public class Test {
    public int add(int a, int b) {
        System.out.println("This is add method");
        int sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public double devision(int a, int b) {
        double result = a / b;

        return result;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public int sqrt(int a) {
        int result = a * a;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("init in git");
    }
}
