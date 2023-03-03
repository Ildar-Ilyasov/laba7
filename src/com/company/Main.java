package com.company;
import java.util.Scanner;
class Calculator {
    int a;
    int b;
    int x;

    Calculator(int a, int b, int x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    int lvl1() {
        return 3 * x + 5;
    }

    double lvl2() {
        return (a + b) / (a - b);
    }

    int lvl3() {
        int y = (a * x / b);
        int result = 1;
        if (b != 0) {
            if (y > 0 && y % 1 == 0) {
                for (int i = 1; i <= y; i++) {
                    result = result * i;
                }
            }
            else{
                return y;
            }
        }
        else {
            return 0;
        }
        return y;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator(in.nextInt(),in.nextInt(),in.nextInt());
        int y1 = calc.lvl1();
        double y2 = calc.lvl2();
        int y3 = calc.lvl3();
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
    }
}