package HomeworkCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    // Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
    //Создать массив объектов. Вывести:
    //a) список автомобилей заданной марки;
    //b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
    //c) список автомобилей заданного года выпуска, цена которых больше указанной.
    public static void main(String[] args) {
        Car car1 = new Car("0101", "Reno", "Logan", 1998, "white", 3000);
        Car car2 = new Car("0202", "Ford", "Fusion", 2009, "black", 7000);
        Car car3 = new Car("0303", "Opel", "Astra", 2020, "white", 5000);
        Car car4 = new Car("0404", "Ford", "Focus", 2010, "gray metallic", 9000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.sort(new AlfaBrand());
        System.out.println("1.Bведите бренд автомобиля: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int n =0;
        for (Car car : cars) {
            if (car.getBrand().equals(a)) {
                System.out.println(car.getId()+" "+ car.getModel()+" "+car.getBrand()+" "+car.getYear()+" "+car.getPrice());
                n++;
            }
        }
        if(n==0){
            System.out.println("Автомобили такого бренда в списке отсутствуют.");
        }
        cars.sort(new YearOld());
        System.out.println("2.Укажите период эксплуатации автомобиля: ");
        int yearOld = scanner.nextInt();
        System.out.println("Выведите список автомобилей бренда"+a+", которые эксплуатируются больше  "+yearOld+" лет:");
        for (Car car:cars){
           if(2024-car.getYear() > yearOld){
               System.out.println(car.getId()+" "+ car.getBrand()+" "+car.getModel()+" "+car.getYear()+" "+car.getPrice());
           }
        }
        System.out.println("3.Укажите стоимость автомобиля: ");
        int priceAll = scanner.nextInt();
        System.out.println("Укажите год его выпуска: ");
        int yearCreate = scanner.nextInt();
        int n1 = 0;
        System.out.println("Выведите список автомобилей  " + yearCreate + " года выпуска, цена которых больше " + priceAll+ " USD:");
        for (Car car:cars) {
            if(car.getYear()==yearCreate&&car.getPrice()>priceAll){
                System.out.println(car.getId()+" "+ car.getBrand()+" "+car.getModel()+" "+car.getYear()+" "+car.getPrice());
                n1++;
            }
        }
        if(n1==0){
            System.out.println("Совпадения отсутствуют.");
        }

    }
}
