package StringHome;

public class Task3{
        public static void main(String[] args) {
//        Задача 3. Программа должна обрабатывать все строки, подобные указанным.
//1. Из пути файла в Windows извлечь каталог, краткое имя и расширение.
///etc/samba/smb.conf
            String path = "/etc/samba/smb.conf";
            int index1 = path.indexOf("/", 1);
            int index2 = path.indexOf("/", index1+1);
            int index3 = path.indexOf(".");
            String first = path.substring(index1+1,index2);
            System.out.println(first);
            String second = path.substring(index2+1,index3);
            System.out.println(second);
            String last = path.substring(index3+1);
            System.out.println(last);
        }
    }
