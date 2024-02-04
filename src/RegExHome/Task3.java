package RegExHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
//   Выполнить валидацию номера кредитной карты:
//    Visa : 13 или 16 цифр, начиная с 4.
//    MasterCard : 16 цифр, начиная от 51 до 55.
public static void main(String[] args) {
    String number = "Visa: 4567 7865 4585 7855";
    String regex = "^([a-zA-Z]{4}):(\\s[^0-3]{4}){4}$";
    String number2 = "MasterCard: 5152 5253 5354 5455";
    String regex2 = "^([a-zA-Z]{10}):(\\s[51-55]{4}){4}$";
    Pattern nb = Pattern.compile(regex);
    Pattern nb2 = Pattern.compile(regex2);
    Matcher nbreg = nb.matcher(number);
    System.out.println(nbreg.matches());
    Matcher nbreg2 = nb2.matcher(number2);
    System.out.println(nbreg2.matches());

}
}
