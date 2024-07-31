package Lesson_1;

public class HM1 {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        printThreeWords();

        // Task 2
        System.out.println("Task 2");
        checkSumSign();

        // Task 3
        System.out.println("Task 3");
        printColor();

        // Task 4
        System.out.println("Task 4");
        compareNumbers();

        // Task 5
        System.out.println("Task 5");
        System.out.println(isSumIn20to20Range(8, 12));
        System.out.println();

        // Task 6
        System.out.println("Task 6");
        checkPositivity(6);
        System.out.println();

        // Task 7
        System.out.println("Task 7");
        System.out.println(isNegative(-5));
        System.out.println();

        // Task 8
        System.out.println("Task 8");
        print("String", 5);
        System.out.println();

        // Task 9
        System.out.println("Task 9");
        System.out.println(isLeapYear(2005));
        System.out.println();

        // Task 10
        System.out.println("Task 10");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swapZeroAndOne(array);
        System.out.println();
        System.out.println();

        // Task 11
        System.out.println("Task 11");
        fillArrayWithNumbers(100);
        System.out.println();
        System.out.println();

        // Task 12
        System.out.println("Task 12");
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyNumbersLessThanSix(numbers);
        System.out.println();

        // Task 13
        System.out.println("Task 13");
        createDiagonalArray(5);
        System.out.println();

        // Task 14
        System.out.println("Task 14");
        int[] newArray = createArray(5, 10);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign() {
        int a = 10, b = -10;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();
    }

    public static void printColor() {
        int value = 33;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
        System.out.println();
    }

    public static void compareNumbers() {
        int a = 3, b = 6;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
        System.out.println();
    }

    public static boolean isSumIn20to20Range(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositivity(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static void print(String str, int amount) {
        for (int i = 0; i < amount; ++i) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void swapZeroAndOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void fillArrayWithNumbers(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static void multiplyNumbersLessThanSix(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = 2;
            }
        }
        System.out.print("Измененный массив: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void createDiagonalArray(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
