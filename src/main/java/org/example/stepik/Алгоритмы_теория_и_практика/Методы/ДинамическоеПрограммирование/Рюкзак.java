package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ДинамическоеПрограммирование;

import java.util.Scanner;

/*
Первая строка входа содержит целые числа
1
≤
W
≤
1
0
4
1≤W≤10
4
  и
1
≤
n
≤
300
1≤n≤300 — вместимость рюкзака и число золотых слитков. Следующая строка содержит
n
n целых чисел
0
≤
w
1
,
…
,
w
n
≤
1
0
5
0≤w
1
​
 ,…,w
n
​
 ≤10
5
 , задающих веса слитков. Найдите максимальный вес золота, который можно унести в рюкзаке.
 */
public class Рюкзак {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int[] dp = new int[W + 1];

        for (int i = 0; i < n; i++) {
            for (int w = W; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weights[i]] + weights[i]);
            }
        }

        System.out.println(dp[W]);
    }
}
