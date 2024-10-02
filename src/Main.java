import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] a = {12500, 45000, 7862, 14985, 23576};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");

        int[] b = {2568, 7800, 1242, 13465, 2316};

        int min = b[0];
        int max = b[0];

        for (int i : b) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("Максимальные затраты за неделю " + max + " рублей");
        System.out.println("Минимальные затраты за неделю " + min + " рублей");

        System.out.println("Task 3");

        int[] arifMean = {14855, 47586, 32547, 96854, 12645};
        double summ = 0;
        double mean;
        for (int i = 0; i < arifMean.length; i++) {
            summ += arifMean[i];
        }
        mean = summ / arifMean.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}