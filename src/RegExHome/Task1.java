package RegExHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
   // Выполнить валидацию номера телефона в формате +111 (202) 555-0125
    public static void main(String[] args) {
        String number = "+111 (202) 555-0125";
        String regex = "^(\\+\\d{3}\\s\\(\\d{3}\\)\\s\\d{3}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.matches());
    }
}
