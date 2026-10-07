import java.util.Scanner;
//

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = scanner.nextInt();
        System.out.println("Введите числа не превосходящие 100 " + n + " раз");
        int[] c = new int[n];

        for (int i = 0; i < n; ++i) {
            c[i] = scanner.nextInt();
        }

        long[] dp = new long[n + 1];
        dp[0] = 0;

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                long currentProfit = dp[j] + (long) (i - j) * (long) c[i - 1];
                if (currentProfit > dp[i]) {
                    dp[i] = currentProfit;
                }
            }
        }
        System.out.println("Максимальная прибыль: " +dp[n]);


    }
}
// Введите целое число
// 5
//Введите числа не превосходящие 100 5 раз
//73 31 96 24 46
//Максимальная прибыль: 380
//
//Процесс завершен с кодом выхода 0