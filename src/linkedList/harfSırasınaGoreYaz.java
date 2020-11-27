package linkedList;


import java.util.LinkedList;
import java.util.ListIterator;

public class harfSırasınaGoreYaz {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        sortCities(cities,"istanbul");
        sortCities(cities,"ankara");
        sortCities(cities,"eskişehir");
        sortCities(cities,"denizli");
        sortCities(cities,"denizli");
        sortCities(cities,"antalya");

    }

    private static void sortCities(LinkedList<String> cities, String şehirler) {
        ListIterator<String> listIterator = cities.listIterator();
        while (listIterator.hasNext()){
            int index = listIterator.next().compareTo(şehirler);
            if (index > 0){
                listIterator.add(şehirler);
            }
            else if (index<0){
                listIterator.previous();
                listIterator.add(şehirler);
            }else System.err.println("error");
        }
        listIterator.add(şehirler);
        write(cities);
    }

    private static void write(LinkedList<String> cities) {
        for (String city : cities) {
            System.out.println(city);
        }
    }

}
