package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Разделяй_и_властвуй;

import java.util.Scanner;

/*
Первая строка содержит число
1
≤
n
≤
1
0
5
1≤n≤10
5
 , вторая — массив
A
[
1
…
n
]
A[1…n], содержащий натуральные числа, не превосходящие
1
0
9
10
9
 . Необходимо посчитать число пар индексов
1
≤
i
<
j
≤
n
1≤i<j≤n, для которых
A
[
i
]
>
A
[
j
]
A[i]>A[j]. (Такая пара элементов называется инверсией массива. Количество инверсий в массиве
является в некотором смысле его мерой неупорядоченности: например, в упорядоченном по
не убыванию массиве инверсий нет вообще, а в массиве, упорядоченном
по убыванию, инверсию образуют каждые два элемента.)
 */

public class ЧислоИнверсий {
    private static long countInversions(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        return mergeSortAndCount(array, 0, array.length - 1);
    }

    private static long mergeSortAndCount(int[] array, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSortAndCount(array, left, mid);
            count += mergeSortAndCount(array, mid + 1, right);
            count += mergeAndCount(array, left, mid, right);
        }
        return count;
    }

    private static long mergeAndCount(int[] array, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        long count = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
                count += (leftArray.length - i);
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long inversionCount = countInversions(array);
        System.out.println(inversionCount);
    }
}
