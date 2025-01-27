package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ДинамическоеПрограммирование;

import java.util.Arrays;
import java.util.Scanner;

/*
Дано целое число
1
≤
n
≤
1
0
5
1≤n≤10
5
 и массив
A
[
1
…
n
]
A[1…n], содержащий неотрицательные целые числа, не превосходящие
1
0
9
10
9
 . Найдите наибольшую невозрастающую подпоследовательность в
A
A. В первой строке выведите её длину
k
k, во второй — её индексы
1
≤
i
1
<
i
2
<
…
<
i
k
≤
n
1≤i
1
​
 <i
2
​
 <…<i
k
​
 ≤n (таким образом,
A
[
i
1
]
≥
A
[
i
2
]
≥
…
≥
A
[
i
n
]
A[i
1
​
 ]≥A[i
2
​
 ]≥…≥A[i
n
​
 ]).
 */

public class НаибольшаяНевозрастающаяПодпоследовательность {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(prev, -1);

        int len = 0;

        for (int i = 0; i < n; i++) {
            int low = 0, high = len;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (A[dp[mid]] >= A[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            if (low == len) {
                len++;
            }
            dp[low] = i;
            if (low > 0) {
                prev[i] = dp[low - 1];
            }
        }

        int[] result = new int[len];
        int index = dp[len - 1];
        for (int i = len - 1; i >= 0; i--) {
            result[i] = index + 1; // +1 для перевода в 1-индексацию
            index = prev[index];
        }

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
