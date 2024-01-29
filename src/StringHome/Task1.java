package StringHome;

public class Task1 {
    public static void main(String[] args) {
//программа: мрамор, грамм.
        String str = "программа";
        String a = str.substring(3,8);
        System.out.println(a);
        StringBuilder builder = new StringBuilder(str.substring(1,3));
        System.out.println(a.replace('г', 'м').substring(0,4)+builder.reverse());
    }
}
