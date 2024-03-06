package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Имеется текстовый файл. Найти количество строк, начинающихся с букв А или а.
public class Task2_1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Data/test1.txt"));
            String line = reader.readLine();
            int n = 0;
            while (line != null) {
                if (line.charAt(0) == 'А' || line.charAt(0) == 'а') {
                    n++;
                }
                line = reader.readLine();
            }
            reader.close();
            System.out.println(n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




