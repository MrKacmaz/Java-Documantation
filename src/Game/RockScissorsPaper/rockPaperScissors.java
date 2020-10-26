// TODO: 20.10.2020
/**
 * @author Alperen KACMAZ
 */
package Game.RockScissorsPaper;

import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        System.out.println("*******-Rock Paper Scissors-*******");
        System.out.println("e - exit the game");
        start();

    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Rock/Scissors/Paper (r/s/p): ");
        String ch = input.nextLine();
        if (ch.equals("e")) {
            System.out.println("*******-Good Bye-*******");
        } else {
            toProduce(ch);
        }
    }

    public static void toProduce(String player) {
        String choose;
        int rep = (int) (Math.random() * 10);
        switch (rep) {
            case 0:
            case 3:
            case 6:
            case 9:
                choose = "ROCK";
                break;
            case 1:
            case 4:
            case 7:
            case 10:
                choose = "PAPER";
                break;
            case 2:
            case 5:
            case 8:
                choose = "SCISSORS";
                break;
            default:
                choose = "WRONG IN GAME BRAIN";
                break;
        }
        int result = Settings(choose, player);
        System.out.println("Machine: " + choose);
        switch (result) {
            case -2:
                System.err.println("WRONG LETTER");
                break;
            case -1:
                System.out.println("LOSE");
                break;
            case 0:
                System.out.println("DRAW");
                break;
            case 1:
                System.out.println("WIN");
                break;
        }
        start();

    }

    public static int Settings(String machine, String player) {
        int situation;
        if (machine.equals("ROCK") && player.equals("r")) situation = 0;

        else if (machine.equals("ROCK") && player.equals("s")) situation = -1;

        else if (machine.equals("ROCK") && player.equals("p")) situation = 1;

        else if (machine.equals("PAPER") && player.equals("r")) situation = -1;

        else if (machine.equals("PAPER") && player.equals("s")) situation = 1;

        else if (machine.equals("PAPER") && player.equals("p")) situation = 0;

        else if (machine.equals("SCISSORS") && player.equals("r")) situation = 1;

        else if (machine.equals("SCISSORS") && player.equals("s")) situation = 0;

        else if (machine.equals("SCISSORS") && player.equals("p")) situation = -1;

        else situation = -2;

        return situation;
    }
}
