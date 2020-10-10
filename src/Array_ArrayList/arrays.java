package Array_ArrayList;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[1] = 5;
        numbers[7] = 5;
        numbers[0] = 5;
        numbers[9] = 5;

       /* *//*for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] == 0){
                numbers[i] = i*10;
            }
        }*//*

        for (int number : numbers) {
            System.out.println(number);
        }*/


       /* //Q1

        int[] powers = new int[11];
        for (int i = 0; i < powers.length ; i++) {
            powers[i] = (int) Math.pow(i,2);
        }
        for (int i:powers) {
            System.out.println(i);
        }*/


        /*// Q2
        Scanner input = new Scanner(System.in);
        int[]array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı gir: ");
            int girilenSayı = input.nextInt();
            array[i] = girilenSayı;
        }
        System.out.println(array.length);

        for (int i = array.length -1 ; i > 0 ; i--) {
            System.out.println(array[i]);
        }*/


        /*//Q4
        String [] months = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        Scanner input = new Scanner(System.in);
        System.out.println("Ay seç: ");
        int seçim = input.nextInt() - 1;
        if (seçim <= 11 && seçim >= 0){
            System.out.println("sonuç: " + months[seçim]);
        }else
            System.err.println("hata");
*/

        //Q5

        /*Scanner input = new Scanner(System.in);
        System.out.println("array boyutunu seç: " );
        int boyut = input.nextInt();
        int[]array = new int[boyut];
        int toplam = 0;
        for (int i = 0; i <array.length ; i++) {
            System.out.println(i+1 +". eleman: ");
            int girilenSayı = input.nextInt();
            array[i] = girilenSayı;
            toplam = toplam + array[i];
        }

        System.out.println("toplamları: " + toplam);*/

    }
}
