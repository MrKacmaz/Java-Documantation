package Game.GuessIt;

/***
 * @author ALPEREN KACMAZ
 *
 * @version 1.5
 */


import java.util.ArrayList;
import java.util.Scanner;

public class GuessIt_v_1_5 {

    public static int repeat = 0;

    public static int choose;

    public static void main(String[] args) {
        System.out.println("\n\n\tWelcome the GUESS IT !!! ");

        chooseDiff();
    }

    public static void chooseDiff() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\n\tGame Difficulty is ...\n" +
                "\n1-Easy\n2-Normal\n3-Hard\n4-Veteran\n\n5-Quit \n... ");
        choose = input.nextInt();
        if (choose > 0 && choose < 6) {
            difficultyLevel(choose);

        } else {
            System.out.println("Wrong.\nTry Again");
            chooseDiff();
        }

    }

    public static void difficultyLevel(int diffLvl) {
        //zorluk seçimi alanı
        int interval;
        switch (diffLvl) {
            case 1:
                interval = 10;
                System.out.println("\n\tYou choose Easy" +
                        "\n  Machine choose number \n\tbetween 0- 10");
                System.out.println("\n\tLets begin !!\n\n");
                gameBrain(interval);
                break;
            case 2:
                interval = 100;
                System.out.println("\n\tYou choose Medium" +
                        "\n  Machine choose number \n\tbetween 0- 100");
                System.out.println("\n\tLets begin !!\n\n");
                gameBrain(interval);
                break;
            case 3:
                interval = 1000;
                System.out.println("\n\tYou choose Hard" +
                        "\n  Machine choose number \n\tbetween 0- 1000");
                System.out.println("\n\tLets begin !!\n\n");
                gameBrain(interval);
                break;
            case 4:
                interval = 10000;
                System.out.println("\n\tYou choose Veteran" +
                        "\n  Machine choose number \n\tbetween 0- 10000");
                System.out.println("\n\tLets begin !!\n\n");
                gameBrain(interval);
                break;
            case 5:
                System.out.println("\n\nGoodbye ;=D");
                break;
        }
    }

    public static void gameBrain(int interval) {
        Scanner input2 = new Scanner(System.in);
        //makinanın numara seçme yeri
        int number = (int) (Math.random() * interval);
        int guess;
        ArrayList<Integer> guessNumber = new ArrayList<>();
        //oyunun beyni
        do {
            System.out.print("Guess the Number: ");
            guess = input2.nextInt();
            guessNumber.add(guess);

            if (guess < interval && guess > 0) {

                if (guess < number) {
                    System.out.println("The Number is BIGGER\n");
                    numberOfRepeat(1);
                } else if (guess > number) {
                    System.out.println("The Number is SMALLER\n");
                    numberOfRepeat(1);

                } else {
                    System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!" +
                            "\n!!! CONGRATULATIONS !!!\n" +
                            "!!!!!!!!!!!!!!!!!!!!!!!\n");
                }
            } else {
                System.out.println("WRONG INTERVAL");
            }
        } while (number != guess);

        System.out.println("\n\tYour Score: " + score());


        if (score() > 87) {
            System.out.println("\tBrilliant");
        } else if (score() > 75 && score() < 87) {
            System.out.println("\tclever");
        } else {
            System.out.println("\tare u dumb ??? :DDDD");
        }
        System.out.println("\tYou repeat " + repeat + " times");
        System.out.println("\nGuess numbers are: ");
        for (int i :guessNumber) {
            System.out.print(i + " ");
        }
        playAgain();
    }

    public static void playAgain() {
        Scanner input3 = new Scanner(System.in);
        String playAgain;
        System.out.println("\n\nWould yuo like to play again ? (y/n)");
        playAgain = input3.next();
        if (playAgain.equals("y")) {
            numberOfRepeat(-(repeat));
            chooseDiff();

        } else if (playAgain.equals("n")) {
            System.out.println("\n\nGoodbye ;=D");

        } else {
            System.out.println("Wrong letter !!!!");
            playAgain();

        }
    }

    public static int numberOfRepeat(int rep) {

        repeat = rep + repeat;
        return repeat;
    }

    public static double score() {
        double score = 100;

        switch (choose) {
            //choose easy
            case 1: {
                score = score - (4.5 * repeat);
            }
            break;

            //choose normal
            case 2: {
                score = score - (3.75 * repeat);
            }
            break;

            //choose hard
            case 3: {
                score = score - (2.5 * repeat);
            }
            break;

            //choose veteran
            case 4: {
                score = score - (1.75 * repeat);
            }
        }


        return score;
    }

}