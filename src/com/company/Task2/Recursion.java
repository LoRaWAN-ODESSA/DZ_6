package com.company.Task2;

public class Recursion {

    private int num;
    private int sum;

    public Recursion(int num) {
        this.num = num;
    }

    public void printInfo() {
        printNum(num);
        System.out.println();
        System.out.println("The sum of numbers from 0 to " + this.num + " is: " + sumNum(num));
    }

    private void printNum(int num) {
        if (num == 0) {
            System.out.println();
            return;
        } else {
            printNum(num - 1);
            System.out.print(num + " ");
        }
    }

    private int sumNum(int num) {
        if (num != 0) {
            sum += num;
            return sumNum(num - 1);
        }
        return sum;
    }
}

