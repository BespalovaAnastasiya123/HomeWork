package Recursion;
//Дан массив целых чисел, в котором каждый элемент равен его индексу, например [0,1,2].
//Вывести все перестановки его n элементов, в которых элементы a и b не соседствуют.

public class Task1 {

        public static void main(String[] args) {
            int n = 3; // количество элементов в массиве
            int[] array = new int[n];

            // заполняем массив значениями равными его индексу
            for (int i = 0; i < n; i++) {
                array[i] = i;
            }

            // вызываем рекурсивную функцию для генерации перестановок
            generatePermutations(array, 0);
        }

        public static void generatePermutations(int[] array, int index) {
            if (index == array.length) { // базовый случай, достигнуто последнее число в массиве
                // проверка условия, что элементы a и b не соседствуют
                if (!areAdjacent(array)) {
                    // выводим текущую перестановку

                    for (int num : array) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            } else {
                // рекурсивно генерируем перестановки для оставшихся чисел
                for (int i = index; i < array.length; i++) {
                    // меняем текущий элемент с элементом по текущему индексу
                    swap(array, index, i);
                    // вызываем рекурсивную функцию для генерации перестановок для оставшихся чисел
                    generatePermutations(array, index + 1);
                    // меняем элементы обратно для генерации других перестановок
                    swap(array, index, i);
                }
            }
        }

        public static void swap(int[] array, int a, int b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }

        public static boolean areAdjacent(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (Math.abs(array[i] - array[i+1]) == 1) {
                    return true;
                }
            }
            return false;
        }
    }
