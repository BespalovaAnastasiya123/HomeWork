package HomeworkCompare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//Создать массив объектов. Вывести:
//a) список абитуриентов, имеющих неудовлетворительные оценки;
//b) список абитуриентов, у которых сумма баллов выше заданной;
//c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов.
public class Abiturients {
    public static void main(String[] args) {
        Abiturient0 abiturient01 = new Abiturient0("001", "Abramov", "Ivan",7, 8, 4);
        Abiturient0 abiturient02 = new Abiturient0("002", "Ulybkin", "Fedor",6, 9, 8);
        Abiturient0 abiturient03 = new Abiturient0("003", "Petrov", "Pavel",2, 4,1);
        Abiturient0 abiturient04 = new Abiturient0("004", "Nikitin", "Petr",4,1,6);

        List<Abiturient0> abiturient0s = new ArrayList<>();
        abiturient0s.add(abiturient01);
        abiturient0s.add(abiturient02);
        abiturient0s.add(abiturient03);
        abiturient0s.add(abiturient04);

        System.out.println("Полный список студентов:");
        for (Abiturient0 abiturient0 : abiturient0s) {
            System.out.println(abiturient0.toString());
        }

        System.out.println("Cписок абитуриентов, имеющих неудовлетворительные оценки 1 и 2:");
        abiturient0s.sort(new NegativeGrade());
        for (Abiturient0 abiturient0 : abiturient0s) {
            if(abiturient0.getGrade1()<3||abiturient0.getGrade2()<3||abiturient0.getGrade3()<3) {
                System.out.println(abiturient0.getSurname() + " " + abiturient0.getName());
            }
        }
        System.out.println("Введите проходную сумму баллов:");
        Scanner scanner = new Scanner(System.in);
        int hiScore = scanner.nextInt();
        System.out.println("Выведите список абитуриентов, у которых сумма баллов выше" +" "+ hiScore);
        abiturient0s.sort(new SumGrade());
           for (Abiturient0 abiturient0: abiturient0s) {
           int sum = abiturient0.getGrade1()+abiturient0.getGrade2()+abiturient0.getGrade3();
           if(sum>hiScore){
               System.out.println(abiturient0.getSurname()+" "+abiturient0.getName()+" "+sum);
           }
        }
        System.out.println("Введите число студентов, которые имеют самую высокую сумму баллов");
           int n = scanner.nextInt();
        System.out.println("Выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов:");
        abiturient0s.sort(new HighSumGrade());
            for (int i = 0; i < n; i++) {
            int sum = abiturient0s.get(i).getGrade1()+abiturient0s.get(i).getGrade2()+abiturient0s.get(i).getGrade3();
            System.out.println(abiturient0s.get(i).getSurname()+" "+abiturient0s.get(i).getName()+" "+sum);
        }
    }
}

