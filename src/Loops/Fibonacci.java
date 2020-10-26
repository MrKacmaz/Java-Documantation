package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many steps in the Fib. = ");
        int rep = input.nextInt();
        double a = 1, b = 1, sum;

        if (rep < 0) {
            System.err.println("Wrong chose");

        } else if (rep <= 2) {
            System.out.println("1. Step = " + a + "\n" + "2. Step = " + b);

        } else {
            System.out.println("1. Step = " + a + "\n" + "2. Step = " + b);
            for (int i = 3; i <= rep; i++) {
                sum = a + b;
                a = b;
                b = sum;
                System.out.println(i + ". Step = " + sum);
            }
        }
    }
}
