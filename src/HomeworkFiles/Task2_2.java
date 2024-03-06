package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Имеется текстовый файл. Найти количество строк, в которых имеется ровно 5 букв "и".
public class Task2_2 {
    public static void main(String[] args) {
        try {
            BufferedReader bd = new BufferedReader(new FileReader("src/Data/test1.txt"));
            String line;
            int m=0;
            while((line=bd.readLine())!=null){
                int n=0;
                for (char a:line.toCharArray()) {
                   if(a=='и'){
                       n++;
                   }
               }
                if(n==5){
                    m++;
                }
            }
            System.out.println(m);
            bd.close();

            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
