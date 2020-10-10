package Loops;

import java.util.Scanner;

public class for_while_doWhile_kullanımı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Value: ");
        int a = input.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println("0 to " + a + " added is = " + sum);

    }
}