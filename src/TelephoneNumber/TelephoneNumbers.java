package TelephoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class TelephoneNumbers {
    //    Имеется телефонная книга со списком номеров.
//    Вывести в отсортированном по фамилии порядку номера,
//    начинающиеся на определенную цифру.
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        Number number1 = new Number("Zvanov", "352525");
        Number number2 = new Number("Fetrov", "463636");
        numbers.add(number1);
        numbers.add(number2);


        Collections.sort(numbers);
        for(Number number: numbers)
            System.out.println(number.toString());

    }
}
class Number implements Comparable<Number>{
    private String surname;
    private String phonenumber;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Number(String surname, String phonenumber) {
        this.surname = surname;
        this.phonenumber = phonenumber;
    }


    @Override
    public String toString() {
        return "Number{" +
                "surname='" + surname + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }

    @Override
    public int compareTo(Number number) {
        return this.surname.compareTo(number.surname);
    }
}
