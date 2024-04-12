public class Painting {

        public static void main(String[] args) {
            int [][] myArray = new int [3][4];

            System.out.println("Step 1:");
            myArray[0][0] = 1;
            myArray[1][3] = 2;
            printArea(myArray);


            System.out.println("Step 2:");
            int n1 = 0;
            int n2 = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (myArray[i][j] == 1 && i < 2){
                        myArray[i][j+1] = 1;
                        myArray[i+1][j] = 1;
                        myArray[i+1][j+1] = 1;
                        n1++;
                        break;
                    }
                }
                if (n1>0){
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (myArray[i][j] == 2 ){
                        myArray[i][j-1] = 2;
                        myArray[i+1][j] = 2;
                        myArray[i+1][j-1] = 2;
                        myArray[i-1][j] = 2;
                        myArray[i-1][j-1] = 2;
                        n2++;
                        break;
                    }
                }
                if (n2>0){
                    break;
                }
            }
            printArea(myArray);


            System.out.println("Step 3:");
            int n3 = 0;
            for (int i = 1; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (myArray[i][j] == 1 && i < 2){
                        myArray[i][j+1] = 1;
                        myArray[i+1][j] = 1;
                        myArray[i+1][j+1] = 1;
                        n3++;
                        break;
                    }
                }
                if (n3>0){
                    break;
                }
            }
            printArea(myArray);

            System.out.println("Number of steps:  "+(n1+n2+n3));
        }

        public static void printArea(int[][] myArray) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(myArray[i][j]);
                }
                System.out.println();
            }
        }
    }



