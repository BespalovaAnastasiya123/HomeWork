package Junit1;

public class Time implements Interface{
    public Interface second;

    public Time(Interface second) {
        this.second = second;

    }

    @Override
    public void doAll(int n) {
        for (int i = 1; i <=n; i++) {
            long start = System.nanoTime();
            System.out.print("Результат последовательности № " + i + " равен  ");
            second.doAll(i);
            long finish = System.nanoTime();
            long elapsed = finish-start;
            System.out.println("Прошло времени, нс: " + elapsed);
        }
    }
}
