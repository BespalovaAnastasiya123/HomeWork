package Junit1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число,которое соответствует  типу последовательности:");
        System.out.println("1. последовательность факториалов");
        System.out.println("2. последовательность простых чисел");
        int numberOfSequence = scanner.nextInt();
        int n = 0;
        while(n < 1){
            System.out.println("Введите количество генерируемых элементов последовательности (целое число, которое больше единицы): ");
            n = scanner.nextInt();
        }
        Interface a = new Factorial();
        Interface c = new Simple();
        Interface b;
        switch(numberOfSequence){
            case 1:
                System.out.println("Последовательность факториалов: ");
                b = new Time(a);
                b.doAll(n);
            break;
            case 2:
                System.out.println("Последовательность простых чисел: ");
                b = new Time(c);
                b.doAll(n);
            break;
            default:
                System.out.println("Нет такой последовательности");
                break;
        }


   }
}
