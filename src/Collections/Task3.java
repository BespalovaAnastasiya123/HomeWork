package Collections;

import java.util.LinkedList;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Stack<LinkedList<String>> stack = new Stack<>();
        for (int i = 0; i < 3; i++) {
            LinkedList<String> list = new LinkedList<>();
            for (int j = 0; j < 5; j++) {
                list.add(String.format("string %d", i*5+j));
            }
            stack.add(list);
        }
        LinkedList<String>list = stack.get(2);
        list.addLast("Finish");
        LinkedList<String>list1 = stack.get(0);
        list1.addFirst("Start");


        for (LinkedList<String> strings : stack) {
            list = strings;
            while (!list.isEmpty()) {
                String s = list.pop();
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
