package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        try {
             reader = new BufferedReader(new FileReader("src/Data/test1.txt"));
             String line = reader.readLine();
             while(line!=null){
                 if(line.length()<=30){
                     System.out.println(line);
                 }
                 line = reader.readLine();
             }
             reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
