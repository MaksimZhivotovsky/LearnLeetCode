package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Введение_теория_и_задачи;

import java.util.Scanner;

/*
Дано число 1≤n≤10 7, необходимо найти последнюю цифру n n-го числа Фибоначчи.

Как мы помним, числа Фибоначчи растут очень быстро, поэтому при их вычислении нужно быть
аккуратным с переполнением. В данной задаче, впрочем, этой проблемы можно избежать,
поскольку нас интересует только последняя цифра числа Фибоначчи
 */
public class ПоследняяЦифраБольшогоЧислаФибоначчи {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Вычисляем последнюю цифру n-го числа Фибоначчи
        int lastDigit = getFibonacciLastDigit(n);
        System.out.println(lastDigit);
    }

    private static int getFibonacciLastDigit(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int previous = 0; // F(0)
        int current = 1;  // F(1)

        for (int i = 2; i <= n; i++) {
            int newCurrent = (previous + current) % 10; // последняя цифра
            previous = current;
            current = newCurrent;
        }

        return current; // последняя цифра F(n)
    }
}
