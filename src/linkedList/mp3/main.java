package linkedList.mp3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        şarkıBilgisi şarkı1 = new şarkıBilgisi("lost",135);
        şarkıBilgisi şarkı2 = new şarkıBilgisi("break",145);
        şarkıBilgisi şarkı3 = new şarkıBilgisi("shot to down",150);
        ArrayList<şarkıBilgisi>albümler = new ArrayList<>();
        albümler.add(şarkı1);
        albümler.add(şarkı2);
        albümler.add(şarkı3);
        showMenu();
    }

    public static ArrayList<şarkıBilgisi>albümler;

    private static void showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("0 - çıkış\n1 - bir sonraki şarkı\n2 - bir önceki şarkı\n3 - yeniden başlat" +
                "\n4 - oynatma listesini göster\n5 - menüyü göster\nseçim = ");
        int choose = input.nextInt();
        chooseOption(choose);
    }

    private static void chooseOption(int choose) {
        if (choose == 1){
            nextMusic();
        }else if (choose == 2){
            previusMusic();
        }else if (choose == 3){
            repeatMusic();
        }else if (choose == 4){
            allMusic();
        }else if (choose == 5){
            showMenu();
        }else
            System.err.println("adios");
    }


    private static void allMusic() {
        ListIterator <şarkıBilgisi> listIterator = albümler.listIterator();
        System.out.println("------------------");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
        System.out.println("------------------");
        showMenu();
    }

    private static void repeatMusic() {
    }

    private static void previusMusic() {
    }

    private static void nextMusic() {

    }
}
