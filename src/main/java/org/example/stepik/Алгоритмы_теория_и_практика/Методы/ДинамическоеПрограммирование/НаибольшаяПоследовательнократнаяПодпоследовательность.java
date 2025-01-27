package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ДинамическоеПрограммирование;

import java.util.Scanner;

/*
Дано целое число
1
≤
n
≤
1
0
3
1≤n≤10
3
  и массив
A
[
1
…
n
]
A[1…n] натуральных чисел, не превосходящих
2
⋅
1
0
9
2⋅10
9
 . Выведите максимальное
1
≤
k
≤
n
1≤k≤n, для которого найдётся подпоследовательность
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
 ≤n длины
k
k, в которой каждый элемент делится на предыдущий (формально: для  всех
1
≤
j
<
k
1≤j<k,
A
[
i
j
]
∣
A
[
i
j
+
1
]
A[i
j
​
 ]∣A[i
j+1
​
 ]).
 */

public class НаибольшаяПоследовательнократнаяПодпоследовательность {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] A = new long[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextLong();
        }

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] % A[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        System.out.println(maxLength);

        scanner.close();
    }
}
