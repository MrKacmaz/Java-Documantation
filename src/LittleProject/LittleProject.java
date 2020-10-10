package LittleProject;

import java.util.ArrayList;
import java.util.Scanner;

public class LittleProject {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String names[] = new String[3];
        String surnames[] =new String[names.length];

        for (int num = 0; num <names.length ; num++) {
            System.out.print("Please write "+(num+1)+" name: ");
            String name = input.nextLine();
            names[num] = name;
        }

        for (int num = 0; num <surnames.length ; num++) {
            System.out.print("Please write "+(num+1)+" surname: ");
            String surname = input.nextLine();
            surnames[num] =surname;
        }

        ArrayList<String>ns = birleştir(names,surnames);
        yazdır(ns);

    }


    public static ArrayList<String> birleştir(String[] names, String[] surnames){
        ArrayList<String> arrayList= new ArrayList<>();
        String ns[] = new String[names.length];
        for (int i = 0; i <names.length ; i++) {
            ns[i] = names[i] + " " + surnames[i] + " " + (int)(Math.random()*50);
            arrayList.add(ns[i]);
        }
        return arrayList;
    }
    public static void yazdır(ArrayList<String> ns){
        for (String i : ns) {
            System.out.println(i);
        }
    }
}
