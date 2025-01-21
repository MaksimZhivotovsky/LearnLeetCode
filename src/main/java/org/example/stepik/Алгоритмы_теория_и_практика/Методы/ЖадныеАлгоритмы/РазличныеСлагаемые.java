package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ЖадныеАлгоритмы;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
По данному числу
1
≤
n
≤
1
0
9
1≤n≤10
9
  найдите максимальное число
k
k, для которого
n
n можно представить как сумму
k
k различных натуральных слагаемых. Выведите в первой строке число
k
k, во второй —
k
k слагаемых.
 */
public class РазличныеСлагаемые {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long k = 0;
        long sum = 0;

        while (sum + (k + 1) <= n) {
            k++;
            sum += k;
        }

        List<Long> summands = new ArrayList<>();
        for (long i = 1; i <= k; i++) {
            summands.add(i);
        }

        long remainder = n - sum;
        if (remainder > 0) {
            summands.set(summands.size() - 1, summands.get(summands.size() - 1) + remainder);
        }

        System.out.println(k);
        for (long summand : summands) {
            System.out.print(summand + " ");
        }

    }
}
