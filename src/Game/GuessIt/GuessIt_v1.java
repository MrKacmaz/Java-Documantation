package Game.GuessIt;

import java.util.Scanner;

public class GuessIt_v1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\n\tWelcome the GUESS IT !!! \n\n\tGame Difficulty is ...\n" +
                "\n1-Easy\n2-Normal\n3-Hard\n4-Veteran \n... ");
        int choose = input.nextInt();

        //yanlış zorluk seçimi yapmaması için komut
        if (choose > 0 && choose < 5) {
            int guess;
            int diff = 0;

            //zorluk seçimi alanı
            switch (choose) {
                case 1:
                    diff = 10;
                    System.out.println("\n\tYou choose Easy" +
                            "\n  Machine choose number \n\tbetween 0- 10");
                    System.out.println("\n\tLets begin !!\n\n");
                    break;
                case 2:
                    diff = 100;
                    System.out.println("\n\tYou choose Medium" +
                            "\n  Machine choose number \n\tbetween 0- 100");
                    System.out.println("\n\tLets begin !!\n\n");
                    break;
                case 3:
                    diff = 1000;
                    System.out.println("\n\tYou choose Hard" +
                            "\n  Machine choose number \n\tbetween 0- 1000");
                    System.out.println("\n\tLets begin !!\n\n");
                    break;
                case 4:
                    diff = 10000;
                    System.out.println("\n\tYou choose Veteran" +
                            "\n  Machine choose number \n\tbetween 0- 10000");
                    System.out.println("\n\tLets begin !!\n\n");
                    break;
                default:
                    System.out.println("Wrong Difficulty Choose");
            }

            //makinanın numara seçme yeri
            int number = (int) (Math.random() * diff);

            //oyunun beyni
            do {
                System.out.print("Guess the Number: ");
                guess = input.nextInt();
                if (guess < number) {
                    System.out.println("The Number is BIGGER\n");
                } else if (guess > number) {
                    System.out.println("The Number is SMALLER\n");
                } else
                    System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!" +
                            "\n!!! CONGRATULATIONS !!!\n" +
                            "!!!!!!!!!!!!!!!!!!!!!!!");
            } while (number != guess);

        } else
            System.out.println("\n\tWrong Choose\n\n\tGOODBYE");

    }
}
