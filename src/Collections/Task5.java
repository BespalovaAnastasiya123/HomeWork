package Collections;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
       HashMap<Integer, LinkedList<String>> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            LinkedList<String>list = new LinkedList<>();
            for (int j = 0; j < 5; j++) {
                list.add(String.format("string %d",i*5+j));
            }
            map.put(i,list);
        }
        LinkedList<String>list = map.get(1);
        list.addLast("Continue");
        list.addFirst("Nothing special");
        list.pollFirst();

        for (int i = 0; i < map.size(); i++) {
           list = map.get(i);
           while(!list.isEmpty()){
               String s = list.pop();
               System.out.print(s +" ");
           }
            System.out.println();
        }
    }
}
