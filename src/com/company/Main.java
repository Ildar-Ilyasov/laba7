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

    void lvl3(){
        if (b != 0){

            int y = 1;
            for (int i = 1; i<= (a*x)/b; i++){
                y = y*i;
            }
            System.out.println(y);
        }
        else{
            System.out.println("Error");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator(in.nextInt(),in.nextInt(),in.nextInt());
        int y1 = calc.lvl1();
        double y2 = calc.lvl2();
        System.out.println(y1);
        System.out.println(y2);
        calc.lvl3();
    }
}