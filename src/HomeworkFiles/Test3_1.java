package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Имеется текстовый файл. Найти длину самой длинной строки.
public class Test3_1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Data/test1.txt"));
            String line;
            int a = 0;
            while((line= reader.readLine())!=null){
                if(line.length()>a){
                   a=line.length();
               }
            }
            System.out.println(a);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
