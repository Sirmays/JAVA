public class Lesson2 {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] ArrOne = {1, 1, 0, 1, 1};
        for (int i = 0; i < ArrOne.length; i++) {
            if (ArrOne[i] == 0) {
                ArrOne[i] = 1;
            } else ArrOne[i] = 0;
            System.out.println("Arr[" + i + "] = " + ArrOne[i]);
        }

        System.out.println();
        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int ArrTwo[] = new int[8];
        for (int i = 0; i < ArrTwo.length; i++) {
            ArrTwo[i] = i * 3;
            System.out.print(ArrTwo[i] + " ");
        }


        System.out.println();
        System.out.println();// почему-то только с двумя такими sout готов сделать отступ в консоли от предыдущего задания

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;

        int ArrThree[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < ArrThree.length; i++) {
            if (ArrThree[i] < 6) ArrThree[i] *= 2;
            System.out.print(ArrThree[i] + " ");
        }

        System.out.println();
        System.out.println();

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int ArrFour[][] = new int[5][5];

        for (int i = 0; i < ArrFour.length; i++) {
            for (int j = 0; j < ArrFour[i].length; j++) {
                if ((i == j) || (i + j == (ArrFour.length - 1))) {
                    ArrFour[i][j] = 1;
                } else {
                    ArrFour[i][j] = 0;
                }
                System.out.print(ArrFour[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //5. ** Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);

        int ArrFive[] = {6, 12, 25, 87, 5, 11, 3, 100, 120, 7, 12, 8, 458, 13, 987, 62, 112};
        int minI = 0;
        for (int i = 1; i < (ArrFive.length); i++) {
            if (ArrFive[minI] > ArrFive[i]) minI = i;
        }
        System.out.println("Минимальное значение из массива: " + ArrFive[minI]);
        int maxI = 0;
        for (int i = 1; i < (ArrFive.length); i++) {
            if (ArrFive[maxI] < ArrFive[i]) {
                maxI = i;
            }
        }
        System.out.println("Максимальное значение из массива: " + ArrFive[maxI]);


        System.out.println();



        int[]values = {0, 1, 2, 3, 4, 5, 6};
        int n = 1;
        moveNumbers(values,n);

    }
    // 7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.

    public static void moveNumbers(int[]values, int n) {
        int j;
        for (int i = 0; i < values.length; i++) {
            j = i - n;
            if (j >= values.length) {
                j = j - values.length;
            }
            if (j < 0) {
                j = j + values.length;
            }
            System.out.print(values[j] + " ");
        }

    }

  }









