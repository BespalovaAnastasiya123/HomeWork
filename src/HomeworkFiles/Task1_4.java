package HomeworkFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Имеется текстовый файл. Напечатать: все его строки, содержащие в качестве фрагмента заданный текст.
public class Task1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/Data/test1.txt"));
        String line;
        try {
            System.out.println("Введите заданный фрагмент:");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            while ((line = br.readLine())!=null){
                if(line.contains(a)){
                    System.out.println(line);
                }
            }
            System.out.println("Фрагмент не найден");

            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
