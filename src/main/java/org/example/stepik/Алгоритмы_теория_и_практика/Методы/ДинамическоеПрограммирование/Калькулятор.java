package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ДинамическоеПрограммирование;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
У вас есть примитивный калькулятор, который умеет выполнять всего три операции с текущим числом
x
x: заменить
x
x на
2
x
2x,
3
x
3x или
x
+
1
x+1. По данному целому числу
1
≤
n
≤
1
0
5
1≤n≤10
5
  определите минимальное число операций
k
k, необходимое, чтобы получить
n
n из 1. Выведите
k
k и последовательность промежуточных чисел.
 */
public class Калькулятор {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        List<Integer> sequence = new ArrayList<>();
        while (n >= 1) {
            sequence.add(n);
            if (n == 1) {
                break;
            }
            if (dp[n] == dp[n - 1] + 1) {
                n = n - 1;
            } else if (n % 2 == 0 && dp[n] == dp[n / 2] + 1) {
                n = n / 2;
            } else if (n % 3 == 0 && dp[n] == dp[n / 3] + 1) {
                n = n / 3;
            }
        }

        System.out.println(dp[sequence.get(0)]);
        Collections.reverse(sequence);
        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}
