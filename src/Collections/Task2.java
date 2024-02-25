package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<PriorityQueue<String>>list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            PriorityQueue<String> queue = new PriorityQueue<>();
            for (int j = 0; j < 5; j++) {
                queue.add(String.format("string %d", i*5+j));
            }
            list.add(queue);
        }
        PriorityQueue<String> queue = list.get(0);
        queue.remove("string 4");
        queue.add("Start");



        for (int i = 0; i < list.size(); i++) {
            queue = list.get(i);
            while(!queue.isEmpty()){
                String s = queue.poll();
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
