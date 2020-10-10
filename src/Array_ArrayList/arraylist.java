package Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 25);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        // sort / sıralama işlemleri
        Arrays.sort(array);
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(99);
        arrayList.add(88);


        // gösterim şekilleri: foreach OR toString
        for (int i : arrayList) {
            System.out.println(i);
        }

        System.out.println(arrayList.toString());

    }
}
