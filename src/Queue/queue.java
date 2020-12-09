package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    /**
     * OBJE KOYABİLİRSİN
     **/
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        queue.add('1');
        queue.add('2');
        queue.add('3');
        queue.add('4');
        queue.add('-');
        System.out.println("peek() = " + queue.peek());
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        priorityqueue();

    }

    private static void priorityqueue() {
        System.out.println();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5); //first add 5
        queue.add(4); //second add 4
        queue.add(3); //third add 3
        queue.add(2);
        System.out.println("sorted queue: " + queue.toString());

        PriorityQueue<String> queue1 = new PriorityQueue<>(Collections.reverseOrder(String::indexOf));
        queue1.add("Alperen");
        queue1.add("Betul");
        queue1.add("Asya");
        System.out.println("sorted queue: " + queue1);

    }

}
