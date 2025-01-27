package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Разделяй_и_властвуй;

/*
В первой строке даны целое число
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
A[1…n] из
n
n различных натуральных чисел, не превышающих
1
0
9
10
9
 , в порядке возрастания, во второй — целое число
1
≤
k
≤
1
0
5
1≤k≤10
5
  и
k
k натуральных чисел
b
1
,
…
,
b
k
b
1
​
 ,…,b
k
​
 , не превышающих
1
0
9
10
9
 . Для каждого
i
i от 1 до
k
k необходимо вывести индекс
1
≤
j
≤
n
1≤j≤n, для которого
A
[
j
]
=
b
i
A[j]=b
i
​
 , или
−
1
−1, если такого
j
j нет.
 */
import java.util.Scanner;

public class ДвоичныйПоиск {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int[] B = new int[k];
        for (int i = 0; i < k; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int index = binarySearch(A, B[i]);
            System.out.println(index);
        }

        scanner.close();
    }

    private static int binarySearch(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == target) {
                return mid + 1;
            } else if (A[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
