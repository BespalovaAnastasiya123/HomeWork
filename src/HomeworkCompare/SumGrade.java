package HomeworkCompare;

import java.util.Comparator;

 class SumGrade implements Comparator<Abiturient0> {
     @Override
     public int compare(Abiturient0 a1, Abiturient0 a2) {
         return a1.getSurname().compareTo(a2.getSurname());
     }
 }
