package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class usesCases {
    public static void main(String[] args) {

        //LINKED LIST
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(5);
        integerLinkedList.add(10);
        integerLinkedList.add(15);
        integerLinkedList.add(20);
        integerLinkedList.add(25);
        integerLinkedList.add(30);
        int [] arr = new int[integerLinkedList.size()];
        System.out.println("getFirst = "+integerLinkedList.getFirst());
        System.out.println("getLast = "+integerLinkedList.getLast());
        System.out.println("peek = "+integerLinkedList.peek());
        System.out.println(integerLinkedList.offerFirst(10));//add first element
        System.out.println(integerLinkedList);
        //LIST ITERATOR
        ListIterator<Integer> listIterator = integerLinkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}
