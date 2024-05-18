import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Тема ДЗ Массив 2 часть");

        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        int [] amount = new int[] {340, 690, 439, 1523, 541};
        int total = 0;
        for (final int l1 : amount) {
            total += l1;
        }
        System.out.println("Сумма трат за месяц составила " +total+ " рублей");
        //////////////
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        int[] weeklyExpenses = {87, 64, 34, 78, 2};
        int minExpenses = 0;
        int maxExpenses = 0;
        for (int i = 0; i < weeklyExpenses.length; i++) {
            if (i == 0) {
                minExpenses = weeklyExpenses[i];
            }
            if (minExpenses > weeklyExpenses[i]) {
                minExpenses = weeklyExpenses[i];
            } if (maxExpenses < weeklyExpenses[i]) {
                maxExpenses = weeklyExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +minExpenses+ " рублей. Максимальная сумма трат за неделю составила " +maxExpenses+ " рублей");
        /////////////////
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        int [] amount2 = Arrays.copyOf(amount, amount.length);//{340, 690, 439, 453, 541};
        int total1 = 0;
        for (int i = 0; i < amount2.length; i++) {
            final int l1 = amount[i];
            total1 += l1;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (float) total1 / amount.length + " рублей");
        /////////////////
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}