import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printResult(calcThawLength(getTempFromUser()));
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

    public static int calcThawLength(int[] tempList) {
        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i] > 0) {
                count++;
                if (i == tempList.length - 1 && count > maxLength) {
                    maxLength = count;
                }


            } else {
                if (count > maxLength) {
                    maxLength = count;
                }
                count = 0;
            }
        }
        return maxLength;
    }

    public static void printResult(int result) {
        System.out.println("Количество дней самой продолжительной оттепели составило " + result);
    }
}


