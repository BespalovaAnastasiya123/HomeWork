package HomeworkCar;

import java.util.Comparator;

public class YearOld implements Comparator<Car>{
    @Override
    public int compare(Car a, Car b) {
        return Integer.compare(a.getYear(), b.getYear());
    }
}
