package Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList_Iterator {
    public static void main(String[] args) {

        String[] names = {"ali", "veli", "alperen", "betül", "asya"};
        String[] surnames = {"ali", "veli", "kaçmaz", "gözen"};

        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<String> surnamesList = new ArrayList<>();

        Collections.addAll(namesList, names);

        Collections.addAll(surnamesList, surnames);
        //namelistde bulunan string surnames listesinde varsa namelistden kaldırır.
        namesList.removeIf(surnamesList::contains);

        for (String s: namesList) {
            System.out.println(s);
        }

        /*
        for (String s : names) {
            namesList.add(s);
        }

        for (String s : surnames) {
            surnamesList.add(s);
        }
        //namelistde bulunan string surnames listesinde varsa namelistden kaldırır.
        Iterator<String> iterator = namesList.listIterator();
        while (iterator.hasNext()){
            if (surnamesList.contains(iterator.next())){
                iterator.remove();
            }
        }
        for (String s: namesList) {
            System.out.println(s);
        }
        */

    }
}
