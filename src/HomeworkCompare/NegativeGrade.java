package HomeworkCompare;

import java.util.Comparator;

class NegativeGrade implements Comparator<Abiturient0> {

    @Override
    public int compare(Abiturient0 a, Abiturient0 b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}