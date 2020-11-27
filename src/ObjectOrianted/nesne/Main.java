package ObjectOrianted.nesne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Rectangle rectangle = new Rectangle();
        rectangle.weight = 25;
        rectangle.height = 12.5;
        System.out.println(rectangle.area());*/

        Rectangle rectangle1 = new Rectangle(5,2.9);
        System.out.println(rectangle1.area());

        Scanner input = new Scanner(System.in);
        System.out.print("weight: ");
        double weight = input.nextDouble();
        Rectangle rectangle2 = new Rectangle(weight);
        System.out.println(rectangle2.area());
    }
}