package Vectors.vector;

import java.util.Iterator;

public class Vector {

    public static void main(String[] args) {

        java.util.Vector<Integer> vector = new java.util.Vector<>();
        vector.add(8);
        vector.add(12);
        vector.add(1);
        vector.add(98);
        System.out.println(vector.toString());
        vector.add(2, 999);
        System.out.println(vector.toString());
        System.out.println("first: " + vector.firstElement() + " || last: " + vector.lastElement());


        Iterator iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

