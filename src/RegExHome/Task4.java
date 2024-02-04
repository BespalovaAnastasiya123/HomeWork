package RegExHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
//    Выполнить валидацию личного идентификационного номера РБ:
//3111111E001PB0
public static void main(String[] args) {
    String number = "3111111E001PB0";
    String regex = "\\d{7}\\w{1}\\d{3}\\w{2}\\d{1}";
    Pattern nb = Pattern.compile(regex);
    Matcher numbRex = nb.matcher(number);
    System.out.println(numbRex.matches());
}
}
