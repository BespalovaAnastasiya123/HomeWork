package Recursion;

public class Task3 {
    //В кафе есть меню из двух видов блюд на первое, трех - на второе и двух - на третье.
    //Выведите все возможные сочетания заказов из двух или трех блюд. Названия блюд подберите.
    static int n = 7;//количество блюд
    static int[] arr = new int[n];
    static StringBuilder sb = new StringBuilder();
    static String[] names = {"россольник", "куриный суп", "каша", "котлета","рыба", "булочка", "компот"};

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            arr[i] = i;
        }
        combinations(sb, 0);

    }
    private static void combinations(StringBuilder sb, int start){
        if(sb.length()==2&&correct2(sb)){
            int i1 = Integer.parseInt(Character.toString(sb.toString().charAt(0)));
            int i2 = Integer.parseInt(Character.toString(sb.toString().charAt(1)));
            System.out.printf("%s, %s%n", names[i1], names[i2]);
        }
        if (sb.length()==3&&correct3(sb)){
            int y1 = Integer.parseInt(Character.toString(sb.toString().charAt(0)));
            int y2 = Integer.parseInt(Character.toString(sb.toString().charAt(1)));
            int y3 = Integer.parseInt(Character.toString(sb.toString().charAt(2)));
            System.out.printf("%s, %s, %s%n", names[y1], names[y2], names[y3]);
        }
        for (int i = start; i < n; i++) {
            sb.append(arr[i]);
            combinations(sb,i+1);
            sb.delete(sb.length()-1, sb.length());
        }
    }
        private static boolean correct2(StringBuilder sb){
            if(sb.charAt(0)=='0'&& sb.charAt(1)=='1') return false;
            if(sb.charAt(0)=='2'&& sb.charAt(1)=='3') return false;
            if(sb.charAt(0)=='3'&& sb.charAt(1)=='4') return false;
            if(sb.charAt(0)=='5'&& sb.charAt(1)=='6') return false;
            return true;
        }
        private static boolean correct3(StringBuilder sb){
            if(sb.charAt(0)=='0'&& sb.charAt(1)=='1') return false;
            if(sb.charAt(1)=='5'&& sb.charAt(2)=='6') return false;
            if(sb.charAt(0)=='2'&& sb.charAt(1)=='3') return false;
            if(sb.charAt(0)=='2'&& sb.charAt(1)=='4') return false;
            if(sb.charAt(0)=='3'&& sb.charAt(1)=='4') return false;
            if(sb.charAt(0)=='0'&& sb.charAt(1)=='2'&& sb.charAt(2)=='3') return false;
            if(sb.charAt(0)=='0'&& sb.charAt(1)=='2'&& sb.charAt(2)=='4') return false;
            if(sb.charAt(0)=='0'&& sb.charAt(1)=='3'&& sb.charAt(2)=='4') return false;
            if(sb.charAt(0)=='1'&& sb.charAt(1)=='2'&& sb.charAt(2)=='3') return false;
            if(sb.charAt(0)=='1'&& sb.charAt(1)=='2'&& sb.charAt(2)=='4') return false;
            if(sb.charAt(0)=='1'&& sb.charAt(1)=='3'&& sb.charAt(2)=='4') return false;
            return true;
        }
}
