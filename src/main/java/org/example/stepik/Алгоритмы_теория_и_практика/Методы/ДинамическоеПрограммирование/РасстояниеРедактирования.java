package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ДинамическоеПрограммирование;

import java.util.Scanner;

/*
Вычислите расстояние редактирования двух данных непустых строк длины не более
1
0
2
10
2
 , содержащих строчные буквы латинского алфавита.
 */
public class РасстояниеРедактирования {

    public static int calculateEditDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j],    // Удаление
                            Math.min(
                                    dp[i][j - 1], // Вставка
                                    dp[i - 1][j - 1] // Замена
                            )
                    );
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int distance = calculateEditDistance(s1, s2);

        System.out.println(distance);
    }
}
