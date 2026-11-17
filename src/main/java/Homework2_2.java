public class Homework2_2 {

    public static void main(String[] args) {
        // Методы из пунктов 1-14 вызываем здесь для проверки
        System.out.println("--- Задание 1 ---");
        printThreeWords();

        System.out.println("\n--- Задание 2 ---");
        checkSumSign();

        System.out.println("\n--- Задание 3 ---");
        printColor();

        System.out.println("\n--- Задание 4 ---");
        compareNumbers();

        System.out.println("\n--- Задание 5 ---");
        System.out.println("Сумма 5 и 7 в пределах 10-20? " + isSumInRange(5, 7));

        System.out.println("\n--- Задание 6 ---");
        printNumberSign(0);
        printNumberSign(-15);

        System.out.println("\n--- Задание 7 ---");
        System.out.println("Число -5 отрицательное? " + isNegative(-5));

        System.out.println("\n--- Задание 8 ---");
        printStringMultipleTimes("Привет, QA!", 3);

        System.out.println("\n--- Задание 9 ---");
        System.out.println("2024 год високосный? " + isLeapYear(2024));

        System.out.println("\n--- Задание 10 ---");
        invertArray();

        System.out.println("\n--- Задание 11 ---");
        fillArrayWith1To100();

        System.out.println("\n--- Задание 12 ---");
        multiplySmallNumbers();

        System.out.println("\n--- Задание 13 ---");
        createDiagonalMatrix();

        System.out.println("\n--- Задание 14 ---");
        int[] customArray = createCustomArray(5, 99);
        for (int num : customArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 1. Вывод трех слов
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверка суммы
    public static void checkSumSign() {
        int a = 10;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Цвет по числу
    public static void printColor() {
        int value = 101; // Можешь поменять значение для проверки
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Сравнение чисел
    public static void compareNumbers() {
        int a = 5;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Сумма в пределах 10-20
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Положительное или отрицательное (0 считаем положительным)
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    // 7. Возврат true если отрицательное
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Вывод строки N раз
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 9. Високосный год
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Инвертировать массив (0 на 1, 1 на 0)
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i]; // Хитрый математический трюк
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 11. Массив от 1 до 100
    public static void fillArrayWith1To100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Массив заполнен числами от 1 до 100. Размер: " + arr.length);
    }

    // 12. Умножить числа меньше 6 на 2
    public static void multiplySmallNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 13. Квадратный массив с единицами по диагонали
    public static void createDiagonalMatrix() {
        int size = 5; // Размер матрицы 5x5
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Заполняем главную диагональ
        }
        // Вывод матрицы для проверки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14. Массив заданной длины с заданным значением
    public static int[] createCustomArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}