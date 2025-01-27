package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ДинамическоеПрограммирование;

import java.util.Scanner;

/*

Даны число
1
≤
n
≤
1
0
2
1≤n≤10
2
  ступенек лестницы и целые числа
−
1
0
4
≤
a
1
,
…
,
a
n
≤
1
0
4
−10
4
 ≤a
1
​
 ,…,a
n
​
 ≤10
4
 , которыми помечены ступеньки. Найдите максимальную сумму, которую можно получить,
 идя по лестнице снизу вверх (от нулевой до
n
n-й ступеньки), каждый раз поднимаясь на одну или две ступеньки.
 */
public class Лестница {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = a[1];

        for (int i = 2; i <= n; i++) {
            dp[i] = a[i] + Math.max(dp[i - 1], dp[i - 2]);
        }

        System.out.println(dp[n]);
    }
}
