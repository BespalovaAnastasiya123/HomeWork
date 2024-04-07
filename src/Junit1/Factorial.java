package Junit1;

public class Factorial implements Interface{

    @Override
    public void doAll(int n) {
        int b=1;
        for (int i = 1; i <= n; i++) {
            b=b*i;
        }
        System.out.println(" " + b);
    }
}
