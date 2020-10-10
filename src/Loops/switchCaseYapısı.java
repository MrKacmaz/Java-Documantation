package Loops;

import java.util.Scanner;

public class switchCaseYapısı {
    public static void main(String[] args) {

        OptionCase();
    }

    public static void OptionCase() {

        Scanner input = new Scanner(System.in);
        System.out.print("Choose day of a month 1-30: ");
        int option = input.nextInt();
        SwitchCase(option);

    }

    public static void SwitchCase(int opt) {
        if (opt > 30 || opt == 0 || opt < 0) {
            ErrorCase();
        }
        int newOpt = opt % 7;
        if (newOpt == 0) {
            newOpt = 7;
        }

        switch (newOpt) {

            case 1:
                System.out.println("monday");
                OptionCase();
                break;

            case 2:
                System.out.println("thursday");
                OptionCase();
                break;

            case 3:
                System.out.println("wednesday");
                OptionCase();
                break;

            case 4:
                System.out.println("tuesday");
                OptionCase();
                break;

            case 5:
                System.out.println("friday");
                OptionCase();
                break;

            case 6:
                System.out.println("saturday");
                OptionCase();
                break;

            case 7:
                System.out.println("sunday");
                OptionCase();
                break;

            default:
                ErrorCase();
        }
    }

    public static void ErrorCase() {
        System.out.println("Wrong Answer...\nLoading options...");
        OptionCase();
    }
}