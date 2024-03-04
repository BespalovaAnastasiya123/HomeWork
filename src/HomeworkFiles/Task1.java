package HomeworkFiles;

import java.io.*;
//Имеется текстовый файл. Напечатать:
//а) все его строки, начинающиеся с буквы Т;
public class Task1 {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/Data/test.txt"));
            String line = reader.readLine();

            while(line!=null){
                if(line.charAt(0)=='Т'){
                    System.out.println(line);
                }
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
