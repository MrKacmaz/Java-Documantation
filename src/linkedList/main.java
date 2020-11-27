package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class main {

    public static void main(String[] args) {
        LinkedList<String>cities = new LinkedList<>();
        cities.add("istanbul");
        cities.add("ankara");
        cities.add("eskişehir");
        cities.add("denizli");
        cities.add("antalya");

        System.out.println(cities.toString());
        System.out.println("*******");
        write(cities);
        System.out.println("**********");
        cities.add(2,"bursa");
        write(cities);
        System.out.println("*********");

    }



    private static void write(LinkedList<String> cities) {
        ListIterator<String>stringListIterator = cities.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
    }

}
