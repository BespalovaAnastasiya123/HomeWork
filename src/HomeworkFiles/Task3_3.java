package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Имеется текстовый файл. Напечатать самую длинную строку. Если таких строк несколько, то напечатать первую из них.
public class Task3_3 {

        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("src/Data/test1.txt"));
                String line;
                int a=0;
                while((line= reader.readLine())!=null){
                    if(line.length()>a){
                        a=line.length();

                    }
                }
                BufferedReader reader1 = new BufferedReader(new FileReader("src/Data/test1.txt"));
                String line1;
                while((line1= reader1.readLine())!=null){
                   if(line1.length()==a){
                        break;
                    }
                }
                System.out.println(line1);
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



