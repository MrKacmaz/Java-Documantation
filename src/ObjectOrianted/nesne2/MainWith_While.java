package ObjectOrianted.nesne2;

import java.util.Scanner;

public class MainWith_While {
    public static Scanner input = new Scanner(System.in);
    public static Scanner input2 = new Scanner(System.in);

    public static void main(String[] args) {
        String rep;
        for (; ; ) {

            Daire daire = new Daire();
            System.out.print("r: ");
            double r = input.nextDouble();
            daire.setYarıçap(r);

            System.out.println("yarıçap: " + Daire.getYarıçap());
            System.out.println("alan: " + Daire.alanH());
            System.out.println("çevre: " + Daire.çevreH());

            do {
                System.out.print("repeat: ");
                rep = input2.nextLine();
                if (rep.equals("n")) {
                    break;
                }
                else if (!rep.equals("y")){
                    System.err.println("wrong");
                }

            } while (!rep.equals("y"));
            if (rep.equals("n")) {
                System.out.println("SEE YA");
                break;
            }
            Daire.nesneSayısı++;
        }
    }
}

