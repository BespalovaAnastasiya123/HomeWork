package Junit1;

public class Simple implements Interface{

    @Override
    public void doAll(int n) {

        boolean value = true;
        if(n< 1){
            value = false;
        }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                value=false;
                break;
            }
        }
        if(value) {
            System.out.println(n);
        }else{
            System.out.println("Число не простое");
        }
    }
}
