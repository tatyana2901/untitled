import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calcThawLength(getTempFromUser());
    }

    public static int[] getTempFromUser() {
        System.out.println("Введите количество дней, в которых будет вычисляться оттепель: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tempList = new int[n];
        System.out.println("Введите среднесуточную температуру за каждый день: ");
        for (int i = 0; i < n; i++) {
            tempList[i] = scanner.nextInt();
        }
        return tempList;
    }

    public static void calcThawLength(int[] tempList) {
        int maxLength = 0;
        int count = 0;
        for (int t : tempList) {
            if (t > 0) {
                count++;
            } else {
                if (count > maxLength) {
                    maxLength = count;
                }
                count = 0;
            }
        }
        System.out.println("Количество дней самой продолжительной оттепели составило " + maxLength);
    }
}