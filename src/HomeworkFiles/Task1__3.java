package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1__3 {

    //Имеется текстовый файл. Напечатать все его строки, в которых имеется более трех пробелов;
        public static void main(String[] args) throws IOException {
            try {
                BufferedReader reader;
                reader = new BufferedReader(new FileReader("src/Data/test1.txt"));
                String line = reader.readLine();
                while (line != null) {
                    int n = 0;
                    for (char a : line.toCharArray()) {
                        if (a == ' ') {
                            n++;
                        }
                    }
                    if (n > 3) {
                        System.out.println(line);
                    }
                    line = reader.readLine();
                }
                reader.close();

            } catch(FileNotFoundException e){
                throw new RuntimeException(e);
            }
        }
    }

