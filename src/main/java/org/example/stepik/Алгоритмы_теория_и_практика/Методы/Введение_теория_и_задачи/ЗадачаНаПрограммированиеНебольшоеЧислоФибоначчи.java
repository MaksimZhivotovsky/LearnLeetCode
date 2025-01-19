package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Введение_теория_и_задачи;

import java.util.Scanner;

/*
Числа Фибоныччи
Sample Input:
3
Sample Output:
2
 */
public class ЗадачаНаПрограммированиеНебольшоеЧислоФибоначчи {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int result = fibonacci(n);

        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

}
