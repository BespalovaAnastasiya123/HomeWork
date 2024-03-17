package PatternAdapter;

import java.util.Scanner;
//Блок Клиент считывает с экрана введенное пользователем целое число и передает его в клиентский интерфейс.
// Если это число больше того, которое содержиться в клиентской интерфейсе, программа возвращает True, иначе -  False.
//Блок Number содержит целое число.
// Блок Service содержит вещественное число, с которым не может работатьблок Клиент.
//Блок Адаптер должен привести вещественное число к типу int.
public class Client {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ClientInterface client = new ClientInterface(a);
        Number number = new Number(10);
        System.out.println(client.fits(number));

        Service service = new Service(10);
        //System.out.println(client.fits(service));
        Adapter adapter = new Adapter(service);
        System.out.println(client.fits(adapter));

    }

}
