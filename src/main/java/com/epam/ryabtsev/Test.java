package com.epam.ryabtsev;

public class Test {
    public int add(int a, int b) {
        System.out.println("This is add method for 2 params");
        int sum = a + b;
        return sum;
    }

    public int add(int a, int b, int c) {
        System.out.println("This is add method for 3 params");
        int sum = a + b + c;
        return sum;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("This is add method for 4 params");
        int sum = a + b + c + d;
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
