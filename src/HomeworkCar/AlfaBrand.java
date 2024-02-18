package HomeworkCar;

import java.util.Comparator;

class AlfaBrand implements Comparator<Car> {


    @Override
    public int compare(Car a, Car b) {
        return a.getBrand().compareTo(b.getBrand());
    }
}
