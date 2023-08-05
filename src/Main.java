// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Домашнее задание №9");
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 1 ===========");
        System.out.println("============================");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("===== Конец задачи 1 =======");
    }

    private static void task2() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 2 ===========");
        System.out.println("============================");
        int[] arr = generateRandomArray();
        int max = -1;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("===== Конец задачи 2 =======");
    }

    private static void task3() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 3 ===========");
        System.out.println("============================");
        int[] arr = generateRandomArray();
        float sum = 0;
        int days = 30;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        float middleMoney = sum / days;

        System.out.println("Средняя сумма трат за месяц составила " + middleMoney + " рублей");
        System.out.println("===== Конец задачи 3 =======");
    }

    private static void task4() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 4 ===========");
        System.out.println("============================");
        char[] name = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = name.length - 1; i >= 0; i = i - 1) {
            System.out.print(name[i]);
        }
        System.out.println("");
        System.out.println("===== Конец задачи 4 =======");

    }

}






