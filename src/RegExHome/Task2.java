package RegExHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Выполнить валидацию даты в формате 30.12.2023
public class Task2 {
    public static void main(String[] args) {
        String date = "30.12.2023";
        String regex = "^(\\d{2}\\.\\d{2}\\.\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        System.out.println(matcher.matches());
    }
}
