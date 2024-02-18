package HomeworkCompare;

import java.util.Comparator;

public class HighSumGrade implements Comparator<Abiturient0> {
    @Override
    public int compare(Abiturient0 a1, Abiturient0 a2) {

        return Integer.compare(a2.getSumGrade(), a1.getSumGrade());
    }
}
