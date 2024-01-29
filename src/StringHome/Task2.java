package StringHome;


public class Task2 {
    public static void main(String[] args) {
//        Дано предложение.
//1. Все его символы, стоящие на четных местах, заменить буквой ы.
        StringBuilder builder = new StringBuilder("В добрый путь!");
        for (int i = 0; i < builder.length(); i++) {
            if (i % 2 == 0) {
                builder.setCharAt(i, 'ы');
            }
        }
        System.out.println(builder);
    }
}

