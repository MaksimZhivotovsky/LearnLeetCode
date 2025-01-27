package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Разделяй_и_властвуй;

import java.util.Arrays;
import java.util.Scanner;

/*
Первая строка содержит число
1
≤
n
≤
1
0
4
1≤n≤10
4
 , вторая —
n
n натуральных чисел, не превышающих 10. Выведите упорядоченную по не убыванию
 последовательность этих чисел.
 */

public class СортировкаПодсчётом {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
