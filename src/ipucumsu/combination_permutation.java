package ipucumsu;

import java.util.Scanner;

public class combination_permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("combination or permutation (1-2): ");
        int choose = input.nextInt();
        if (choose == 1) {
            System.out.print("combination of: ");
            int firstDigit = input.nextInt();
            System.out.print("repeat: ");
            int repeat = input.nextInt();
            if (firstDigit >= repeat) {
                System.out.println(combination(firstDigit, repeat));
            } else System.err.print("WRONG INTERVAL");
        } else if (choose == 2) {
            System.out.print("permutation of: ");
            int firstDigit = input.nextInt();
            System.out.print("repeat: ");
            int repeat = input.nextInt();
            System.out.println(permutation(firstDigit, repeat));

        } else System.err.println("incorrect choose");


    }

    public static double combination(double firstDigit, double repeat) {
        double sumA = 1, sumB = 1, j = 1;
        double i = firstDigit - repeat + 1;

        while (i <= firstDigit) {
            sumA = sumA * i;
            i++;
        }
        while (j <= repeat) {
            sumB = sumB * j;
            j++;
        }
        return sumA / sumB;
    }

    public static double permutation(double firstDigit, double repeat) {
        double sumA = 1, sumB = 1, i = 1, k = 1;

        while (i <= firstDigit) {
            sumA = sumA * i;
            i++;
        }
        while (k <= (firstDigit - repeat)) {
            sumB = sumB * k;
            k++;
        }
        return sumA / sumB;
    }

}
